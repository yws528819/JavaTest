package com.yws.pattern.command;

/**
 * 命令模式
 * @author Administrator
 * 命令模式是对命令的封装。命令模式把发出命令的责任和执行命令的责任分割开，委派给不同的对象。
 */
public class Client {
	public static void main(String[] args) {
		//创建接收者
		Receiver receiver = new Receiver();
		
		//创建命令对象，设定它的接收者
		Command myCommand = new ConcreteCommand(receiver);
		
		//创建请求者，把命令对象设置进去
		Invoker invoker = new Invoker(myCommand);
		
		//执行方法
		invoker.action();
	}
}
