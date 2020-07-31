package com.yws.pattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Library {
	//图书馆
	private static Library factory = new Library();
	//图书馆维护一个图书列表
	private Map<String, Book> bookPools = new HashMap<String, Book>();
	
	
	public static Library getInstance() {
		return factory;
	}
	
	//图书馆外借书本
	public Book libToBorrow(String bookName) {
		Book order = null;
		//如果书架有，直接借出
		if (bookPools.containsKey(bookName)) {
			order = bookPools.get(bookName);
		}else {
			//如果没有，新调一本新书
			order = new ConcreteBook(bookName);
			bookPools.put(bookName, order);
		}
		return order;
		
	}
	
	/**
	 * 图书馆书架上的书的数量
	 * @return
	 */
	public int getAllBookSize() {
		return bookPools.size();
	}
	
	
}
