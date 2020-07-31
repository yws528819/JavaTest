package com.yws.pattern.visitor;

/**
 * 访问者模式
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		BusinessReport report = new BusinessReport();
		System.out.println("===CEO看报表===");
		report.showReports(new CEOVisitor());
		System.out.println("===CTO看报表===");
		report.showReports(new CTOVisitor());
	}
}
