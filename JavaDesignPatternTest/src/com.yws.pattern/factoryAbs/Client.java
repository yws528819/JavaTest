package com.yws.pattern.factoryAbs;

/**
 * 抽象工厂模式
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractFactory factory1 = new Create1();
		AbstractProduct proA = factory1.createProduct();
		AbstractGift proB = factory1.createGift();
		
		
		AbstractFactory factory2 = new Create2();
		factory2.createProduct().desc();	
		factory2.createGift().giftDesc();
	}
}
