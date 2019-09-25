package com.ust.basics;

public class TestAddress {

	public static void main(String[] args) {
		Address address = new Address(23, "GK", "New Delhi");
		System.out.println(address);
		address.changeHouseNumber(25);
		System.out.println(address);
	}

}
