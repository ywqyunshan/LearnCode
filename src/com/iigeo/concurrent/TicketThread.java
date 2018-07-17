package com.iigeo.concurrent;

import java.util.concurrent.BlockingQueue;

public class TicketThread implements Runnable {

    //100张票
    private int num=100;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //利用synchronized锁
            synchronized (this){
                if (num>0){
                    System.out.println(Thread.currentThread().getName()+":"+num--);
                }
            }
        }
    }
}
