package com.yws.pattern.memento;

/**
 * 女神交往过的男人
 * @author Administrator
 *
 */
public class Man {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Man(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
