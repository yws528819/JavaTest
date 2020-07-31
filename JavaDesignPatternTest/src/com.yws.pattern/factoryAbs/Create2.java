package com.yws.pattern.factoryAbs;

public class Create2 extends AbstractFactory {

	@Override
	public AbstractProduct createProduct() {
		return new Product2();
	}

	@Override
	public AbstractGift createGift() {
		return new Gift2();
	}

}
