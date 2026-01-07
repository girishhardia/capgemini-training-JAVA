
// college wants to manage different branches of engineers using Java inheritance.

// You are given a superclass Engineer and a subclass CSEEngineer.

// Class Structure
// Engineer
// 	Method: work()
// CSEEngineer (extends Engineer)
// 	Method: coding()

// Task :
// 	Create a superclass Engineer with method work().
// 	Create a subclass CSEEngineer with an additional method coding().
// 	In the main method:
// 		Create a CSEEngineer object.
// 		Perform upcasting and call the work() method.
// 		Perform downcasting and call the coding() method.
// 	Add proper comments to explain each step.

class Engineer {
    public void work() {
        System.out.println("Engineer is working on a project.");
    }
}

class CSEEngineer extends Engineer {
    
    public void work() {
        System.out.println("CSE Engineer is working on software development.");
    }

    public void coding() {
        System.out.println("CSE Engineer is writing code in Java.");
    }
}

public class Q1 {
    public static void main(String[] args) {
        System.out.println("--- CSEEngineer Object Creation ---");
        // Create a CSEEngineer object
        CSEEngineer cse = new CSEEngineer();
        
        System.out.println("--- Upcasting ---");
        // Perform upcasting: Storing Subclass object in Superclass reference
        // Implicitly casted to Engineer type
        Engineer eng = cse; 
        
        // call the work() method
        // Accessing common method using superclass reference
        eng.work(); 
        
        // logic: eng.coding(); // This would give a compile-time error because 'coding()' is undefined in Engineer

        System.out.println("--- Downcasting ---");
        // Perform downcasting: converting Superclass reference back to Subclass reference
        // Explicit casting is required
        CSEEngineer cseDowncasted = (CSEEngineer) eng;
        
        // call the coding() method
        // Accessing specialized method using subclass reference
        cseDowncasted.work();
        cseDowncasted.coding();
    }
}
