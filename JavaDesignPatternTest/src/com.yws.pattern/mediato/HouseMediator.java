package com.yws.pattern.mediato;

public class HouseMediator extends Mediator {

	private SmallHouseColleague smallHouse;
	private TwoHouseColleague twoHouse;
	private ThreeHouseColleague threeHouse;
	
	
	public SmallHouseColleague getSmallHouse() {
		return smallHouse;
	}

	public void setSmallHouse(SmallHouseColleague smallHouse) {
		this.smallHouse = smallHouse;
	}

	public TwoHouseColleague getTwoHouse() {
		return twoHouse;
	}


	public void setTwoHouse(TwoHouseColleague twoHouse) {
		this.twoHouse = twoHouse;
	}

	public ThreeHouseColleague getThreeHouse() {
		return threeHouse;
	}


	public void setThreeHouse(ThreeHouseColleague threeHouse) {
		this.threeHouse = threeHouse;
	}




	@Override
	public void common(String type) {
		switch(type) {
		case "单间" :
			smallHouse.handle();
			System.out.println("如果可以就可以租房了！");
			break;
		case "两居室" :
			twoHouse.handle();
			System.out.println("如果可以就可以租房了！");
			break;
		case "三居室" :
			threeHouse.handle();
			System.out.println("如果可以就可以租房了！");
			break;
		default:
			System.out.println(type + "暂时没有房源");
			break;
		}

	}

}
