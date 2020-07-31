package com.yws.se;

import com.yws.se.data.EmployData;
import com.yws.se.data.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPITest03 {

    /**
     * allMatch
     */
    @Test
    public void test1() {
        List<Employee> employees = EmployData.getEmployees();
        System.out.println(employees.stream().allMatch((e) -> {
            return e.getAge() < 30;
        }));
    }

    /**
     * 匹配与查找  findFirst  findAny
     */
    @Test
    public void test2() {
        List<Employee> employees = EmployData.getEmployees();
        Optional<Employee> first = employees.stream().findFirst();
        System.out.println(first.get());

    }

    /**
     * max min foreach
     */
    @Test
    public void test3() {
        List<Employee> employees = EmployData.getEmployees();
        System.out.println(employees.stream().filter((e) -> e.getSalary() > 5000).count());


        System.out.println(employees.stream().max((e1, e2) -> {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }).get());

        System.out.println(employees.stream().min((e1, e2) -> {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }).get());

        //foreach 内部迭代
        employees.stream().forEach(System.out :: println);

        //使用集合的遍历操作
        employees.forEach(System.out :: println);
    }


    /**
     * 收集  collect(Collects.toList)  Collectors.toSet()
     */
    @Test
    public void test4() {
        List<Employee> employees = EmployData.getEmployees();
        List<Employee> collect = employees.stream().filter((e) -> {
            return e.getSalary() > 5000;
        }).collect(Collectors.toList());

        collect.stream().forEach(System.out :: println);
    }

    /**
     * 归约 reduce
     */
    @Test
    public void test5() {
        List<Integer> list = Arrays.asList(1,2,4,5,6,7);
        System.out.println(list.stream().reduce(0, (i, j) -> i + j));
    }
}
