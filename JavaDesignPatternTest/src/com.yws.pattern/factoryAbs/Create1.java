package com.yws.pattern.factoryAbs;

public class Create1 extends AbstractFactory {

	@Override
	public AbstractProduct createProduct() {
		return new Product1();
	}

	@Override
	public AbstractGift createGift() {
		return new Gift1();
	}

}
