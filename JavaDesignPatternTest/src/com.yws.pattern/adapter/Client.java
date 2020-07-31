package com.yws.pattern.adapter;

/**
 * 适配器模式（对象适配器）
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		//直接用子类实现（对比）
		Target target = new TargetSon();
		target.request();
		
		//将一个接口转换成客户希望的另一个接口
		Target adapteTarget = new Adapter(new Adaptee());
		adapteTarget.request();
	}
}
