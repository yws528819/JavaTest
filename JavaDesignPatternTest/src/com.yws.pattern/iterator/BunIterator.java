package com.yws.pattern.iterator;

import java.util.ArrayList;

public class BunIterator implements MyIterator{
	ArrayList<Item> buns;
	int poisiton;
	
	public BunIterator(ArrayList<Item> buns) {
		super();
		this.buns = buns;
		poisiton = 0;
	}

	@Override
	public boolean hasNext() {
		if (buns != null && poisiton < buns.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Item next() {
		return buns.get(poisiton++);
	}

}
