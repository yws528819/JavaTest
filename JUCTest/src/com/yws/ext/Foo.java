package com.yws.ext;

import java.util.concurrent.TimeUnit;

public class Foo {

    public synchronized void method1() {
        System.out.println("我是方法1");
    }


    public static void main(String[] args) {
        Foo f = new Foo();

        new Thread(() -> {
            synchronized (f) {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我拿到f对象的锁，我输出了...");
            }

        }, "A").start();

        new Thread(() -> {
            f.method1();


        }, "B").start();
    }

}
