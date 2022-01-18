package com.yws.ifelse;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * if/else替代方案-Map+lambda
 */
public class RpPlan {
    public static void main(String[] args) {
        ServiceOper oper = new ServiceOper();
        oper.init();
        //可根据传入的参数，选择对应的执行方案
        oper.handle("B");
    }
}


class ServiceOper {
    private Map<String, Function> map = new HashMap<>();

    //初始化了A\B\C3种方案
    public void init() {
        ServiceType serviceType = new ServiceType();
        map.put("A", e -> {
            return serviceType.redPaper((String) e);
        });
        map.put("B", e -> {
            return serviceType.shopping((String) e);
        });
        map.put("C", e -> {
            return serviceType.qqVIP((String) e);
        });
    }

    //根据调用执行对应的方案
    public void handle(String type) {
        Function function = map.get(type);
        if (function != null) {
            System.out.println(function.apply(""));
        }
    }

}




//操作不同分支
class ServiceType {

    //红包发放时间
    public String redPaper(String sourceId) {
        return "红包每周六日早上9点发放";
    }

    //购物券发放时间
    public String shopping(String sourceId) {
        return "购物券每周一晚上9点发放";
    }

    //QQ会员券发放时间
    public String qqVIP(String sourceId) {
        return "QQVIP每周二晚上9点发放";
    }
}
