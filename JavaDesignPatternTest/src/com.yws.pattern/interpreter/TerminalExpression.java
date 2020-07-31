package com.yws.pattern.interpreter;

/**
 * 终结符表达式
 * @author Administrator
 * 实现与文法中的终结符相关联的解释操作
 */
public class TerminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		 System.out.println("终端解释器");

	}

}
