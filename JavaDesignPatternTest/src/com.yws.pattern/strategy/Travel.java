package com.yws.pattern.strategy;

public class Travel {
	private TravelStrategy strtegy;

	public Travel(TravelStrategy strtegy) {
		super();
		this.strtegy = strtegy;
	}




	public void travleStyle() {
		strtegy.travelStyle();
	}
	
}
