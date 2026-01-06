// super calling statment is a construcor calling statement, it is uded to call constructor of super class
// super calling statement must be the first statement in any constructor
//if programmer has not returned this calling statement then by default compiular will add no arguments super ststement
// we can not use this and super calling statemrnt in same constructor
// we can use only one super calling statement int one constructor

// This is the parent class
class Father {

    // Instance variable of Father class
    int a = 10;

    // Non-static method
    public void test() {
        System.out.println("Father class non static method");
    }

    // Instance Initialization Block (IIB)
    // Executes every time an object is created
    // Runs BEFORE constructor
    {
        System.out.println("IIB Father class");
    }

    // Constructor of Father class
    // Executes after IIB
    public Father() {
        System.out.println("Father class Constructor");
    }
}

// Child class extending Father
class Son extends Father {

    // Instance variable of Son class
    int b = 20;

    // Non-static method
    public void demo() {
        System.out.println("Son class non static method");
    }

    // Instance Initialization Block (IIB) of Son class
    // Executes after Father constructor
    // Executes before Son constructor
    {
        System.out.println("IIB Son class");
    }

    // Constructor of Son class
    public Son() {
        System.out.println("Son class constructor");
    }
}

// Driver class (contains main method)
public class P6 {

    // Instance Initialization Block of Driver class
    // This will NOT execute because no object of P6 is created
    {
        System.out.println("IIB Driver class");
    }

    // Main method - JVM execution starts from here
    public static void main(String[] args) {

        System.out.println("Main start");

        // Object creation of Son class
        // This triggers the full parent-child execution flow
        Son ref = new Son();

        System.out.println("Main end");
    }
}
