package com.yws.pattern.command;

/**
 * 请求者角色类
 * @author Administrator
 *
 */
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	
	/**
	 * 行动方法
	 */
	public void action() {
		command.execute();
	}
}
