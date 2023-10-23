package cn.timelost.aws.NetDemo;

import cn.timelost.aws.NetDemo.Struct.NETDEV_DEVICE_INFO_S;
import cn.timelost.aws.controller.WebSocketServer;
import com.sun.jna.Pointer;

import javax.websocket.Session;
import java.nio.ByteBuffer;

/**
 * @author :hyw
 * @version 1.0
 * @date : 2023/06/11 13:29
 */
public class NetDevMain {
    public static NetDEVSDKLib netdevsdk = NetDEVSDKLib.NETDEVSDK_INSTANCE;
    private static final ImosSdkInterface ITF = ImosSdkInterface.instance;

    private final int m_lChannelID = 1;
    private static NetDEVSDKLib.NETDEV_SOURCE_DATA_CALLBACK_PF videoDataCall = null;
    public Session session;

    //实况视频回调函数
    public class videoDataCallBackFun implements NetDEVSDKLib.NETDEV_SOURCE_DATA_CALLBACK_PF {
        @Override
        public void invoke(Pointer lpPlayHandle, Pointer pucBuffer, int dwBufSize, int dwMediaDataType, Pointer lpUserParam) {
            //如果没打印这条信息，说明没进回调函数，则需要换另一种方式获取视频流
            System.out.println(lpPlayHandle + "码流数据回调" + pucBuffer + ", 数据类型: " + dwMediaDataType + ", 数据长度:" + dwBufSize + "puser:" + lpUserParam);
            long offset = 0;
            byte[] bytes = pucBuffer.getByteArray(offset, dwBufSize);
            ByteBuffer buffer = ByteBuffer.wrap(bytes);
            if (session != null) WebSocketServer.sendBufferToWeb(session, buffer);
//                try {
//                    Date date = new Date();
//                    File file = new File(this.getClass().getResource("").getPath() + "/" + date.getTime() + ".mp4");
//                    //根据lRealHandle从map中取出对应的流读取数据
//                    FileOutputStream outputStream = new FileOutputStream(file);
//                    outputStream.write(bytes);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
        }
    }

    public NetDevMain(Session session, String userName, String passWord, String deviceIP, String port) {
        this.session = session;

        //初始化SDK
        initSDK();
        if (videoDataCall == null) videoDataCall = new videoDataCallBackFun();
        //登录设备
        loginPerformed(userName, passWord, deviceIP, port);
        //启动实况流
        realPlayActionPerformed();
    }

    //获取实况流
    private void realPlayActionPerformed() {//GEN-FIRST:event_btnRealPlayActionPerformed
        if (Pointer.NULL == NetDEVSdk.m_lpDevHandle) {
//            JOptionPane.showMessageDialog(this, "当前用户未登录");
            System.err.println("未登录");
            return;
        }

        boolean iRet;
        if (Pointer.NULL != NetDEVSdk.m_lpPlayHandle) {
            iRet = netdevsdk.NETDEV_StopRealPlay(NetDEVSdk.m_lpPlayHandle);
            if (iRet) {
                NetDEVSdk.m_lpPlayHandle = Pointer.NULL;
            }
        }

        if (Pointer.NULL != NetDEVSdk.m_lpPlayHandle) {
            iRet = netdevsdk.NETDEV_StopPlayBack(NetDEVSdk.m_lpPlayHandle);
            if (iRet) {
                NetDEVSdk.m_lpPlayHandle = Pointer.NULL;
            }
        }

        String errMessage;
        NetDEVSDKLib.NETDEV_PREVIEWINFO_S stPreviewInfo = new NetDEVSDKLib.NETDEV_PREVIEWINFO_S();

        stPreviewInfo.dwChannelID = m_lChannelID;
        stPreviewInfo.dwStreamType = NetDEVEnum.NETDEV_LIVE_STREAM_INDEX_MAIN;
        stPreviewInfo.dwLinkMode = 1;
        stPreviewInfo.hPlayWnd = null;
        stPreviewInfo.dwFluency = 0;
        stPreviewInfo.dwStreamMode = 0;
        stPreviewInfo.dwLiveMode = 0;
        stPreviewInfo.dwDisTributeCloud = 0;
        stPreviewInfo.dwallowDistribution = 0;


        NetDEVSdk.m_lpPlayHandle = netdevsdk.NETDEV_RealPlay(NetDEVSdk.m_lpDevHandle, stPreviewInfo, videoDataCall, null);
        //NetDEVSdk.m_lpPlayHandle = ITF.NETDEV_RealPlay(NetDEVSdk.m_lpDevHandle, pstPreviewInfo, new videoDataCallBackFun(), Pointer.NULL);
        if (Pointer.NULL == NetDEVSdk.m_lpPlayHandle) {
            errMessage = "实况流启流失败.";
        } else {
            errMessage = String.format("实况流启流成功.");
            long value = Pointer.nativeValue(NetDEVSdk.m_lpPlayHandle);
//            NetDEVSdk.m_lpPlayHandle.getLong(0);
            // MainFrame.setFile(NetDEVSdk.m_lpPlayHandle);
        }

        // JOptionPane.showMessageDialog(this, errMessage);
    }//GEN-LAST:event_btnRealPlayActionPerformed

