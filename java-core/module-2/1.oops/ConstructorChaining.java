// what is constructor chaining 
// constructor chaining is the process of calling one constructor from another 
// constructor of the same class.
// Why constructor recursion is not allowed?
// constructor recursion is not allowed because it will create infinite loop.    
// What is constructor overloading?
// constructor overloading is the process of creating multiple constructors in the same class with different parameters. 
// difference between constructor overloading and method overloading?
// constructor overloading is the process of creating multiple constructors in the same class with different parameters. 
// method overloading is the process of creating multiple methods in the same class with different parameters.
// what use of parametarized constructor?
// parametarized constructor is used to initialize the instance variables of the class.
// what is use of copy constructor?
// copy constructor is used to initialize the instance variables of the class with the help of another object.

public class ConstructorChaining {
    int id;
    String name;
    double sal;
    
    public ConstructorChaining() {
        this.id = 101;
        this.name = "unknown";
        this.sal = 50000.0;
    }
    
    public ConstructorChaining(int id) {
        this();
        this.id = id;
        
    }
    
    public ConstructorChaining(int id, String name) {
        this(id);
        this.name = name;
    }
    
    public ConstructorChaining(int id, String name, double sal) {
        this(id, name);
        this.sal = sal;
    }
    
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + sal);
    }
    
    public static void main(String[] args) {
        ConstructorChaining emp1 = new ConstructorChaining();
        ConstructorChaining emp2 = new ConstructorChaining(102);
        ConstructorChaining emp3 = new ConstructorChaining(103, "John");
        ConstructorChaining emp4 = new ConstructorChaining(104, "Jane", 60000.0);
        
        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
    }
}