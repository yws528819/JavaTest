package com.yws.pattern.Flyweight;

/**
 * 享元模式
 * @author Administrator
 *如果在一个系统中存在多个相同的对象，那么只需要共享一份对象的拷贝,而不必为每一次使用都创建新的对象。目的是提高系统性能
 */
public class Client {
	public static void main(String[] args) {
		Library library = Library.getInstance();
		
		int i=0;
		
		library.libToBorrow("Java编程思想 卷一");
		i++;
		library.libToBorrow("Java编程思想 卷二");
		i++;
		library.libToBorrow("Java从入门到精通");
		i++;
		System.out.println("前两本书没学会，又借了一次");
		library.libToBorrow("Java编程思想 卷一");
		i++;
		library.libToBorrow("Java编程思想 卷二");
		i++;
		
		System.out.println("学生一共借了" + i + "次书");
		System.out.println("图书馆一共借出" + library.getAllBookSize() + "本书");
	}
	
}
