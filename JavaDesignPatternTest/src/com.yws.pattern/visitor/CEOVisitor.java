package com.yws.pattern.visitor;

/**
 * CEO访问者
 * @author Administrator
 *
 */
public class CEOVisitor implements Visitor {

	@Override
	public void visit(Engineer engineer) {
		System.out.println("工程师：" + engineer.name + "， KPI：" + engineer.kpi);

	}

	@Override
	public void visit(Manager manager) {
		System.out.println("经理：" + manager.name + "，KPI：" + manager.kpi);

	}

}
