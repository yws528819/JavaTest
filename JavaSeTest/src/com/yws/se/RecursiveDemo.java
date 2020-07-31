package com.yws.se;

public class RecursiveDemo {

    public static int cal(int num) {
        if (num != 1) {
            return num + cal(num -1);
        }else {
            return 1;
        }
    }


    public static void main(String[] args) {
        System.out.println(cal(1));
        System.out.println(cal(2));
        System.out.println(cal(100));
    }
}
