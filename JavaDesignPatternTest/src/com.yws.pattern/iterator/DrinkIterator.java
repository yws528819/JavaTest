package com.yws.pattern.iterator;

public class DrinkIterator implements MyIterator {
	private Item[] items;
	private int position;
	
	
	public DrinkIterator(Item[] items) {
		super();
		this.items = items;
		position = 0;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Item next() {
		return items[position++];
	}

}
