package com.yws.pattern.component;

/**
 * 组合模式
 * @author Administrator
 *
 *将对象组合成树形结构以表示“部分-整体”的层次结构。
 *组合模式使得用户对单个对象和组合对象的使用具有唯一性。
 *组合模式是一种结构型模式。
 */
public class Client {
	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		
		Composite compX = new Composite("Composite X");
		compX.add(new Leaf("Leaf XA"));
		compX.add(new Leaf("Leaf XB"));
		
		root.add(compX);
		
		Composite compXY = new Composite("Composite XY");
		compXY.add(new Leaf("Leaf XYA"));
		compXY.add(new Leaf("Leaf XYB"));
		
		root.add(compXY);
		
		root.display(1);
		
	}
}
