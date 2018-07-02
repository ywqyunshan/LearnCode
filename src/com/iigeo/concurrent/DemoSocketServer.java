package com.iigeo.concurrent;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * BIO-ScoketServer——利用线程池实现线程复用
 */
public class DemoSocketServer {


    public static void initSocketServer(){
        try {
            //初始化ServerSocket，绑定端口
            ServerSocket serverSocket=new ServerSocket(8999);
            //声明线程池
            ExecutorService executorService=Executors.newFixedThreadPool(20);
            System.out.println("服务器已启动...");
            while (!Thread.currentThread().isInterrupted()){
                //阻塞等待客户端的连接
                Socket socket=serverSocket.accept();
                executorService.execute(new ConnectIOnHandler(socket));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
