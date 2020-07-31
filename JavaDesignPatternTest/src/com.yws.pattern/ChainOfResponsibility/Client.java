package com.yws.pattern.ChainOfResponsibility;

public class Client {
	public static void main(String[] args) {
		//请假条
		ILeave leave = new Leave("小花", 7, "身体不适");
		
		//各位领导
		Handler groupLeader = new GroupLeader();
		Handler manager = new Manager();
		Handler bigManager = new BigManager();
		
		groupLeader.setNextHandler(manager);//小组长的领导是部门经理
		manager.setNextHandler(bigManager);//部门经理的领导是总经理
		
		//提交申请
		groupLeader.submit(leave);
	}
}
