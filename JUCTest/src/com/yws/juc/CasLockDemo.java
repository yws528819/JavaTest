package com.yws.juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class CasLockDemo {

    private AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void lock() {
        Thread thread = Thread.currentThread();

        System.out.println(thread.getName() + "开始了");

        while(!atomicReference.compareAndSet(null, thread)) {
            //System.out.println(thread.getName() + "拿不到锁，等待中。。。");
        }

        //System.out.println(thread.getName() + "轮到我了");
    }

    public void unlock() {
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread, null);

        System.out.println(thread.getName() + "用完了");
    }


    public static void main(String[] args) throws InterruptedException {
        CasLockDemo casLockDemo = new CasLockDemo();

        new Thread(()-> {
            casLockDemo.lock();

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            casLockDemo.unlock();

        }, "AA").start();

        TimeUnit.SECONDS.sleep(1);

        new Thread(()-> {
            casLockDemo.lock();

            casLockDemo.unlock();
        }, "BB").start();
    }


}
