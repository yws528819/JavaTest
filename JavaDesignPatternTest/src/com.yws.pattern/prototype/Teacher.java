package com.yws.pattern.prototype;

public class Teacher implements Cloneable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Teacher) super.clone();
	}
	
	
}
