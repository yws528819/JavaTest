package com.yws.juc;

/**
 * 两个线程：线程1打出12，线程2打出A，1打出34，2打出B，一前一后直到5152Z
 */
public class ThreadTest01 {

    int i=0;

    public synchronized void printTwoNumber(int n) throws InterruptedException {
        while (i!=0) {
            this.wait();
        }

        System.out.print((2*n+1)+""+(2*n+2));

        i++;
        this.notifyAll();
    }

    public synchronized void printEngWord(int n) throws InterruptedException {
        while (i==0) {
            this.wait();
        }

        char w = (char) ('A'+n);
        System.out.print(w);

        i--;
        this.notifyAll();
    }


    public static void main(String[] args) {
        ThreadTest01 test01 = new ThreadTest01();

        new Thread(()->{
            for (int i = 0; i <26 ; i++) {
                try {
                    test01.printTwoNumber(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i < 26; i++) {
                try {
                    test01.printEngWord(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, "B").start();
    }
}
