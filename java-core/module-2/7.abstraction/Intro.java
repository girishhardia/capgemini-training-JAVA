// Abstraction: Hiding the implementation details and showing only the functionality is known as abstraction.
// It is a process of hiding the implementation details and showing only the functionality.

// Types of Abstraction
// 1. Abstract class    : A class which is declared with abstract keyword is known as abstract class.
//                         It can have abstract methods (without body) and non-abstract methods (with body).
//                          
// 2. Interface         : An interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
//                         It can have only abstract methods (without body) and static methods (with body).

// why we use abstract class
// to hide the implementation details
// where we use abstract class
// we use abstract class while inheritance (upcasting, downcasting), method overriding and method shadowing


/*
Abstraction: 
    Abtraction means showing only essential features and hiding implementation details.
    in simple words, displaying the things which are required and hiding the things which are not required.

How Abstraction is achieved in Java?
    1. Using Abstract class
    2. Using Interface

Concrete method :
    A method which has method body and it contain implementation logic.

concrete class :
    A concrete class is a normal class which is not declared with abstract keyword, complete with methods implementation, and it allows to create objects.
    It can have concrete methods (with body) and abstract methods (without body).

Abstract method :
    A method which does not have method body and it does not contain implementation logic.

Abstract class :
    A class which is declared with abstract keyword is known as abstract class.
    It can have abstract methods (without body) and non-abstract methods (with body).

    we can create constructor in abstract class.
    we can create final methods in abstract class.
    we can create static methods in abstract class.
    we can create private methods in abstract class.
    we can create final variables in abstract class.
    we can create static variables in abstract class.
    we can create private variables in abstract class. 
    we can create static blocks in abstract class.
    we can create instance blocks in abstract class.
    
    in abstract class we can create abstract methods (without body) and non-static complete methods (with body) hence we cannot achieve 100% abstraction.
    if you want to achieve 100% abstraction then we have to use interface.



Interface :
    An interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
    It can have only abstract methods (without body) and static methods (with body).



*/

abstract class Father {
    abstract public void test();
    abstract public void demo(int a, int b);
}

class Son extends Father {
    @Override
    public void test(){
        System.out.println("Son class test method");
    }
    @Override
    public void demo(int a, int b){
        System.out.println("Son class demo method");
    }
    public void show(){
        System.out.println("Son class show method");
    }
}

public class Intro {
    public static void main(String[] args) {
        System.out.println("Main start");
        //Father ref = new Father(); CTE cannot instantiate the type Father
        Father ref = new Son();
        ref.test();
        ref.demo(0, 0);
        //Downcasting
        Son ref2 = (Son) ref;
        ref2.show();
        System.out.println("Main end");
    }
}
