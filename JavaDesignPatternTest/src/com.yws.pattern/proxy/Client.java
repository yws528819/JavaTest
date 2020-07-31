package com.yws.pattern.proxy;

/**
 * 动态代理(动态代理)
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		IDog dog = (IDog) MyProxyFactory.getProxy(new GunDog());
		dog.run();
	}
}
