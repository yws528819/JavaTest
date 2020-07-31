package com.yws.pattern.ChainOfResponsibility;

public class Leave implements ILeave {

	private String name;
	private int num;
	private String content;
	
	public Leave(String name, int num, String content) {
		super();
		this.name = name;
		this.num = num;
		this.content = content;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getNum() {
		return num;
	}

	@Override
	public String getContent() {
		return content;
	}

}
