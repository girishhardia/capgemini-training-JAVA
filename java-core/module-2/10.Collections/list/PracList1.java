/*
Q. You are given a Java program that defines two classes: Employee and Company.
- The Employee class has attributes for employee ID, name, and salary. It also 
contains a static method to create new Employee objects and a method to display 
employee details.
- The Company class maintains a list of employees and displays their details.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static Employee createEmployee(int id, String name, double salary) {
        return new Employee(id, name, salary);
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

class Company {
    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the company.");
        } else {
            System.out.println("Employee Details:");
            for (Employee emp : employees) {
                emp.displayDetails();
            }
        }
    }
}

public class PracList1 {
    public static void main(String[] args) {
        Company company = new Company();
        
        // Adding employees using the static create method
        company.addEmployee(Employee.createEmployee(101, "Alice", 50000));
        company.addEmployee(Employee.createEmployee(102, "Bob", 60000));
        company.addEmployee(Employee.createEmployee(103, "Charlie", 55000));

        // Displaying details
        company.displayAllEmployees();
    }
}
