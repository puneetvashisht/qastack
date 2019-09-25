
public class Employee {
	
	//Attributes
	int id;
	String name;
	double salary;
	
	//Methods
	public void incrementSalary(double amount) {
		this.salary = this.salary + amount;
	}
	
	//Constructor - sets up values/state for an object
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	// String representation of an object
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + this.name + ", salary=" + this.salary + "]";
	}
	
	
	
	public static void main(String[] args) {
		// Create Objects
		Employee employee = new Employee(12, "Ravi", 344343.34);
		System.out.println(employee.name);
		System.out.println(employee);
		
		Employee emp2 = new Employee(123, "Priya", 34343.34);
		System.out.println(emp2);
		emp2.incrementSalary(5000);
		System.out.println(emp2);
	}

}
