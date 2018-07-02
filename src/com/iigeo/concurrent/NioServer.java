package com.iigeo.concurrent;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

/**
 * NIO-Scoketserver
 * 高并发
 *
 */
public class NioServer extends Thread {

    public NioServer() {
        //Selctor是阻塞的，开启一个新线程处理
    }

    @Override
    public void run() {
        super.run();
        try {
            //1.创建Selector对象，类似调度员的角色，管理所有channel
            Selector selector=Selector.open();
            //2.创建channel对象
            ServerSocketChannel ssc=ServerSocketChannel.open();
            //配置为非阻塞状态，因为阻塞状态下，无法注册到selector
            ssc.configureBlocking(false);
            //绑定端口号和地址
            ssc.bind(new InetSocketAddress(InetAddress.getLocalHost(),8999));
            System.out.println("NIOSocket服务器已启动...");
            //3.将channel注册到selector
            ssc.register(selector,SelectionKey.OP_ACCEPT);
            while (!Thread.currentThread().isInterrupted()){
                  //Selector阻塞select操作,阻塞等待就绪的channel操作
                  selector.select();
                  Set<SelectionKey> selectionKeySet=selector.keys();
                  Iterator<SelectionKey> keyIterator=selectionKeySet.iterator();
                  while (keyIterator.hasNext()){
                     SelectionKey key= keyIterator.next();
                     sayHello((ServerSocketChannel) key.channel());
                     keyIterator.remove();
                  }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sayHello(ServerSocketChannel serverSocketChannel) throws IOException {
        System.out.println("NIOSocket服务器已连接");
        SocketChannel socketChannel=serverSocketChannel.accept();
        socketChannel.write(Charset.defaultCharset().encode("hello"));
    }


}
