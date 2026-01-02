// 2. Write a Java program that performs the following tasks:
// Create a class Employee with three attributes: id, name, and sal (salary).
// Implement a parameterized constructor to initialize these attributes.
// Create a non-static method printDetails() to display employee details.
// In the main() method:
// Create an 4 Employee object

// ---------------------------------------------------------------------

public class Employee1{

	int id;
	String name; 
	double sal;
	public Employee1(int id, String name, double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	public void printDetails(){
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.sal);
	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(123,"Mukesh",45623.5);
		e1.printDetails();

		Employee1 e2 = new Employee1(12345,"Dukesh",423423.5);
		e2.printDetails();

		Employee1 e3 = new Employee1(12367,"Sukesh",54323.5);
		e3.printDetails();

		Employee1 e4 = new Employee1(12389,"Tukesh",455343.5);
		e4.printDetails();
	}
}