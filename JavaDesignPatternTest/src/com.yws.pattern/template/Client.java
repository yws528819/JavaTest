package com.yws.pattern.template;

/**
 * 模板模式
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Game game = new BattleGame();
		game.play();
	}
}
