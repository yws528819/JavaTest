package com.yws.pattern.ChainOfResponsibility;

public abstract class Handler {
	protected final static int NUM_ONE = 1;
	protected final static int NUM_THREE = 3;
	protected final static int NUM_SEVEN = 7;
	
	//该领导处理的请假天数区间
	private int numStart = 0;
	private int numEnd = 0;
	
	//领导上面还有领导
	private Handler nextHandler;

	//设置请假天数范围 上不封顶
	public Handler(int numStart) {
		super();
		this.numStart = numStart;
	}

	//设置请假天数范围
	public Handler(int numStart, int numEnd) {
		super();
		this.numStart = numStart;
		this.numEnd = numEnd;
	}

	//设置上级领导
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public final void submit(ILeave leave) {
		if (this.numStart == 0) {
			return;
		}
		
		if (leave.getNum() >= this.numStart) {
			this.handleLeave(leave);
		}
		
		if (this.nextHandler != null && leave.getNum() > this.numEnd) {
			this.nextHandler.submit(leave);
		}
		
	}
	
	//各级领导处理请假条方法
	protected abstract void handleLeave(ILeave leave);
}
