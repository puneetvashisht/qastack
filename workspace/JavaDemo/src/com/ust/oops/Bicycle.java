package com.ust.oops;

public abstract class Bicycle {
	int speed;
	public Bicycle() {
		
	}
	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}
	
//	public void speedUp() {
//		speed++;
//	}
	
	public abstract void speedUp();
	
	public void brakeDown() {
		speed--;
	}

	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + "]";
	}
	
	

}
