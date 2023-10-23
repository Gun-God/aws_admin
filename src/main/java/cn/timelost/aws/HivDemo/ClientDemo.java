package cn.timelost.aws.HivDemo;

import cn.timelost.aws.controller.WebSocketServer;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.IntByReference;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.websocket.Session;
import java.awt.*;
import java.nio.ByteBuffer;

/**
 * @author :hyw
 * @version 1.0
 * @date : 2023/06/27 11:41
 * @description
 */
public class ClientDemo {


    static HCNetSDK hCNetSDK = null;
    static PlayCtrl playControl = null;
    static HCNetSDK.NET_DVR_DEVICEINFO_V30 m_strDeviceInfo;//设备信息
    String m_sDeviceIP;//已登录设备的IP地址
    int lUserID;//用户句柄
    int lPreviewHandle;//预览句柄
    static FRealDataCallBack fRealDataCallBack;//预览回调函数实现
    static FExceptionCallBack_Imp fExceptionCallBack;
    public Session session;
    int m_iTreeNodeNum;//通道树节点数目
    DefaultMutableTreeNode m_DeviceRoot;//通道树根节点

    /******************************************************************************
     * 内部类:   FRealDataCallBack
     * 实现预览回调数据
     ******************************************************************************/
    class FRealDataCallBack implements HCNetSDK.FRealDataCallBack_V30 {
        //预览回调
        public void invoke(int lRealHandle, int dwDataType, ByteByReference pBuffer, int dwBufSize, Pointer pUser) {
            if (dwDataType == HCNetSDK.NET_DVR_STREAMDATA) {

                //码流数据
//                    if ((dwBufSize > 0) && (m_lPort.getValue() != -1)) {
//                        if (!playControl.PlayM4_InputData(m_lPort.getValue(), pBuffer, dwBufSize))  //输入流数据
//                        {
//                            break;
//                        }
//                    }
                System.out.println(lRealHandle + "码流数据回调" + pBuffer + ", 数据类型: " + dwDataType + ", 数据长度:" + dwBufSize + "puser:" + pUser);
                long offset = 0;
                byte[] bytes = pBuffer.getPointer().getByteArray(offset, dwBufSize);
                ByteBuffer buffer = ByteBuffer.wrap(bytes);
                if (session != null) WebSocketServer.sendBufferToWeb(session, buffer);
            }
        }
    }

    static class FExceptionCallBack_Imp implements HCNetSDK.FExceptionCallBack {
        public void invoke(int dwType, int lUserID, int lHandle, Pointer pUser) {
            System.out.println("异常事件类型:" + dwType);
        }
    }

    public ClientDemo(Session session, String userName, String passWord, String deviceIP, int port) {
        this.session=session;
        fRealDataCallBack = new FRealDataCallBack();
        fExceptionCallBack = new FExceptionCallBack_Imp();
        initDemo();
        LoginDev(deviceIP, port, userName, passWord);
        RealPlayAction();
        m_iTreeNodeNum = 0;
    }


