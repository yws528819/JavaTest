package com.yws.pattern.ChainOfResponsibility;

public class BigManager extends Handler{

	//部门经理处理7天以上的请假
	public BigManager() {
		super(Handler.NUM_SEVEN);
	}

	@Override
	protected void handleLeave(ILeave leave) {
		System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
		System.out.println("总经理审批：同意。");
	}

}
