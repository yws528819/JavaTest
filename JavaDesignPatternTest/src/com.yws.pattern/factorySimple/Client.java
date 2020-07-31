package com.yws.pattern.factorySimple;

/**
 * 简单工厂模式
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Product proA = Factory.creatPro("A");
		proA.desc();
		Product proB = Factory.creatPro("B");
		proB.desc();
	}
}
