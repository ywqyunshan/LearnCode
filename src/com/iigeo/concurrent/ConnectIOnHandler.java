package com.iigeo.concurrent;

import com.iigeo.utils.SystemUtil;

import java.io.*;
import java.net.Socket;

/*
 * BIO-Socket Server——处理客户端请求数据
 */
public class ConnectIOnHandler extends Thread {

    private Socket mSocket;
    private BufferedReader in=null;
    private PrintWriter printWriter=null;
    private String receiveMsg;

    public ConnectIOnHandler(Socket mSocket) {
        this.mSocket = mSocket;
        try {
            printWriter=new PrintWriter(new BufferedWriter(new OutputStreamWriter(mSocket.getOutputStream(),SystemUtil.CharsetString)),true);
            in=new BufferedReader(new InputStreamReader(mSocket.getInputStream(),SystemUtil.CharsetString));
            printWriter.println("成功连接到服务端");
            System.out.println("成功连接到服务端");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        super.run();
        while (!Thread.currentThread().isInterrupted()&&!mSocket.isClosed()){
            //死循环处理读写事件
            try {
                if ((receiveMsg=in.readLine())!=null){
                   if (receiveMsg.equals("0")){
                       System.out.println("客户端断开连接");
                       printWriter.println("服务端断开连接");
                       in.close();
                       mSocket.close();
                   }else {
                       printWriter.println("我已接收"+receiveMsg);
                   }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


}
