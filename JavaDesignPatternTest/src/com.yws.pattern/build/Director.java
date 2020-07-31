package com.yws.pattern.build;

/**
 * 指挥者
 * @author Administrator
 *
 */
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public Product construct() {
		builder.createPartA();
		builder.createPartB();
		builder.createPartC();
		return builder.getResult();
	}
}
