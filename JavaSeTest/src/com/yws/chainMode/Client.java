package com.yws.chainMode;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<ChainHandle> methodHandles = new ArrayList<>();
        methodHandles.add(new AfterHandle());
        methodHandles.add(new MethodHandle());
        methodHandles.add(new BeforeHandle());

        MethodInvokations methods = new MethodInvokations(methodHandles);
        methods.methodInvoke();
    }
}