    /**
     * 播放库加载
     *
     * @return
     */
    private static boolean CreatePlayInstance() {
        if (playControl == null) {
            synchronized (PlayCtrl.class) {
                String strPlayPath = "";
                try {
                    if (osSelect.isWindows())
                        //win系统加载库路径
                        strPlayPath = System.getProperty("user.dir") + "\\libs\\hik\\windows\\PlayCtrl.dll";
                    else if (osSelect.isLinux())
                        //Linux系统加载库路径
                        strPlayPath = System.getProperty("user.dir") + "libs/hik/linux/libPlayCtrl.so";
                    playControl = (PlayCtrl) Native.loadLibrary(strPlayPath, PlayCtrl.class);

                } catch (Exception ex) {
                    System.out.println("loadLibrary: " + strPlayPath + " Error: " + ex.getMessage());
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 动态库加载
     *
     * @return
     */
    private static boolean CreateSDKInstance() {
        if (hCNetSDK == null) {
            synchronized (HCNetSDK.class) {
                String strDllPath = "";
                try {
                    if (osSelect.isWindows())
                        //win系统加载库路径
                        strDllPath = System.getProperty("user.dir") + "\\libs\\hik\\windows\\HCNetSDK.dll";

                    else if (osSelect.isLinux())
                        //Linux系统加载库路径
                        strDllPath = System.getProperty("user.dir") + "libs/hik/linux/libhcnetsdk.so";
                    hCNetSDK = (HCNetSDK) Native.loadLibrary(strDllPath, HCNetSDK.class);
                } catch (Exception ex) {
                    System.out.println("loadLibrary: " + strDllPath + " Error: " + ex.getMessage());
                    return false;
                }
            }
        }
        return true;
    }


    static void initDemo() {
        //linux系统建议调用以下接口加载组件库
        if (osSelect.isLinux()) {
            HCNetSDK.BYTE_ARRAY ptrByteArray1 = new HCNetSDK.BYTE_ARRAY(256);
            HCNetSDK.BYTE_ARRAY ptrByteArray2 = new HCNetSDK.BYTE_ARRAY(256);
            //这里是库的绝对路径，请根据实际情况修改，注意改路径必须有访问权限
            String strPath1 = System.getProperty("user.dir") + "/libs/hik/linux/libcrypto.so.1.1";
            String strPath2 = System.getProperty("user.dir") + "/libs/hik/linux/libssl.so.1.1";

            System.arraycopy(strPath1.getBytes(), 0, ptrByteArray1.byValue, 0, strPath1.length());
            ptrByteArray1.write();
            hCNetSDK.NET_DVR_SetSDKInitCfg(3, ptrByteArray1.getPointer());

            System.arraycopy(strPath2.getBytes(), 0, ptrByteArray2.byValue, 0, strPath2.length());
            ptrByteArray2.write();
            hCNetSDK.NET_DVR_SetSDKInitCfg(4, ptrByteArray2.getPointer());

            String strPathCom = System.getProperty("user.dir") + "/libs/hik/linux/";
            HCNetSDK.NET_DVR_LOCAL_SDK_PATH struComPath = new HCNetSDK.NET_DVR_LOCAL_SDK_PATH();
            System.arraycopy(strPathCom.getBytes(), 0, struComPath.sPath, 0, strPathCom.length());
            struComPath.write();
            hCNetSDK.NET_DVR_SetSDKInitCfg(2, struComPath.getPointer());
        }


        if (hCNetSDK == null && playControl == null) {
            if (!CreateSDKInstance()) {
                System.out.println("Load SDK fail");
                return;
            }
//            if (!CreatePlayInstance()) {
//                System.out.println("Load PlayCtrl fail");
//                return;
//            }
        }
        assert hCNetSDK != null;
        boolean initSuc = hCNetSDK.NET_DVR_Init();
        if (!initSuc) {
            JOptionPane.showMessageDialog(null, "初始化失败");
        }
        if (fExceptionCallBack == null) {
            fExceptionCallBack = new FExceptionCallBack_Imp();
        }
        Pointer pUser = null;
        if (!hCNetSDK.NET_DVR_SetExceptionCallBack_V30(0, 0, fExceptionCallBack, pUser)) {
            return;
        }
        System.out.println("设置告警回调成功");
        hCNetSDK.NET_DVR_SetLogToFile(3, "./sdklog", false);

    }


    /*************************************************
     * 函数:      "注册"  按钮单击响应函数
     * 函数描述:	注册登录设备
     *************************************************/
    private void LoginDev(String ip, int iPort, String userName, String password) {//GEN-FIRST:event_jButtonLoginActionPerformed
        //注册之前先注销已注册的用户,预览情况下不可注销
//        if (bRealPlay) {
//            JOptionPane.showMessageDialog(this, "注册新用户请先停止当前预览!");
//            return;
//        }

        if (lUserID > -1) {
            //先注销
            hCNetSDK.NET_DVR_Logout_V30(lUserID);
            lUserID = -1;
            m_iTreeNodeNum = 0;
            m_DeviceRoot.removeAllChildren();
        }
        //注册
        m_sDeviceIP = ip;//设备ip地址
        m_strDeviceInfo = new HCNetSDK.NET_DVR_DEVICEINFO_V30();
        lUserID = hCNetSDK.NET_DVR_Login_V30(m_sDeviceIP,
                (short) iPort, userName, password, m_strDeviceInfo);

        long userID = lUserID;
        if (userID == -1) {
            m_sDeviceIP = "";//登录未成功,IP置为空
//            int error;
//            error = hCNetSDK.NET_DVR_GetLastError();

        } else {
            System.err.println("登陆成功");
            // CreateDeviceTree();
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    /*************************************************
     * 函数:      "实况预览"  按钮单击响应函数
     * 函数描述:	获取通道号,打开播放窗口,开始此通道的预览
     *************************************************/
    private void RealPlayAction()//GEN-FIRST:event_jButtonRealPlayActionPerformed
    {//GEN-HEADEREND:event_jButtonRealPlayActionPerformed
//        System.out.println(panelRealplay.getWidth());
//        System.out.println(panelRealplay.getHeight());
        if (lUserID == -1) {
            System.err.println("还未登录");
            return;
        }
        //如果预览窗口没打开,不在预览
        //获取窗口句柄
        //获取通道号
        int iChannelNum = 0;//通道号
//       m_strClientInfo = new HCNetSDK.NET_DVR_CLIENTINFO();
//       m_strClientInfo.lChannel = new NativeLong(iChannelNum);
        HCNetSDK.NET_DVR_PREVIEWINFO strClientInfo = new HCNetSDK.NET_DVR_PREVIEWINFO();
        strClientInfo.read();
        strClientInfo.hPlayWnd = 0;  //窗口句柄，从回调取流不显示一般设置为空
        strClientInfo.lChannel = iChannelNum;  //通道号
        strClientInfo.dwStreamType = 0; //0-主码流，1-子码流，2-三码流，3-虚拟码流，以此类推
        strClientInfo.dwLinkMode = 0; //连接方式：0- TCP方式，1- UDP方式，2- 多播方式，3- RTP方式，4- RTP/RTSP，5- RTP/HTTP，6- HRUDP（可靠传输） ，7- RTSP/HTTPS，8- NPQ
        strClientInfo.bBlocked = 1;  //0- 非阻塞取流，1- 阻塞取流

        //在此判断是否回调预览,0,不回调 1 回调
        // strClientInfo.hPlayWnd = null;
        strClientInfo.write();
        lPreviewHandle = hCNetSDK.NET_DVR_RealPlay_V40(lUserID,
                strClientInfo, fRealDataCallBack, null);
        if (lPreviewHandle <= -1) {
            int error;
            error = hCNetSDK.NET_DVR_GetLastError();
            System.err.println("预览失败,错误码：" + error);
        }

    }//GEN-LAST:event_jButtonRealPlayActionPerformed


}
