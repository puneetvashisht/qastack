package com.ust.basics;

public class Address {
	
	int houseNumber;
	String location;
	String city;
	
	//constructor
	public Address(int houseNumber, String location, String city) {
		this.houseNumber = houseNumber;
		this.location = location;
		this.city = city;
	}
	
	//method
	void changeHouseNumber(int newHouseNumber) {
		this.houseNumber = newHouseNumber;
	}
	
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", location=" + location + ", city=" + city + "]";
	}
	
	
	
	

}
