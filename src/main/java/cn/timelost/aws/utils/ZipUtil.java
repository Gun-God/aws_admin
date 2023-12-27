package cn.timelost.aws.utils;

import cn.timelost.aws.entity.AwsDownloadLog;
import cn.timelost.aws.mapper.AwsDownloadLogMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

@Slf4j
@Component
public class ZipUtil {


    @Autowired
    private AwsDownloadLogMapper awsDownloadLogMapper;
    private static ZipUtil zipUtil;
    @PostConstruct
    public void init() {
        zipUtil = this;
        zipUtil.awsDownloadLogMapper= this.awsDownloadLogMapper;
    }


    /**
     * 批量打包
     * @param fileNames 待下载的文件们的文件名
     * @param fileSavePath 将zip包保存的文件目录位置
     * @return zip文件保存绝对路径
     */
    public static String createZipAndReturnPath(List<String> fileNames, String fileSavePath) {

        try {
            if (CollectionUtils.isEmpty(fileNames) || StringUtils.isBlank(fileSavePath)) {
                log.error("选中的文件名或待保存位置为空，fileNames,fileSavePath:{},{}",fileNames,fileSavePath);
                return "";
            }
            //生成打包下载后的zip文件:final.fa.zip
            String papersZipName = "final.fa.zip";
            //zip文件保存路径
            String zipPath = fileSavePath + File.separator + papersZipName;
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipPath));
            //遍历文件写入zip包中
            for (String fileName : fileNames) {
                //获得下载文件完整路径
                String downloadPath = fileSavePath + File.separator + fileName;
                //为每个文件命名
                FileInputStream fis = new FileInputStream(downloadPath);
                out.putNextEntry(new ZipEntry(fileName));
                //写入压缩包
                byte[] buffer = new byte[1024*1024];
                int i = fis.read(buffer);
                while (i != -1) {
                    out.write(buffer, 0, i);
                    i = fis.read(buffer);
                }
                out.closeEntry();
                fis.close();
            }
            out.flush();
            out.close();
            return zipPath;
        } catch (Exception e) {
            log.error("批量下载写入zip压缩包时出现错误，e:",e);
            return "";
        }
    }

    /**
     * 压缩成ZIP 方法2  【不支持文件夹压缩】
     * @param srcFilesPath 需要压缩的文件路径列表列表(具体文件完全路径)
     * @param savePath           压缩文件保存位置(例：C:\Users\test.zip)
     * @param compressionLevel   文件压缩级别，0-9 整型数字越大，压缩越严重
     * @return  String   将压缩文件保存位置返回
     */
    public static String toZip(List<String> srcFilesPath , String savePath, int compressionLevel, AwsDownloadLog adll){
        long start = System.currentTimeMillis();
        ZipOutputStream zos = null ;
        try {
            zos = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(new File(savePath))));
            zos.setLevel(compressionLevel);
            byte[] buf = new byte[1024 * 1024];
            int k=0;

            for (String srcFile : srcFilesPath) {
                k++;
                zos.putNextEntry(new ZipEntry(srcFile.substring(srcFile.lastIndexOf(File.separator) + 1)));
                int len;
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
                while ((len = in.read(buf)) != -1){
                    zos.write(buf, 0, len);
                }
                adll.setPercent(Double.valueOf((double)k/(double)srcFilesPath.size()));
                zipUtil.awsDownloadLogMapper.update(adll, new QueryWrapper<AwsDownloadLog>().eq("id",adll.getId()));
                System.out.println("压缩进度："+k+"/"+srcFilesPath.size());
                zos.closeEntry();
                in.close();
            }
            long end = System.currentTimeMillis();

            adll.setState(1);
            zipUtil.awsDownloadLogMapper.update(adll, new QueryWrapper<AwsDownloadLog>().eq("id",adll.getId()));

            log.info("压缩完成，耗时：{}", end - start);
        } catch (Exception e) {
            log.error("压缩文件时发生异常，e:", e);
            throw new RuntimeException("文件打包发生异常：" + e.getMessage());
        }finally{
            if(zos != null){
                try {
                    zos.close();
                } catch (IOException e) {
                    log.error("文件压缩流关闭异常，e：", e);
                }
            }
        }
        return savePath;
    }

    /**
     * 文件夹压缩成ZIP
     * @param srcDir 压缩文件夹路径 /data/test
     * @param outZipPath    压缩文件保存全路径 /data/aaa.zip
     * @param compressionLevel   文件压缩级别，0-9 数字越大，压缩越严重
     * @param KeepDirStructure  是否保留原来的目录结构,
     *							true:保留目录结构;
     *                          false:所有文件跑到压缩包根目录下(注意：不保留目录结构可能会出现同名文件,会压缩失败)
     */
    public static void folderToZip(String srcDir, String outZipPath, int compressionLevel, boolean KeepDirStructure){
        long start = System.currentTimeMillis();
        ZipOutputStream zos = null ;
        try {
            zos = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(new File(outZipPath))));
            zos.setLevel(compressionLevel);
            File sourceFile = new File(srcDir);
            if (!sourceFile.exists() && !sourceFile.isDirectory()) {
                log.error("该文件夹不存在不允许压缩，srcDir:{}", srcDir);
                throw new RuntimeException("压缩数据不存在");
            }
            compress(sourceFile,zos,sourceFile.getName(),KeepDirStructure);
            long end = System.currentTimeMillis();
            log.info("压缩完成，耗时：{}", end - start);
        } catch (Exception e) {
            log.error("文件夹压缩zip失败,e:", e);
            throw new RuntimeException("文件夹压缩zip失败:" + e.getMessage());
        }finally{
            if(zos != null){
                try {
                    zos.close();
                } catch (IOException e) {
                    log.error("文件夹压缩zip关闭流失败,e:", e);
                }
            }
        }
    }

    /**
     * 递归压缩方法
     * @param sourceFile 源文件
     * @param zos        zip输出流
     * @param name       压缩后的名称
     * @param KeepDirStructure  是否保留原来的目录结构,
     *                          true:保留目录结构;
     *                          false:所有文件跑到压缩包根目录下(注意：不保留目录结构可能会出现同名文件,会压缩失败)
     * @throws Exception
     */
    private static void compress(File sourceFile, ZipOutputStream zos, String name,
                                 boolean KeepDirStructure) throws Exception{
        byte[] buf = new byte[1024 * 1024];
        if(sourceFile.isFile()){
            // 向zip输出流中添加一个zip实体，构造器中name为zip实体的文件的名字
            zos.putNextEntry(new ZipEntry(name));
            // copy文件到zip输出流中
            int len;
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(sourceFile));
            while ((len = in.read(buf)) != -1){
                zos.write(buf, 0, len);
            }
            zos.closeEntry();
            in.close();
        } else {
            File[] listFiles = sourceFile.listFiles();
            if(listFiles == null || listFiles.length == 0){
                // 需要保留原来的文件结构时,需要对空文件夹进行处理
                if(KeepDirStructure){
                    // 空文件夹的处理
                    zos.putNextEntry(new ZipEntry(name + "/"));
                    // 没有文件，不需要文件的copy
                    zos.closeEntry();
                }
            }else {
                for (File file : listFiles) {
                    // 判断是否需要保留原来的文件结构
                    if (KeepDirStructure) {
                        // 注意：file.getName()前面需要带上父文件夹的名字加一斜杠,
                        // 不然最后压缩包中就不能保留原来的文件结构,即：所有文件都跑到压缩包根目录下了
                        compress(file, zos, name + "/" + file.getName(),KeepDirStructure);
                    } else {
                        compress(file, zos, file.getName(),KeepDirStructure);
                    }
                }
            }
        }
    }

    /**
     * 解压缩指定文件到目标目录
     * @param zipFile 待解压文件
     * @param descDir  解压至目标目录
     * @throws IOException
     */
    public static void unZipFiles(File zipFile, String descDir) throws IOException {

        ZipFile zip = new ZipFile(zipFile, Charset.forName("GBK"));
        String name = zip.getName().substring(zip.getName().lastIndexOf(File.separator)+1, zip.getName().lastIndexOf('.'));

        File pathFile = new File(descDir,name);
        if (!pathFile.exists()) {
            pathFile.mkdirs();
        }

        for (Enumeration<? extends ZipEntry> entries = zip.entries(); entries.hasMoreElements();) {
            ZipEntry entry = (ZipEntry) entries.nextElement();
            String zipEntryName = entry.getName();
            InputStream in = zip.getInputStream(entry);
            String outPath = (descDir + File.separator + zipEntryName);

            // 判断路径是否存在,不存在则创建文件路径
            File file = new File(outPath.substring(0, outPath.lastIndexOf("/")));
            if (!file.exists()) {
                file.mkdirs();
            }
            // 判断文件全路径是否为文件夹,如果是上面已经上传,不需要解压
            if (new File(outPath).isDirectory()) {
                continue;
            }

            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outPath));
            byte[] buf1 = new byte[1024];
            int len;
            while ((len = in.read(buf1)) > 0) {
                out.write(buf1, 0, len);
            }
            in.close();
            out.close();
        }
        log.info("******************解压完毕********************");
    }

