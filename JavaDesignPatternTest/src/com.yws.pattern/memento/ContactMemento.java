package com.yws.pattern.memento;

import java.util.List;

/**
 * 备忘录实体
 * @author Administrator
 *
 */
public class ContactMemento {
	public List<Man> manList;
	
	public ContactMemento(List<Man> manList) {
		this.manList = manList;
	}
}
