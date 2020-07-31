package com.yws.pattern.interpreter;

import java.util.ArrayList;
import java.util.List;
/**
 * 解释器模式
 * @author Administrator
 * 给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		
		List<AbstractExpression> list = new ArrayList<AbstractExpression>();//语法容器，容纳一个具体的表达式
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());

		for (AbstractExpression expression : list) {
			expression.interpret(context);
		}
	}
}