    private void RealStopActionPerformed() {//GEN-FIRST:event_btnRealStopActionPerformed
        if (Pointer.NULL == NetDEVSdk.m_lpDevHandle) {
            // JOptionPane.showMessageDialog(this, "当前用户未登录");
            return;
        }

        if (Pointer.NULL != NetDEVSdk.m_lpPlayHandle) {
            boolean iRet = netdevsdk.NETDEV_StopRealPlay(NetDEVSdk.m_lpPlayHandle);
            if (!iRet) {
                //  JOptionPane.showMessageDialog(this, "实况流停流失败.");
                return;
            }
        }
        NetDEVSdk.m_lpPlayHandle = Pointer.NULL;
    }//GEN-LAST:event_btnRealStopActionPerformed


    //用户登录
    private void loginPerformed(String userName, String passWord, String deviceIP, String port) {//GEN-FIRST:event_btnLoginActionPerformed
        if (Pointer.NULL != NetDEVSdk.m_lpDevHandle) {
            netdevsdk.NETDEV_Logout(NetDEVSdk.m_lpDevHandle);
        }

        String errMessage;
//        String userName = tfUserName.getText();
//        String passWord = tfPassWord.getText();
//        String deviceIP = tfDeviceIP.getText();
        short wDevPort = Short.parseShort(port);
        NETDEV_DEVICE_INFO_S.ByReference pstDevInfo = new NETDEV_DEVICE_INFO_S.ByReference();

        NetDEVSdk.m_lpDevHandle = ITF.NETDEV_Login(deviceIP, wDevPort, userName, passWord, pstDevInfo);
        if (Pointer.NULL != NetDEVSdk.m_lpDevHandle) {
            errMessage = "NETDEV_Login succeed.";
        } else {
            errMessage = String.format("NETDEV_Login failed.");
        }

        // JOptionPane.showMessageDialog(this, errMessage);

        //  ITF.NETDEV_SetStatusCallBack(StatusReportCallBack);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void logoutPerformed() {//GEN-FIRST:event_btnLogoutActionPerformed
        int iRet;
        String errMessage;

        if (Pointer.NULL == NetDEVSdk.m_lpDevHandle) {
            return;
        }

        if (Pointer.NULL != NetDEVSdk.m_lpPlayHandle) {
            ITF.NETDEV_StopRealPlay(NetDEVSdk.m_lpPlayHandle);
        }

        if (Pointer.NULL != NetDEVSdk.m_lpPicHandle) {
            ITF.NETDEV_StopPicStream(NetDEVSdk.m_lpPicHandle);
        }

        iRet = ITF.NETDEV_Logout(NetDEVSdk.m_lpDevHandle);
        if (NetDEVEnum.TRUE == iRet) {
            errMessage = "登出成功.";
            //  JOptionPane.showMessageDialog(this, errMessage);
        } else {
            errMessage = String.format("登出失败, 错误码: %d.", iRet);
            //  JOptionPane.showMessageDialog(this, errMessage);
            return;
        }

        NetDEVSdk.m_lpDevHandle = Pointer.NULL;
        NetDEVSdk.m_lpPlayHandle = Pointer.NULL;
        NetDEVSdk.m_lpPicHandle = Pointer.NULL;
    }//GEN-LAST:event_btnLogoutActionPerformed


    private void initSDK() {
        int iRet;
        iRet = ITF.NETDEV_Init();
        if (NetDEVEnum.TRUE != iRet) {
            String errMessage = String.format("NETDEV_Init failed, error code: %d.", iRet);
            //  JOptionPane.showMessageDialog(this, errMessage);
        }
    }

    private void cleanUpSDK() {
        int iRet;
        iRet = ITF.NETDEV_Cleanup();
        if (NetDEVEnum.TRUE != iRet) {
            String errMessage = String.format("NETDEV_Cleanup failed, error code: %d.", iRet);
            //JOptionPane.showMessageDialog(this, errMessage);
        }
    }

    public void closeRealPlay() {
        RealStopActionPerformed();
        logoutPerformed();
        cleanUpSDK();
    }

}