//}

    /**
     * 解压缩指定文件到目标目录并返回解压缩后文件/文件夹名，如果是文件夹压缩的则以压缩文件名为跟目录并返回，如果是单文件压缩则以压缩前原始文件名为名
     * @param zipFile 待解压文件
     * @param descDir  解压至目标目录
     * @return String 解压后的文件名
     */
    public static String unZipFilesAndReturnName(File zipFile, String descDir) {
        ZipFile zip = null;
        InputStream in = null;
        BufferedOutputStream out = null;
        String finalName = null;
        String outPath;
        int i = 0;
        try {
            zip = new ZipFile(zipFile, Charset.forName("GBK"));
            for (Enumeration<? extends ZipEntry> entries = zip.entries(); entries.hasMoreElements(); ) {
                ZipEntry entry = entries.nextElement();
                String zipEntryName = entry.getName();
                if (i == 0) {
                    if (zip.size() > 1) {
                        finalName = zipFile.getName().substring(0, zipFile.getName().lastIndexOf("."));
                        outPath = descDir + File.separator + finalName;
                    } else {
                        finalName = zipEntryName;
                        outPath = descDir + File.separator + zipEntryName;
                    }
                    i++;
                } else {
                    zipEntryName = zipEntryName.substring(zipEntryName.indexOf("/"));
                    outPath = (descDir + File.separator + finalName + File.separator + zipEntryName);
                }
                in = zip.getInputStream(entry);
                if (entry.isDirectory()) {
                    File file = new File(outPath);
                    if (!file.exists()) {
                        if (!file.mkdirs()) {
                            log.error("Directory creation failed.");
                        }
                        continue;
                    }
                }
                out = new BufferedOutputStream(new FileOutputStream(outPath));
                byte[] buf1 = new byte[1024];
                int len;
                while ((len = in.read(buf1)) > 0) {
                    out.write(buf1, 0, len);
                    out.flush();
                }
            }
            log.info("******************解压完毕********************");
            return finalName;
        } catch (IOException e) {
            log.error("解压文件夹发生异常，e:", e);
            throw new RuntimeException("解压文件发生异常:" + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    //静默处理
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
            if (zip != null) {
                try {
                    zip.close();
                } catch (IOException e) {
                }
            }
        }

    }


    public  static void main(String[] args) {

        List<String> fileList = new ArrayList<String>();
        String filePath1 = "F:\\pic\\鄂A3L27L\\20231102152447.jpg";
        String filePath2 = "F:\\pic\\鄂A3Q8E5\\20231102145917.jpg";
        String filePath3 = "F:\\pic\\鄂A3W6F2\\20231102153522.jpg";
        String filePath4 = "F:\\pic\\鄂A60LB5\\20231102145200.jpg";
        fileList.add(filePath1);
        fileList.add(filePath2);
        fileList.add(filePath3);
        fileList.add(filePath4);

        //toZip(fileList,"F:\\pic\\test.zip",0);
    }

}
