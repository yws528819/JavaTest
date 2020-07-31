package com.yws.pattern.state;

public class SwimState implements RunState{

	@Override
	public void run(Hero hero) {
		System.out.println("-------眩晕跑动--------");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		hero.setState(Hero.COMMON);
		System.out.println("-------眩晕状态结束，变为正常状态--------");
	}

}
