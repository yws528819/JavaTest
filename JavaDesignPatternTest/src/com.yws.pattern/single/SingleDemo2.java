package com.yws.pattern.single;

/**
 * 懒汉式单例：（延迟加载）
 * @author Administrator
 *
 */
public class SingleDemo2 {
	private static SingleDemo2 single2;
	
	private SingleDemo2() {
		
	}
	
	public static synchronized SingleDemo2 getSingleInstance() {
		if (single2 == null) {
			return new SingleDemo2();
		}else {
			return single2;
		}
	}
}
