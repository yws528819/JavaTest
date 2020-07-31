package com.yws.pattern.visitor;

import java.util.Random;

/**
 * 员工基类
 * @author Administrator
 *
 */
public abstract class Staff {
	public String name;
	public int kpi;//员工kpi
	public Staff(String name) {
		super();
		this.name = name;
		this.kpi = new Random().nextInt(10);
	}

	public abstract void accept(Visitor visitor);
	
	
	
	
	
}
