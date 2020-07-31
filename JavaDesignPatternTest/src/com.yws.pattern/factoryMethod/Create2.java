package com.yws.pattern.factoryMethod;

public class Create2 extends AbstractFactory {

	@Override
	public AbstractProduct createProduct() {
		return new Product2();
	}

}
