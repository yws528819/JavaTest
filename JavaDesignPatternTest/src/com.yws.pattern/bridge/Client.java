package com.yws.pattern.bridge;

/**
 * 桥接模式
 * @author Administrator
 * 将抽象部分与它的实现部分分离，使它们都可以独立地变化
 */
public class Client {
	public static void main(String[] args) {
		Implementor impA = new ConcreteImplementorA();//具体的行为实现
		Abstraction abstraction = new RefinedAbstraction(impA);//类
		
		abstraction.request();
	}
}
