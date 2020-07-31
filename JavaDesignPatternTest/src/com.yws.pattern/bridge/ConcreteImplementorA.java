package com.yws.pattern.bridge;

public class ConcreteImplementorA implements Implementor {

	@Override
	public void doSomeThing() {
		System.out.println("具体实现A的doSomething执行");

	}

	@Override
	public void doAnyThing() {
		System.out.println("具体实现A的doAnyThing执行");

	}

}
