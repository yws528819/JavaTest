package com.yws.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录模式:在不破坏封装的前提下，捕获一个对象的内部状态。并在对象之外保存这个状态。方便随时替换。
 * @author Administrator
 * 剧情
 * 小明跟女神去沙滩玩耍，当天肯定是回不来了。晚上他俩住旅馆。女神去洗澡，小明没事干就翻看女神的手机。
 * 然而女神的手机里面有一个交往过的男友的记录。女神怕小明误会，就给删除了。
 * 然而这个记录实际上是有个备份的。而小明却还原了这个备份。
 */
public class Client {
	public static void main(String[] args) {
		List<Man> manList = new ArrayList<Man>();
		manList.add(new Man("小A", 20));
		manList.add(new Man("小B", 21));
		manList.add(new Man("小V", 22));
		manList.add(new Man("小C", 21));
		
		//女神的记录
		MobileOwner mobileOwner = new MobileOwner(manList);
		mobileOwner.show();
		
		//创建备忘录
		ContactMemento createMemento = mobileOwner.createMemento();
		
		//删除女神的记录
		mobileOwner.manList.clear();
		mobileOwner.show();
		
		//恢复女神的记录
		mobileOwner.restoreMemento(createMemento);
		mobileOwner.show();
		
		
	}
}
