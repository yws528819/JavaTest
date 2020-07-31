package com.yws.se;

import com.yws.se.data.EmployData;
import com.yws.se.data.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPITest01 {

    /**
     * 通过集合
     */
    @Test
    public void test01() {
        List<Employee> employees = EmployData.getEmployees();
        Stream<Employee> stream = employees.stream();


        Stream<Employee> stream1 = employees.parallelStream();
    }

    /**
     * 通过数组
     */
    @Test
    public void test02() {
        int[] arr = new int[] {1,2,3,4};
        IntStream stream = Arrays.stream(arr);

        Employee e1 = new Employee(1001);
        Employee e2 = new Employee(1002);
        Employee[] employees = new Employee[]{e1,e2};
        Stream<Employee> stream1 = Arrays.stream(employees);

    }

    /**
     * 通过Stream的of()
     */
    @Test
    public void test03() {
        Stream<List<Employee>> employees = Stream.of(EmployData.getEmployees());
        employees.forEach((e)->{
            e.stream().forEach((e1) -> {
                System.out.println(e1.getName());
            });
        });
    }

    /**
     * 创建无线流 Stream 的 iterate和generate方法
     */
    @Test
    public void test04() {
        //迭代
        Stream.iterate(0, t->t+2).limit(10).forEach(System.out::println);
        System.out.println("*******");
        //生成
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
