package com.yws.se.data;

import java.util.ArrayList;
import java.util.List;

public class EmployData {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1001, "马云", 12, 2000));
        list.add(new Employee(1002, "张三", 22, 5010));
        list.add(new Employee(1003, "里斯", 32, 7000));
        list.add(new Employee(1004, "王五", 26, 3000));
        list.add(new Employee(1005, "郭富城", 24, 6000));
        list.add(new Employee(1006, "王雪有", 33, 8000));
        list.add(new Employee(1007, "昭雪", 31, 9000));
        list.add(new Employee(1007, "昭雪君", 31, 10000));

        return list;


    }

}
