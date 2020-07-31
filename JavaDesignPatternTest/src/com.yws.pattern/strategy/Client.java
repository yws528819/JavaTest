package com.yws.pattern.strategy;

/**
 * 策略模式
 * @author Administrator
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Travel travel = new Travel(new TrainStrategy());
		travel.travleStyle();
		
		travel  = new Travel(new HighTrainStrategy());
		travel.travleStyle();
		
		travel = new Travel(new AirStrategy());
		travel.travleStyle();
		
	}
}
