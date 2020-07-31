package com.yws.pattern.bridge;

public class RefinedAbstraction extends Abstraction{
	
	public RefinedAbstraction(Implementor imp) {
		super(imp);
	}

	@Override
	public void request() {
		super.request();
		super.getImp().doAnyThing();
	}


}
