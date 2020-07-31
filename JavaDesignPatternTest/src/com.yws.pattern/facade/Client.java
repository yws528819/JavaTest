package com.yws.pattern.facade;

/**
 * 外观模式
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		
		facade.methodA();
		facade.mehtodB();
	}
}
