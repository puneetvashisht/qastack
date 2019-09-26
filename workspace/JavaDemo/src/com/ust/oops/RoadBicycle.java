package com.ust.oops;

public class RoadBicycle extends Bicycle {

	
	public RoadBicycle(int speed) {
		super(speed);
	}

	@Override
	public String toString() {
		return "RoadBicycle [speed=" + speed + "]";
	}

	@Override
	public void speedUp() {
		this.speed = this.speed + 1;
		
	}
	
	

}
