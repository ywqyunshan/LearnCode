package com.iigeo.concurrent;

import java.util.concurrent.Semaphore;

/**
 * java高级并发容器-信号量
 */
public class SemaphoreWork implements Runnable {

    private String threadName;
    //定义信号量
    private Semaphore semaphore;

    public SemaphoreWork(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            log("正在等待限制");
            semaphore.acquire();
            log("已获取请求限制");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }


    }

    void log(String msg){
        if (threadName==null){
            threadName=Thread.currentThread().getName();
        }
        System.out.println(threadName+":"+msg);

    }
}
