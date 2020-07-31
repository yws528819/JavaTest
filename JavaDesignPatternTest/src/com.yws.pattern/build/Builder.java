package com.yws.pattern.build;

/**
 * 建造者
 * @author Administrator
 *
 */
public abstract class Builder {
	public Product pro = new Product();
	
	public abstract void createPartA();
	
	public abstract void createPartB();
	
	public abstract void createPartC();
	
	public Product getResult() {
		return pro;
	}
}
