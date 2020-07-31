package com.yws.pattern.iterator;
/**
 * 饮品则比较固定，一般不会增加新的类型，所以就假设固定成5种,选择使用数组来实现
 * @author Administrator
 *
 */
public class Drink {
	Item[] drinks;
	int position;
	private static final int MAX_SIZE = 5;
	
	public Drink() {
		drinks = new Item[5];
		position = 0;
		
		addDrink(new Item("豆浆", 1));
		addDrink(new Item("八宝粥", 3));
		addDrink(new Item("牛奶花生", 3));
		addDrink(new Item("银耳汤", 2));
		addDrink(new Item("豆腐脑", 2));
	}
	
	
	
	private void addDrink(Item item) {
		if (position > MAX_SIZE) {
			System.out.println("饮品已经满了。。。");
		}else {
			drinks[position ++] = item;
		}
	}
	
	public Item[] getDrinks() {
		return drinks;
	}
	
	
	public DrinkIterator createDrinkIterator() {
		return new DrinkIterator(drinks);
	}
	
}
