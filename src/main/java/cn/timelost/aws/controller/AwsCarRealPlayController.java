package cn.timelost.aws.controller;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.nio.ByteBuffer;

/**
 * @author :hyw
 * @version 1.0
 * @date : 2023/06/09 15:17
 */

@Logger
public class AwsCarRealPlayController {
    //Logger logger=new Logger();



    /**
     * 发送数据
     * @param bytes
     * @param realPlayHandler
     */
    private  void sendBuffer(byte[] bytes, long realPlayHandler) {
        /**
         * 发送流数据
         * 使用pBuffer.getByteBuffer(0,dwBufSize)得到的是一个指向native pointer的ByteBuffer对象,其数据存储在native,
         * 而webSocket发送的数据需要存储在ByteBuffer的成员变量hb，使用pBuffer的getByteBuffer得到的ByteBuffer其hb为null
         * 所以，需要先得到pBuffer的字节数组,手动创建一个ByteBuffer
         */
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
       //sendMessageToOne(realPlayHandler, buffer);
    }



}
