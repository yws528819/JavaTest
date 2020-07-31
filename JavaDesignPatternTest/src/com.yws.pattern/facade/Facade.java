package com.yws.pattern.facade;

/**
 * 外观类
 * @author Administrator
 * Facade是外观角色，也叫门面角色，客户端可以调用这个角色的方法，此角色知晓子系统的所有功能和责任，
 * 将客户端的请求代理给适当的子系统对象；
 * Subsystem是子系统角色，可以同时拥有一个或多个子系统，每一个子系统都不是一个单独的类，而是一个类的集合，
 * 子系统并不知道门面的存在。
 */
public class Facade {
	private SubSystemA sysA;
	private SubSystemB sysB;
	public Facade() {
		sysA = new SubSystemA();
		sysB = new SubSystemB();
	}
	
	
	public void methodA() {
		sysA.methodA();
	}
	
	public void mehtodB() {
		sysB.methodB();
	}
	
}
