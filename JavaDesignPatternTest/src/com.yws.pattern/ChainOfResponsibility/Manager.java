package com.yws.pattern.ChainOfResponsibility;

public class Manager extends Handler{

	//部门经理处理3-7天的请假
	public Manager() {
		super(Handler.NUM_THREE, Handler.NUM_SEVEN);
	}

	@Override
	protected void handleLeave(ILeave leave) {
		System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
		System.out.println("部门经理审批：同意。");
	}

}
