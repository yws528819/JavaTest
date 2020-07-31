package com.yws.pattern.factorySimple;

public class Factory {
	public static Product creatPro(String type) {
		switch(type) {
		case "A" :
			return new ProductA();
		case "B" :
			return new ProductB();
		default : 
			return null;
		}
	}
}
