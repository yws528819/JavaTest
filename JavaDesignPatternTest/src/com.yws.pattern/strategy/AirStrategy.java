package com.yws.pattern.strategy;

public class AirStrategy implements TravelStrategy {

	@Override
	public void travelStyle() {
		System.out.println("乘坐飞机。。。");

	}

}
