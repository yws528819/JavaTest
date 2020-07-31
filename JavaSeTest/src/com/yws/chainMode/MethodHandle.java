package com.yws.chainMode;

public class MethodHandle implements ChainHandle{
    @Override
    public void myInvoke(MethodInvokations methodInvokations) {
        methodInvokations.methodInvoke();
        System.out.println("***i am method***");
    }
}
