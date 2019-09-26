package com.ust.basics;

public class Plane extends Vehicle{
	
	int altitude;
	
	public Plane(int speed, int altitude) {
//		this.speed = speed;
		super(speed);
		this.altitude = altitude;
	}

	@Override
	public String toString() {
		return "Plane [altitude=" + altitude + ", speed=" + speed + "]";
	}
	
	

}
