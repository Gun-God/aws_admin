package cn.timelost.aws.controller;

import cn.timelost.aws.NETDemo.NETDEV;
import cn.timelost.aws.config.realm.UserRealm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author： hyw
 * @date： 2022/5/23 16:27
 * @Description： WebSocket操作类
 */
@ServerEndpoint("/websocket/{deviceId}")
@Component
@Slf4j
public class WebSocketServer {

    // 与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

    // session集合,存放对应的session
    private static ConcurrentHashMap<Integer, Session> sessionPool = new ConcurrentHashMap<>();

    // concurrent包的线程安全Set,用来存放每个客户端对应的WebSocket对象。
    private static CopyOnWriteArraySet<Session> webSocketSet = new CopyOnWriteArraySet<>();
    private static ConcurrentHashMap<Session, Timer> timerMap = new ConcurrentHashMap<>();
    private NETDEV dev;


    /**
     * 建立WebSocket连接
     *
     * @param session
     * @param
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("deviceId") Integer deviceId) {
        String userName= UserRealm.USERNAME;
        log.info("WebSocket建立连接中,用户名：{}", userName);
        log.info("WebSocket建立连接中,连接设备ID：{}", deviceId);
//        if (deviceId != null) {
//            try {
//                Session historySession = sessionPool.get(deviceId);
//                // historySession不为空,说明已经有人登陆账号,应该删除登陆的WebSocket对象
//                if (historySession != null) {
//                    webSocketSet.remove(historySession);
//                    log.info("设备已存在,连接设备ID：{}", deviceId);
//                    historySession.close();
//                }
//            } catch (IOException e) {
//                log.error("重复登录异常,错误信息：" + e.getMessage(), e);
//            }
//        }


        // 建立连接
        webSocketSet.add(session);
       // sessionPool.put(deviceId, session);
        log.info("建立连接完成,当前在线人数为：{}", webSocketSet.size());
      //  dev = new NETDEV(deviceId, "admin", "123456", "192.168.3.8", "80");
        TaskTimer(deviceId,session);
        System.err.println("webSocketSet数量"+webSocketSet.size());
    }

    public void TaskTimer(Integer deviceId,Session session) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                sendMessageByUser(deviceId, "设备：" + deviceId + "返回回调数据" + sdf.format(new Date()),session);
            }
        }, 100, 3000);// 2000=开始延迟时间 500=间隔时间
        timerMap.put(session, timer);

    }

    /**
     * 发生错误
     *
     * @param throwable e
     */
    @OnError
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    /**
     * 连接关闭
     */
    @OnClose
    public void onClose() {
        //  sendMessageByUser(1, "断开连接");
//        for (Map.Entry<Session, Timer> entry : timerMap.entrySet()
//        ) {
//
//        }
        timerMap.get(session).cancel();
       // sessionPool.clear();
        webSocketSet.remove(session);
        log.info("连接断开,当前在线人数为：{}", webSocketSet.size());
        //关闭实况流
      //  dev.closeRealPlay();

    }

    /**
     * 接收客户端消息
     *
     * @param message 接收的消息
     */
    @OnMessage
    public void onMessage(String message) {
        // log.info("收到客户端发来的消息：{}", message);
        // sendMessageByUser(1, "已经收到" + message);
    }

    /**
     * 推送消息到指定用户
     *
     * @param deviceId 设备ID
     * @param message  发送的消息
     */
    public static void sendMessageByUser(Integer deviceId, String message,Session session) {

      //  Session session = sessionPool.get(deviceId);
        try {
            if (webSocketSet.contains(session)) {
                log.info("设备ID：" + deviceId + ",推送内容：" + message);
                session.getBasicRemote().sendText(message);
            }
        } catch (IOException e) {
            log.error("推送消息到指定用户发生错误：" + e.getMessage(), e);
        }
    }


    /**
     * 发送binary消息给指定客户端
     *
     * @param deviceId 设备id
     * @param buffer   码流数据
     */
    public static void sendMessageToOne(Integer deviceId, ByteBuffer buffer) {
        //登录句柄无效
        if (deviceId == 0) {
            //   log.error("loginHandler is invalid.please check.", this);
            return;
        }
//        RealPlayInfo realPlayInfo = AutoRegisterEventModule.findRealPlayInfo(realPlayHandler);
//        if(realPlayInfo == null){
//            //连接已断开
//        }
        Session session = sessionPool.get(deviceId);
        if (session != null) {
            synchronized (session) {
                try {
                    session.getBasicRemote().sendBinary(buffer);
                    byte[] bytes = new byte[buffer.limit()];
                    buffer.get(bytes);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            //log.error("session is null.please check.", );
        }
    }


    /**
     * 群发消息
     *
     * @param message 发送的消息
     */
    public static void sendAllMessage(String message) {
        log.info("发送消息：{}", message);
        for (Session webSocket : webSocketSet) {
            try {
                webSocket.getBasicRemote().sendText(message);
            } catch (IOException e) {
                log.error("群发消息发生错误：" + e.getMessage(), e);
            }
        }
    }

}


