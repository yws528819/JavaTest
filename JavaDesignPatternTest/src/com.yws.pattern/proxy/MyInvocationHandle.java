package com.yws.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandle implements InvocationHandler {
	private Object obj;
	
	public MyInvocationHandle(Object obj) {
		super();
		this.obj = obj;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		DogUtils.method1();
		method.invoke(obj, args);
		DogUtils.method2();
		
		return null;
	}

}
