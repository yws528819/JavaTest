package com.yws.pattern.decorate;

public class FooDecorate extends Decorate{

	public FooDecorate(Foo foo) {
		super(foo);
	}

	public void decorateMehod() {
		System.out.println("装饰的方法.....");
	}

	@Override
	public void method() {
		this.decorateMehod();
		super.method();
	}
	
	
}
