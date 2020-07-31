package com.yws.se;

import com.yws.se.data.EmployData;
import com.yws.se.data.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPITest02 {
    @Test
    public void test1() {
        List<Employee> employees = EmployData.getEmployees();
        //排除过滤
        employees.stream().filter(e-> e.getSalary()>8000).forEach(System.out::println);
        System.out.println("*************");
        //截断流
        employees.stream().limit(3).forEach(System.out::println);
        System.out.println("*************");

        //跳过元素
        employees.stream().skip(3).forEach(System.out::println);
        System.out.println("*************");


        //去掉重复的元素
        employees.add(new Employee(1011,"刘强东",26, 3000));
        employees.add(new Employee(1011,"刘强东",26, 3000));
        employees.add(new Employee(1011,"刘强东",26, 3000));
        employees.add(new Employee(1011,"刘强东",26, 3000));

        employees.stream().distinct().forEach(System.out::println);
    }


    @Test
    public void test2() {
        List<Employee> employees = EmployData.getEmployees();
        employees.stream().map((e) -> e.getName()).forEach(System.out::println);

        System.out.println("*******");

        List<String> list = new ArrayList();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        list.stream().map((s)->{
            List<String> list1 = new ArrayList<>();
            char[] chars = s.toCharArray();
            for (char c: chars) {
                list1.add(c+"");
            }
            return list1.stream();
        }).forEach((l)->{
            l.forEach(System.out::println);
        });
        System.out.println("*******");

        list.stream().flatMap((s)->{
            List<String> list1 = new ArrayList<>();
            char[] chars = s.toCharArray();
            for (char c: chars) {
                list1.add(c+"");
            }
            return list1.stream();
        }).forEach(System.out::println);
    }


    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(13,4,5,20,1,18,9);
        list.stream().sorted().forEach(System.out :: println);

        System.out.println("****");

        List<Employee> employees = EmployData.getEmployees();
        employees.stream().sorted((e1,e2)->{
            int ret = Integer.compare(e1.getAge(), e2.getAge());
            if (ret != 0) {
                return ret;
            }else {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        }).forEach(System.out :: println);

    }

}
