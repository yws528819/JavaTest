package com.yws.pattern.interpreter;

/**
 * 非终结符表达式
 * @author Administrator
 * 非终结符表达式，为文法中的非终结符实现解释操作
 */
public class NonterminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("非终端解释器");

	}

}
