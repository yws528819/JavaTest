package com.yws.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Runnable     Callable
 * 1.一个是run  一个是call
 * 2.一个void  一个是有返回值
 * 3.一个不声明异常  一个声明异常
 *
 * Callable 是Runnable的子接口RunnableFuture的实现类FutureTask实例化带进来的参数
 */
public class CallableDemo implements Callable<String> {


    @Override
    public String call() throws Exception {
        return "A";
    }

    public static void main(String[] args) throws Exception {
        FutureTask futureTask = new FutureTask(new CallableDemo());
        new Thread(futureTask).start();


        String s = (String) futureTask.get();
        System.out.println(s);
    }

}
