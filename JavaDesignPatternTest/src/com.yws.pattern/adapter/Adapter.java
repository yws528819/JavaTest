package com.yws.pattern.adapter;

/**
 * 适配器类
 * @author Administrator
 *
 */
public class Adapter implements Target{
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}



	@Override
	public void request() {
		adaptee.adapteeRequset();
	}

}
