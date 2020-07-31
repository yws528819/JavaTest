package com.yws.pattern.build;

/**
 * 具体建造者
 * @author Administrator
 *
 */
public class ConcreteBuilder extends Builder {

	@Override
	public void createPartA() {
		pro.setPartA("A部分");
		System.out.println("创建产品的A部分");

	}

	@Override
	public void createPartB() {
		pro.setPartB("B部分");
		System.out.println("创建产品的B部分");

	}

	@Override
	public void createPartC() {
		pro.setPartC("C部分");
		System.out.println("创建产品的C部分");

	}

}
