package com.ust.oops;

public class MountainBicycle extends Bicycle {

	int gears;
	
	
	public MountainBicycle(int speed, int gears) {
		super(speed);
		this.gears = gears;
	}
	
	public void shiftGear(int gearNumber) {
		this.gears = gearNumber;
	}

	@Override
	public String toString() {
		return "MountainBicycle [gears=" + gears + ", speed=" + speed + "]";
	}

	@Override
	public void speedUp() {
		this.speed = this.speed + 2;
		
	}

	
	

}
