package com.yws.pattern.proxy;

import java.lang.reflect.Proxy;

/**
 * 生产代理对象的工厂
 * @author Administrator
 *
 */
public class MyProxyFactory {
	public static Object getProxy(Object target) {
		MyInvocationHandle handle = new MyInvocationHandle(target);
		
		Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handle);
		
		return proxy;
	}
}
