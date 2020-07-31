package com.yws.pattern.single;

/**
 * 饿汉式单例：（立即加载）
 * @author Administrator
 *
 */
public class SingleDemo1 {
	private static SingleDemo1 single1 = new SingleDemo1();
	
	private SingleDemo1() {
		
	}
	
	public static SingleDemo1 getSingleInstance() {
		return single1;
	}
}
