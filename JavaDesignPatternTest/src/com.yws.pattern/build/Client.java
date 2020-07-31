package com.yws.pattern.build;

/**
 * 建造者模式
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Builder build = new ConcreteBuilder();
		Director director = new Director(build);
		Product pro = director.construct();
		System.out.println(pro);
	}
}
