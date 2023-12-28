package cn.timelost.aws.utils;

import cn.timelost.aws.entity.AwsDownloadLog;
import cn.timelost.aws.entity.vo.ExportExcelField;
import cn.timelost.aws.entity.vo.ExportExcelSheet;
import cn.timelost.aws.mapper.AwsDownloadLogMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.Entry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class ExcelUtils {
    // 字体
    private static final String FONT_STYLE_CALIBRI = "Calibri";

    // 边框类型
    private static final int BORD_MID= 0;
    private static final int BORD_LEFT = 1;
    private static final int BORD_RIGHT = 2;
    private static final int BORD_ALL = 3;

    // 默认参数
    private static final short DEFAULT_COLUMN_WIDTH = 10*1;
    private static final short DEFAULT_ROW_HEIGHT = (short) (15*20);

    // 自动调整列宽
    private static final boolean AOTU_CLOUMN_WIDTH = true;

    @Autowired
    private AwsDownloadLogMapper awsDownloadLogMapper;
    private static ExcelUtils excelUtils;
    @PostConstruct
    public void init() {
        excelUtils=this;
        excelUtils.awsDownloadLogMapper=this.awsDownloadLogMapper;
    }


    /**
     * 通过数据列表和类对象，获取一个简单表头的XSSFworkbook对象(单sheet，且无递归情况)
     * @param dataList 数据列表
     * @param annotatedClass 有ExportExcelSheet注解
     * @return XSSFWorkbook对象
     */
    public static XSSFWorkbook getSimpleXSSFWorkbook(List dataList, Class annotatedClass, AwsDownloadLog adll) {
        // 1. 一些基础操作
        Map cglab=new HashMap();
        //创建一个Excel
        XSSFWorkbook wb = new XSSFWorkbook();

        //ExportExcelSheet注解里存放了sheet名
        ExportExcelSheet excelSheet= (ExportExcelSheet)annotatedClass.getAnnotation(ExportExcelSheet.class);
        //excelSheet.value()获取sheet名然后设置sheet名
        XSSFSheet sheet;
        if (excelSheet != null){
            sheet = wb.createSheet(excelSheet.value());
        }else {
            return null;
        }

        //设置默认的列宽和行高（注意该方法传的值不要*256）
        sheet.setDefaultColumnWidth(DEFAULT_COLUMN_WIDTH);
        // 设置前两行冻结
        sheet.createFreezePane(0,2,0,2);

        // 定义一个存放类的栈
        List<Class> classList=new ArrayList();
        // 定义一个存放每个类开始位置
        List<Integer> classListHeadIndex=new ArrayList();
        classList.add(annotatedClass);
        classListHeadIndex.add(0);

        // 2. 获取所有需要导出的列
        // 2.1 获取要导出列的所有字段
        Field[] fields = annotatedClass.getDeclaredFields();
        List<Field> exportFields = new LinkedList<>();
        // 2.2 将其中有ExportExcelField注解的字段取出并按order顺序从小到大排序
        for (Field field : fields) {
            ExportExcelField excelField = field.getAnnotation(ExportExcelField.class);
            if (excelField != null) {
                exportFields.add(field);
            }
        }
        if (exportFields.size() > 0){
            exportFields.sort((o1, o2) -> {
                ExportExcelField excelField1 = o1.getAnnotation(ExportExcelField.class);
                ExportExcelField excelField2 = o2.getAnnotation(ExportExcelField.class);
                return excelField1.order() - excelField2.order();
            });
        }else {
            return null;
        }
        // 2.3 创建一个记录每列记录的最大长度的列表，从表头开始记录长度
        List<Integer> widthList = new ArrayList();
        // 2.4 注解里每列允许的最大列宽
        List<Integer> maxWidthList = new ArrayList();
        // 2.5 注解里每列是否允许自动适应列宽
        List<Boolean> autoSizedList = new ArrayList<>();

        // 3. 构造表
        // 3.1 创建第一行
        XSSFRow firstRow = sheet.createRow(0);
        firstRow.setHeight(DEFAULT_ROW_HEIGHT);
        for (int i = 0; i < exportFields.size(); i++){
            XSSFCell cell = firstRow.createCell(i);
            int bordType = BORD_MID;
            if (1 == exportFields.size()){
                bordType = BORD_ALL;
            }else if (i == 0){
                bordType = BORD_LEFT;
            }else if(i == exportFields.size()-1){
                bordType = BORD_RIGHT;
            }
            setFirstRowStyle(cell,wb,bordType);
        }

        // 3.2 创建表头（第二行）
        XSSFRow headRow = sheet.createRow(1);
        headRow.setHeight(DEFAULT_ROW_HEIGHT);
        XSSFCellStyle headStyle = createHeadStyle(wb);
        for (int i = 0; i < exportFields.size(); i++) {
            XSSFCell cell = headRow.createCell(i);
            ExportExcelField exportExcelField = exportFields.get(i).getAnnotation(ExportExcelField.class);
            cell.setCellValue(exportExcelField.title());
            maxWidthList.add(exportExcelField.maxWidth());
            autoSizedList.add(exportExcelField.autoSized());
            widthList.add(Math.max(exportExcelField.title().getBytes().length, DEFAULT_COLUMN_WIDTH));
            setCellStyle(cell, headStyle);
        }

        // 3.3 创建主体内容（第三-N行）
        XSSFCellStyle bodyStyle = createBodyStyle(wb);
        for (int i = 0; null != dataList && i < dataList.size(); i++) {
            XSSFRow row = sheet.createRow(i + 2);
            row.getCTRow().setCustomHeight(false);
            Object dataObject = dataList.get(i);
            for (int j = 0; j < exportFields.size(); j++) {
                XSSFCell cell = row.createCell(j);
                Object value = getFieldValueByFieldName(exportFields.get(j).getName(), dataObject);
                int valueLength = setValue(cell, value);
                assert value != null;
                setCellStyle(cell, bodyStyle);
                if (valueLength > widthList.get(j)){
                    widthList.set(j, Math.min(valueLength, maxWidthList.get(j)));
                }
            }

            adll.setPercent(Double.valueOf((double)(i+1)/(double)dataList.size()));
            excelUtils.awsDownloadLogMapper.update(adll, new QueryWrapper<AwsDownloadLog>().eq("id",adll.getId()));

            System.out.println("Excel进度"+(i+1)+"/"+ dataList.size());

        }

        if (AOTU_CLOUMN_WIDTH){
            setAutoSizeColumn(sheet, widthList, autoSizedList);
        }
        return wb;
    }

    /**
     * 设置第一行单元格样式
     * 边框：整体第一行的外边缘有边框
     * 填充: 灰色
     * @param bordType 边框类型，0-中间，1-最左，2-最右
     */
    private static void setFirstRowStyle(XSSFCell xssfCell, XSSFWorkbook workBook, Integer bordType){
        XSSFCellStyle style = workBook.createCellStyle();

        // 设置背景颜色(灰色)
        byte[] colorRgb = { (byte)219, (byte)219, (byte)219 };
        XSSFColor xssfColor = new XSSFColor(colorRgb, new DefaultIndexedColorMap());
        xssfColor.setRGB(colorRgb);
        style.setFillForegroundColor(xssfColor);
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        switch (bordType){
            case 0:
                // 中间位置的单元格，上下有边框，左右无边框
                style.setBorderTop(BorderStyle.THIN);
                style.setBorderBottom(BorderStyle.THIN);
                style.setBorderLeft(BorderStyle.NONE);
                style.setBorderRight(BorderStyle.NONE);
                break;
            case 1:
                // 最左位置的单元格，右侧无边框，其他三侧有边框
                style.setBorderTop(BorderStyle.THIN);
                style.setBorderBottom(BorderStyle.THIN);
                style.setBorderLeft(BorderStyle.THIN);
                style.setBorderRight(BorderStyle.NONE);
                break;
            case 2:
                // 最右位置的单元格，左侧无边框，其他三侧有边框
                style.setBorderTop(BorderStyle.THIN);
                style.setBorderBottom(BorderStyle.THIN);
                style.setBorderLeft(BorderStyle.NONE);
                style.setBorderRight(BorderStyle.THIN);
                break;
            default:
                // 极端情况全边框
                style.setBorderTop(BorderStyle.THIN);
                style.setBorderBottom(BorderStyle.THIN);
                style.setBorderLeft(BorderStyle.THIN);
                style.setBorderRight(BorderStyle.THIN);
        }

        xssfCell.setCellStyle(style);
    }

    /**
     * 产生表头单元格样式
     * 字体：Calibri 10号 加粗 水平垂直居中
     * 边框：全边框
     * 填充: 60% 淡蓝色
     */
    private static XSSFCellStyle createHeadStyle(XSSFWorkbook workBook) {
        XSSFCellStyle style = workBook.createCellStyle();
        // 创建字体对象
        XSSFFont font = workBook.createFont();
        // 设置字体大小
        font.setFontHeightInPoints((short) 10);
        // 设置粗体
        font.setBold(true);
        // 设置为字体
        font.setFontName(FONT_STYLE_CALIBRI);
        // 将字体加入到样式对象
        style.setFont(font);

        // 设置背景颜色(60% 淡蓝色)
        byte[] colorRgb = { (byte)189, (byte)215, (byte)238 };
        XSSFColor xssfColor = new XSSFColor(colorRgb, new DefaultIndexedColorMap());
        style.setFillForegroundColor(xssfColor);
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        // 设置对齐方式
        // 水平居中
        style.setAlignment(HorizontalAlignment.CENTER);
        // 垂直居中
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        // 设置边框（上下左右全边框）
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);

        return style;
    }

    /**
     * 产生主体数据单元格样式
     * 字体：Calibri 10号 水平垂直居中
     * 边框：每格四周都有边框
     * 填充：无
     */
    private static XSSFCellStyle createBodyStyle(XSSFWorkbook workBook) {
        XSSFCellStyle style = workBook.createCellStyle();
        // 创建字体对象
        XSSFFont font = workBook.createFont();
        // 设置字体大小
        font.setFontHeightInPoints((short) 10);
        // 设置粗体
        font.setBold(false);
        // 设置字体
        font.setFontName(FONT_STYLE_CALIBRI);
        // 将字体加入到样式对象
        style.setFont(font);

        // 设置对齐方式
        // 水平居中
        style.setAlignment(HorizontalAlignment.CENTER);
        // 垂直居中
        style.setVerticalAlignment(VerticalAlignment.CENTER);

        // 设置边框（上下左右全边框）
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);

        // 自动换行
        style.setWrapText(true);

        return style;
    }

    /**
     * 设置单元格样式
     * @param xssfCell 单元格对象
     * @param style 样式对象
     */
    private static void setCellStyle(XSSFCell xssfCell, XSSFCellStyle style){
        xssfCell.setCellStyle(style);
    }

    /**
     * 通过属性名字，调用相应的Get方法获取属性值
     * @param object 目标对象
     * @param fieldName 需要获取的属性名字
     * @return 通过getXxxx(fieldName)获取到的对象属性
     */
    private static Object getFieldValueByFieldName(String fieldName, Object object) {
        Class c=object.getClass();
        try {
            String s=fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
            Method method=c.getMethod("get"+s);
            return method.invoke(object);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 设置表格内容的值
     * @param xssfCell 单元格对象
     * @param value 填充单元格的值对象
     * @return valueLength 返回数据的预期长度（区别中英文长度）
     */
    private static int setValue(XSSFCell xssfCell,Object value){
        int valueLength = 0;
        if (value instanceof String) {
            xssfCell.setCellValue(value.toString());
            valueLength = value.toString().getBytes().length;
        }else if (value instanceof Integer) {
            xssfCell.setCellValue((Integer) value);
            valueLength = value.toString().getBytes().length;
        } else if (value instanceof Double) {
            xssfCell.setCellValue((Double) value);
            valueLength = value.toString().getBytes().length;
        } else if (value instanceof Boolean) {
            xssfCell.setCellValue((Boolean) value);
            valueLength = value.toString().getBytes().length;
        } else if (value instanceof Float) {
            xssfCell.setCellValue((Float) value);
            valueLength = value.toString().getBytes().length;
        } else if (value instanceof Short) {
            xssfCell.setCellValue((Short) value);
            valueLength = value.toString().getBytes().length;
        }else if (value instanceof Long) {
            xssfCell.setCellValue((Long) value);
            valueLength = value.toString().getBytes().length;
        } else if (value instanceof Character) {
            xssfCell.setCellValue((Character) value);
            valueLength = value.toString().getBytes().length;
        } else if (value instanceof Date){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formatDate = simpleDateFormat.format(value);
            xssfCell.setCellValue(formatDate);
            valueLength = formatDate.getBytes().length;
        }
        return valueLength;
    }

    /**
     * 自动适应列宽
     * @param xssfSheet sheet对象
     * @param widthList 记录了第i列可能需要被设置的列宽
     * @param autoSizedList 记录了第i列是否自适应列宽的布尔值
     */
    private static void setAutoSizeColumn(XSSFSheet xssfSheet,List<Integer> widthList,List<Boolean> autoSizedList){
        for (int i = 0; i < widthList.size() ; i++) {
            if (autoSizedList.get(i)){
                xssfSheet.setColumnWidth(i, (widthList.get(i)+1)*256);
            }
        }
    }

}
