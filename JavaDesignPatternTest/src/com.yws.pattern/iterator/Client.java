package com.yws.pattern.iterator;

/**
 * 迭代器模式
 * @author Administrator
 * 提供了一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部实现。
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("======包子价格表=======");
		Bun buns = new Bun();
		BunIterator createBunIterator = buns.createBunIterator();
		printeMyIterator(createBunIterator);
		
		System.out.println("======饮料价格表=======");
		Drink drinks = new Drink();
		DrinkIterator createDrinkIterator = drinks.createDrinkIterator();
		printeMyIterator(createDrinkIterator);
		
	}
	
	private static void printeMyIterator(MyIterator myIterator) {
		while (myIterator.hasNext()) {
			Item next = myIterator.next();
			System.out.println(next.getName()+ ":" + next.getPrice());
		}
	}
}
