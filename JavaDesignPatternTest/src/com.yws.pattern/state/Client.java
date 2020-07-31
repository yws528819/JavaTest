package com.yws.pattern.state;
/**
 * 状态模式
 * @author Administrator
 * 状态模式解决的问题：状态模式主要解决的是当控制一个对象状态的条件表达式过于复杂时的情况。
 * 把状态的判断逻辑转移到表示不同状态的一系列类中，可以把复杂的判断逻辑简化。
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Hero hero = new Hero();
        hero.startRun();
        hero.setState(Hero.SPEED_UP_STATE);
        Thread.sleep(5000);
        hero.setState(Hero.SPEED_DOWN_STATE);
        Thread.sleep(5000);
        hero.setState(Hero.SWIM_STATE);
        Thread.sleep(5000);
        hero.stopRun();
	}
}
