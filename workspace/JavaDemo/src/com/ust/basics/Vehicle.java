package com.ust.basics;

public class Vehicle {
	
	int speed;
	
	public Vehicle() {
		
	}
	
	public Vehicle(int speed) {
		super();
		this.speed = speed;
	}



	public void incrementSpeed() {
		speed++;
	}



	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + "]";
	}
	
	

}
