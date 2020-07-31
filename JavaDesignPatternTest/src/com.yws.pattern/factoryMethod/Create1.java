package com.yws.pattern.factoryMethod;

public class Create1 extends AbstractFactory {

	@Override
	public AbstractProduct createProduct() {
		return new Product1();
	}

}
