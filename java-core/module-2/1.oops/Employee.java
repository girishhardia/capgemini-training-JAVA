class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

public class Employee {
    int id;
    Address address;

    // Parameterized constructor
    public Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    // Copy Constructor (Shallow Copy)
    public Employee(Employee emp) {
        this.id = emp.id;
        // Shallow copy: assigning the same reference
        this.address = emp.address; 
    }

    public void display() {
        System.out.println("ID: " + id + ", City: " + address.city);
    }

    public static void main(String[] args) {
        // 1. Create employee emp1
        Address addr = new Address("Mumbai");
        Employee emp1 = new Employee(101, addr);

        // 2. Create emp2 using copy constructor
        Employee emp2 = new Employee(emp1);

        System.out.println("Before modification:");
        System.out.print("Emp1: "); emp1.display();
        System.out.print("Emp2: "); emp2.display();

        // 3. Change city via emp2
        // Since it's a shallow copy, they share the SAME Address object
        emp2.address.city = "Pune";

        System.out.println("\nAfter modification (City changed to Pune via Emp2):");
        
        // 4. Print city of both employees
        System.out.print("Emp1: "); emp1.display();
        System.out.print("Emp2: "); emp2.display();
        
        if(emp1.address.city.equals(emp2.address.city)) {
            System.out.println("\nNotice: Emp1's city also changed because it shares the same Address object.");
        }
    }
}
