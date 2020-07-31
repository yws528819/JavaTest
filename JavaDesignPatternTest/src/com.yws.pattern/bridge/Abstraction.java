package com.yws.pattern.bridge;

public abstract class Abstraction {
	private Implementor imp;

	public Abstraction(Implementor imp) {
		super();
		this.imp = imp;
	}
	
	public Implementor getImp() {
		return imp;
	}



	public void request() {
		imp.doSomeThing();
	}
}
