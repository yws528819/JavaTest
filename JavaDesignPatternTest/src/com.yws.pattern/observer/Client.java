package com.yws.pattern.observer;

/**
 * 观察者模式
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		//创建一个主题
		Subject subject = new ConcreteSubject();
		//定义一个观察者
		Observer observer = new ConcreteObserver();
		//观察
		subject.addObserver(observer);
		//开始活动
		subject.notifyObserver();
	}
}
