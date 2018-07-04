package com.iigeo.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * java并发容器包——CountDownLatch
 */
public class FirstCountDownWork implements Runnable{

    private CountDownLatch countDownLatch;

    public FirstCountDownWork(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("执行first batch");
        countDownLatch.countDown();
    }
}
