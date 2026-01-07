// Polymorphism: An ability of an object to exhibit more than one form is known as polymorphism.
                // one name but different forms

// Types of Polymorphism
// 1. Compile time polymorphism
//      The binding happens during compile time is known as compile time polymorphism.
//      It is also known as static binding or early binding.
//      We can achieve compile time polymorphism using
//      1. Method overloading
//      2. Constructor overloading
//      3. Variable shadowing : 
//          When a variable in a subclass has the same name as a variable in its superclass.
//          The variable in the subclass will shadow the variable in the superclass.
//          Which variavle to be called is decided during compile time.
//      4. Method shadowing
//      
// 2. Run time polymorphism
//      The binding happens during runtime is known as run time polymorphism.
//      It is also known as dynamic binding or late binding.
//      We can achieve run time polymorphism using
//      1. Method overriding
//

// why we use variable shadowing
// to access the variable of superclass
// where we use variable shadowing
// we use variable shadowing while upcasting, downcasting and method overriding

class Father {
    int a = 10;
    static int b = 100;
}

class Son extends Father {
    int a = 20;
    static int b = 200;
}


public class Intro {
    public static void main(String[] args) {
        System.out.println("Main start");
        System.out.println("--Father object stored in Father ref variable--");
        Father ref1 = new Father();
        System.out.println(ref1.a);
        System.out.println(ref1.b);
        System.out.println("--Son object stored in Son ref variable--");
        Son ref2 = new Son();
        System.out.println(ref2.a);
        System.out.println(ref2.b);
        System.out.println("---Upcasting---");
        Father ref3 = new Son();
        System.out.println(ref3.a);
        System.out.println(ref.b);
        System.out.println("--Downcasting---");
        Son ref4 = (Son) ref3;
        System.out.println(ref4.a);
        System.out.println(ref4.b);

        System.out.println("Main end");
    }
}
