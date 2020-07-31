package com.yws.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工业务报表类
 * @author Administrator
 *
 */
public class BusinessReport {
	private List<Staff> mStaffs = new ArrayList<Staff>();
	
	public BusinessReport() {
		mStaffs.add(new Manager("经理A"));
		mStaffs.add(new Engineer("工程师-A"));
		mStaffs.add(new Engineer("工程师-B"));
		mStaffs.add(new Manager("经理B"));
		mStaffs.add(new Engineer("工程师-C"));
		mStaffs.add(new Engineer("工程师-D"));
		mStaffs.add(new Engineer("工程师-E"));
		mStaffs.add(new Manager("经理C"));;
	}

	/**
	 * 为访问者展示报表
	 * @param visitor 公司高层，如CEO、CTO
	 */
	public void showReports(Visitor visitor) {
		for (Staff staff : mStaffs) {
			staff.accept(visitor);
		}
	}
	
}
