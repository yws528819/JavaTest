package com.yws.pattern.decorate;

public abstract class Decorate extends Foo {
	private Foo foo;
	
	public Decorate(Foo foo) {
		this.foo = foo;
	}

	@Override
	public void method() {
		if (foo != null) {
			foo.method();
		}
	}
	
	
	
}
