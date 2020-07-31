package com.yws.pattern.factoryMethod;

/**
 * 工厂方法模式
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractFactory factory1 = new Create1();
		factory1.createProduct().desc();
		
		AbstractFactory factory2 = new Create2();
		factory2.createProduct().desc();		
	}
}
