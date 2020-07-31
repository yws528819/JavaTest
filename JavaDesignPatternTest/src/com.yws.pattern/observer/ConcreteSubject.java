package com.yws.pattern.observer;
/**
 * 继承Subject类，在这里实现具体业务，在具体项目中，该类会有很多变种。
 * @author Administrator
 * ConcreteSubject类是具体主题，将有关状态存入具体观察者对象，在具体主题内部状态改变时，给所有登记过的观察者发出通知
 */
public class ConcreteSubject extends Subject {

	public void doSomething() {
		//...
		notifyObserver();
	}
}
