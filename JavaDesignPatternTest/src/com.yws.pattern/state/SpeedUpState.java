package com.yws.pattern.state;

public class SpeedUpState implements RunState{

	@Override
	public void run(Hero hero) {
		System.out.println("-------加速跑动--------");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		hero.setState(Hero.COMMON);
		System.out.println("-------加速状态结束，变为正常状态--------");
	}

}
