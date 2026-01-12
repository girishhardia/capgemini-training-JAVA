
// *_Object Class_*

// 1) Object class is defined inside java.lang package. 

// 2) Object class is the supermost class in all the classes in Java.

// 3) Object class has 11 nonstatic methods.

// OBJECT CLASS METHODS 
// 1. toString()
// 2. hashCode()
// 3. equals(Object obj)
// 4. finalize()
// 5. getClass()
// 6. clone()
// 7. wait()
// 8. wait(long l)
// 9. wait(long l,int i)
// 10. notify()
// 11. notifyAll()

// 1.  toString()
// Return type: String
// Used to return string representation of an object
// Called automatically when you print an object
// Returns address of an object in string format
// override toString() to return object's content(you manually define that overriden method example: return ["name=" + name + ", age=" + age])
// Why do we need toString()?
// To print object's data rather than address
// To debug
// To log
// To display object's content in a user-friendly format

// 2. equals(Object obj)
// Return type: boolean
// It is used to compare addresses of objects
// After overriding equals() we can compare content of objects
// Default implementation compares reference
// Why do we need equals()?
// To compare content of objects

public class P1{
    int id;
    String name;

    public P1(int id, String name){
        this.id = id;
        this.name = name;
    } 
    
    @Override
    public boolean equals(Object obj) {
        P1 ref = (P1)obj;
        return this.id == ref.id && this.name == ref.name;
    }
    
    public static void main(String[] args) {
        P1 ref1 = new P1(1, "John");
        P1 ref2 = new P1(1, "John");

        System.out.println(ref1 == ref2);  //false
        //System.out.println(ref1.equals(ref2));  //false because default implementation compares reference
        System.out.println(ref1.equals(ref2));  //true because we have overridden equals() method
    }
}


// 3. hashCode()
// Return type: int
// Generates a unique integer for the object
// Used by HashMap, HashSet
// 📌 Rule (Very Important):
// If equals() is overridden, hashCode() must also be overridden

// public class P1{
//     int id;
//     String name;

//     public P1(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     @Override
//     public String toString() {
//         return "P1 [id=" + id + ", name=" + name + "]";
//     }  
    
//     public static void main(String[] args) {
//         P1 ref = new P1(1, "John");
//         System.out.println(ref);  //P1 [id=1, name=John]
//         System.out.println(ref.toString());  //P1 [id=1, name=John]
//         System.out.println(ref.hashCode());  //868693306
//         System.out.println(Integer.toHexString(ref.hashCode()));  //33c7353a

//         System.out.println(ref.getClass());  //class P1
//         System.out.println(ref.getClass().getName());  //P1

//         System.out.println(ref.getClass().getName()+"@"+Integer.toHexString(ref.hashCode()));  //P1@33c7353a
//     }
// }




// 4. getClass()
// Return type: Class<?>
// Used to get runtime class information

// 5. clone()
// Used to create a duplicate object
// Supports shallow copy
// Class must implement Cloneable interface
// 6.  wait(), notify(), notifyAll()
// Used in inter-thread communication
// Available because Object is superclass of all classes
// Must be called inside synchronized block
// Every Java class indirectly inherits Objec
//   Enables runtime polymorphism
//   Allows generic handling of objects

