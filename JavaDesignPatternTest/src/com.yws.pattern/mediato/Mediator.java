package com.yws.pattern.mediato;

/**
 * 抽象者中介
 * @author Administrator
 *
 */
public abstract class Mediator {
	//定义与同事间的交互通信 
	public abstract void common(String type);
}
