package com.yws.chainMode;

import java.util.List;

public class MethodInvokations {

    private List<ChainHandle> chainHandles;
    private int cnt=0;


    public MethodInvokations(List<ChainHandle> chainHandles) {
        this.chainHandles = chainHandles;
    }

    public void methodInvoke() {
        if (cnt == chainHandles.size()) {
            return;
        }
        ChainHandle chainHandle = chainHandles.get(cnt++);
        chainHandle.myInvoke(this);

    }


}
