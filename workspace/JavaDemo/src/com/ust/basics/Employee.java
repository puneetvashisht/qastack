package com.ust.basics;

public class Employee {
	
	//Attributes
	int id;
	String name;
	double salary;
	Address address;
	
	//Methods
	public void incrementSalary(double amount) {
		this.salary = this.salary + amount;
	}
	
	//Constructor - sets up values/state for an object
	public Employee(int id, String name, double salary, Address address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	// String representation of an object
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	public static void main(String[] args) {
		// Create Objects
		Address address = new Address(23, "DF", "Delhi");
		
		Employee employee = new Employee(12, "Ravi", 344343.34, address);
		System.out.println(employee.name);
		System.out.println(employee);
		
		Employee emp2 = new Employee(123, "Priya", 34343.34, address);
		System.out.println(emp2);
		emp2.incrementSalary(5000);
		System.out.println(emp2);
	}

	

}
