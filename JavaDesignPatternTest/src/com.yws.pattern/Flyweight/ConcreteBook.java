package com.yws.pattern.Flyweight;

/**
 * 具体享元类
 * @author Administrator
 *
 */
public class ConcreteBook implements Book {
	private String name;
	
	public ConcreteBook(String name) {
		super();
		this.name = name;
	}



	@Override
	public void borrow() {
		System.out.println("图书馆借出一本书，书名:" + this.name);

	}

}
