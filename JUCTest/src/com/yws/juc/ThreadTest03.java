package com.yws.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest03 {




    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();

//        try{
//            executorService.execute(()-> {
//                throw new RuntimeException("我异常了");
//            });
//        }catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            executorService.shutdown();
//        }


        try{
            Future<Boolean> future = executorService.submit(() -> {
                return true;
            });

            boolean result = future.get();
            System.out.println(result);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }

    }
}
