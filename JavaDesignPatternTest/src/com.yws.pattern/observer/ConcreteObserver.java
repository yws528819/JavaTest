package com.yws.pattern.observer;

/**
 * 具体观察者
 * @author Administrator
 * ConcreteObserver是具体观察者，实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协同
 */
public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("收到消息，进行处理");

	}

}
