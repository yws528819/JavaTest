package com.yws.chainMode;

public class AfterHandle implements ChainHandle{
    @Override
    public void myInvoke(MethodInvokations methodInvokations) {
        methodInvokations.methodInvoke();
        System.out.println("***after***");
    }
}
