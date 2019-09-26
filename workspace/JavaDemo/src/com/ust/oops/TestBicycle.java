package com.ust.oops;

public class TestBicycle {

	public static void main(String[] args) {

		RoadBicycle rb = new RoadBicycle(5);
		System.out.println(rb);
		rb.speedUp();
		System.out.println(rb);
		rb.brakeDown();
		System.out.println(rb);
		
		MountainBicycle mb = new MountainBicycle(2, 1);
		System.out.println(mb);
		mb.speedUp();
		mb.shiftGear(2);
		System.out.println(mb);
		mb.brakeDown();
		mb.shiftGear(1);
		System.out.println(mb);
		
	}

}
