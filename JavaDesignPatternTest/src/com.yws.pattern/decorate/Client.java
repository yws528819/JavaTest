package com.yws.pattern.decorate;

/**
 * 装饰模式
 * @author Administrator
 * 动态地给一个对象添加一些额外的职责
 */
public class Client {
	public static void main(String[] args) {
		Foo foo = new Foo();
		
		foo = new FooDecorate(foo);
		
		foo.method();
		
	}
}
