package com.yws.se;

import com.yws.se.data.EmployData;
import com.yws.se.data.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class ConstructRefTest01 {

    /**
     * 构造器引用
     */
    @Test
    public void test01() {
        Supplier<Employee> supplier = ()-> new Employee();
        Employee employee = supplier.get();
        System.out.println(employee);


        Supplier<Employee> supplier1 = Employee :: new;
        Employee employee1 = supplier1.get();
        System.out.println(employee1);
    }


    /**
     * Function<T,R>中  R apply(T t)
     */
    @Test
    public void test2() {
        Function<Integer,Employee> function = (id) -> new Employee(id);
        System.out.println(function.apply(1010));


        Function<Integer, Employee> function1 = Employee :: new;
        System.out.println(function1.apply(1011));


    }



    /**
     * 类：：静态方法
     */
    @Test
    public void test3() {
        Comparator<Integer> cmp = (a,b) -> {
            return Integer.compare(a,b);
        };

        System.out.println(cmp.compare(12, 24));

        System.out.println("******");

        Comparator<Integer> cmp2 = Integer :: compare;
        System.out.println(cmp2.compare(24, 12));
    }

    /**
     * Function<T,R>  R apply(T t)
     * Math中的Long  Math.round(Double d);
     */
    @Test
    public void test4() {
        Function<Double, Long> function = (d) -> Math.round(d);
        System.out.println(function.apply(12.4D));

        System.out.println("*******");

        Function<Double, Long> function1 = Math :: round;
        System.out.println(function1.apply(13.1D));
    }



    /**
     *类：：实例方法
     * int compare(String a, String b)
     * int a.comparTo(String b)
     */
    @Test
    public void test5() {
        Comparator<String> cmp = (a,b)-> a.compareTo(b);
        System.out.println(cmp.compare("2", "1"));

        System.out.println("***");


        Comparator<String> cmp1 = String :: compareTo;
        System.out.println(cmp1.compare("1", "3"));
    }

    /**
     * BiPredicate<T,T>  boolean test(T t1, T t2);
     */
    @Test
    public void test6() {
        BiPredicate<String,String> predicate = (a,b)->a.equals(b);
        System.out.println(predicate.test("abc", "abe"));


        BiPredicate<String,String> predicate1 = String :: equals;
        System.out.println(predicate1.test("bac", "bac"));
    }

    /**
     * Function<T,R>  R apply(T t)
     * Employee       String getName()
     */
    @Test
    public void test7() {
        Employee employee = new Employee(1012,"里斯",12, 1222);
        Supplier<String> supplier = employee :: getName;//对象::实例方法

        Function<Employee, String> function = (e) -> e.getName();
        System.out.println(function.apply(employee));


        Function<Employee, String> function1 = Employee::getName;
        System.out.println(function1.apply(employee));


    }

    /**
     * 数组引用
     * Function<T,R>  R apply(T t)
     */
    @Test
    public void test8() {
        Function<Integer, String[]> function = (i)-> new String[i];
        System.out.println(Arrays.toString(function.apply(3)));

        System.out.println("****");

        Function<Integer, String[]> function1 = String[] :: new;
        System.out.println(Arrays.toString(function1.apply(4)));


    }

    /**
     * Consumer<T>  void accept(T t)
     */
    @Test
    public void test9() {
        Consumer<String> consumer = System.out :: println;
        consumer.accept("你好");

        System.out.println("*******");

        List<Employee> employees = EmployData.getEmployees();
        employees.forEach((e)-> System.out.println(e.getName()));

        System.out.println("*******");

        employees.stream().map(Employee::getName).forEach(System.out :: println);

    }




    // Consumer<T>      void accept(T t)
    // Supplier<T>      T get()
    // Function<T,R>    R apply(T t)
    // Predicate<T>     boolean test(T t)
    // BiPredicate<T,U> boolean test(T t,U u)
}
