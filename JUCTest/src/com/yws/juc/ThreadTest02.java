package com.yws.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest02{

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();

        try{
            for (int i = 0; i <10 ; i++) {
                executorService.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"\t 办理业务");
                });
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }

    }
}
