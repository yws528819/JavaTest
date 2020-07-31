package com.yws.pattern.template;

public class BattleGame extends Game{

	@Override
	void initialize() {
		System.out.println("Battle Game 加载完成，开始启动。。。");
		
	}

	@Override
	void startPlay() {
		System.out.println("Battle Game 游戏开始，祝你玩得愉快~");
		
	}

	@Override
	void endPlay() {
		System.out.println("Battle Game 游戏结束，拜拜~");
		
	}

}
