package com.yws.pattern.prototype;

/**
 * 原型模式
 * @author Administrator
 *	1.实现 Cloneable 接口：Cloneable 接口与序列化接口的作用类似，
 *	     它只是告诉虚拟机可以安全地在实现了这个接口的类上使用 clone() 方法。
 *    在 JVM 中，只有实现了 Cloneable 接口的类才可以被拷贝，
 *    否则会抛出 CloneNotSupportedException 异常。
 *  2.重写 Object 类中的 clone() 方法：在 Java 中，所有类的父类都是 Object 类，
 *    而 Object 类中有一个 clone() 方法，作用是返回对象的一个拷贝。
 *  3.在重写的 clone() 方法中调用 super.clone()：默认情况下，
 *    类不具备复制对象的能力，需要调用 super.clone() 来实现。
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Student student = new Student();
		student.setName("张三");
		Teacher teacher = new Teacher();
		teacher.setName("老王");
		student.setTeacher(teacher);
		
		Student student2 = (Student) student.clone();
		student2.setName("李四");
		student2.getTeacher().setName("老李");
		
		
		System.out.println("学生1名字：" + student.getName() + ",学生1老师的名字："+student.getTeacher().getName());
		System.out.println("学生2名字：" + student2.getName() + ",学生2老师的名字："+student2.getTeacher().getName());

	}
}
