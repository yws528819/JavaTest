package com.yws.pattern.iterator;

import java.util.ArrayList;
/**
 * 由于包子会不定期更新，所以用一个ArrayList来存储目前所有的包子类别
 * @author Administrator
 *
 */
public class Bun {
	private ArrayList<Item> buns;
	
	
	public Bun() {
		buns = new ArrayList<Item>();
		
		buns.add(new Item("鲜肉包子", 1.5));
		buns.add(new Item("香菇青菜包子", 1));
		buns.add(new Item("烧麦", 1.5));
		buns.add(new Item("鱼香肉丝包子", 2));
	}
	
	public void addBun(String name, double price) {
		Item item = new Item(name, price);
		buns.add(item);
	}
	
	public ArrayList<Item> getBuns() {
		return buns;
	}
	
	
	public BunIterator createBunIterator() {
		return new BunIterator(buns);
	}
}
