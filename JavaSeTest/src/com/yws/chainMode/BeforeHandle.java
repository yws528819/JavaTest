package com.yws.chainMode;

public class BeforeHandle implements ChainHandle{
    @Override
    public void myInvoke(MethodInvokations methodInvokations) {
        System.out.println("***before***");
        methodInvokations.methodInvoke();
    }
}
