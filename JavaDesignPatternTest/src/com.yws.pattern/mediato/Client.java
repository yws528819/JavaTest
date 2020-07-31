package com.yws.pattern.mediato;

/**
 * 中介者模式
 * @author Administrator
 * 一个中介对象来管理处理这些多个对象之间的管理依赖关系，解决紧耦合、抵御一动牵全身的变化。
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("租客看房：");
		
		//初始化中介
		HouseMediator houseMediator = new HouseMediator();
		
		//初始化房屋信息
		SmallHouseColleague smallHouseColleague = new SmallHouseColleague();
		TwoHouseColleague twoHouseColleague = new TwoHouseColleague();
		ThreeHouseColleague threeHouseColleague = new ThreeHouseColleague();
		
		//中介获取房屋信息
		houseMediator.setSmallHouse(smallHouseColleague);
		houseMediator.setTwoHouse(twoHouseColleague);
		houseMediator.setThreeHouse(threeHouseColleague);
		
		//租户A需要两居室，提供看房
		houseMediator.common("两居室");
		
		//租户B需要四居室，暂无房源
		houseMediator.common("四居室");
	}
}
