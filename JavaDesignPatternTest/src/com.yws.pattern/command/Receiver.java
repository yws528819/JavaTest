package com.yws.pattern.command;

/**
 * 接收者角色类
 * @author Administrator
 *
 */
public class Receiver {

	/**
	 * 真正执行命令相应的操作
	 */
	public void action() {
		System.out.println("执行操作");
	}
}
