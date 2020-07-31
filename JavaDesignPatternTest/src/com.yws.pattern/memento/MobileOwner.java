package com.yws.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 操作备忘录（手机）
 * @author Administrator
 *
 */
public class MobileOwner {
	public List<Man> manList;

	public MobileOwner(List<Man> manList) {
		super();
		this.manList = manList;
	}

	//创建备忘录
	public ContactMemento createMemento() {
		return new ContactMemento(new ArrayList<Man>(manList));
	}
	
	//备忘录数据导入
	public void restoreMemento(ContactMemento memento) {
		manList = memento.manList;
	}
	
	//显示现在的备忘录
	public void show() {
		System.out.println("联系人列表中有" + manList.size() + "人");
		for (Man man : manList) {
			System.out.println("姓名: " + man.getName() + ", 年龄：" + man.getAge());
		}
	}
}
