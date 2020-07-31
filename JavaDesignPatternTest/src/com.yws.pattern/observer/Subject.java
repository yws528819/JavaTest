package com.yws.pattern.observer;

import java.util.Vector;

/**
 * 主题Subject
 * @author Administrator
 * Subject类是主题，它把所有对观察者对象的引用文件存在了一个聚集里，每个主题都可以有任何数量的观察者。
 * 抽象主题提供了一个接口，可以增加和删除观察者对象；
 */
public class Subject {
	//观察者数组
	private Vector<Observer>  oVector = new Vector<Observer>();
	
	//增加一个观察者
	public void addObserver(Observer observer) {
		oVector.add(observer);
	}
	
	//删除一个观察者
	public void deleteObserver(Observer observer) {
		oVector.remove(observer);
	}
	
	//通知所有观察者
	public void notifyObserver() {
		for (Observer observer : oVector) {
			observer.update();
		}
	}
}
