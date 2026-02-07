/*
What is Functional Programming?
    Functional Programming is a programming style where we write programs using functions without changing data.

Java 8 introduced Functional Programming features to make Java:
    shorter
    cleaner
    faster
    modern

Functional interface :
    A functional interface contains exactly one abstract method, but can have any number of default or static methods.
    We need Functional interface because lambda expressions work only with functional interfaces.
    @FunctionalInterface annotation is optional but recommended.

Predefined Functional interface :
    Runnable interface -> run() used in Thread.
    Comparable interface -> compareTo(Object o) used in Collection.
    Comparator interface -> compare(Object o1 , Object o2) used in Collection.

Anonymous class :
    An anonymous class is a class without a name that you define and create (instantiate) in one step.
    Anonymous classes are useful when you need a class only once and don't want to create a separate named class file-for example:
        to override a method of an existing class
        to implement an interface

Lambda Expressions :
    Lambda expression is an anonymous function that provides implementation of a functional interface.
    A lambda expression is a short way to write a method without method name, without class, and without boilerplate code.

    Syntax :
        (parameters) -> expression
        OR
        (parameters) -> { 
        statements; 
        }

    Example :
        (x, y) -> x + y
        OR
        (x, y) -> { 
        return x + y;
        }
*/

// @FunctionalInterface
// interface FI1 {
//     void greet();
// }

// @FunctionalInterface
// interface FI2 {
//     int add(int a, int b);
// }

// public class Intro {
//     public static void main(String[] args) {
        
//         // --- Example 1: Void Method ---
        
//         // 1. Using Anonymous Class
//         FI1 ref1 = new FI1() {
//             @Override
//             public void greet() {
//                 System.out.println("Hello world using anonymous class");
//             }
//         };
//         ref1.greet();

//         // 2. Using Lambda Expression
//         // Syntax: () -> Body
//         FI1 ref2 = () -> System.out.println("Hello world using lambda");
//         ref2.greet();

//         System.out.println("--------------------");

//         // --- Example 2: Method with Return Type ---

//         // 1. Using Anonymous Class
//         FI2 obj1 = new FI2() {
//             @Override
//             public int add(int a, int b) {
//                 return a + b;
//             }
//         };
//         System.out.println("Using anonymous class :" + obj1.add(10, 20));

//         // 2. Using Lambda Expression
//         // Syntax: (args) -> Expression (implied return)
//         FI2 obj2 = (a, b) -> a + b;
//         System.out.println("Using lambda exp :" + obj2.add(20, 30));
//     }
// }


@FunctionalInterface
interface FI1 {
	void greet();
}
@FunctionalInterface
interface FI2 {
	int add(int a, int b);
}
@FunctionalInterface
interface Factorial {
	int findFactorial(int n);
}
public class Intro {
	public static void main(String[] args) {
		Factorial ref = new Factorial() {
			@Override
			public int findFactorial(int n) {
				int fact = 1;
				for(int i=n ; i>=1;i--) {
					fact = fact*i;
				}
				return fact;
			}
		};
		
		System.out.println("Using anonymous class :"+ref.findFactorial(5));
		Factorial obj = (n)-> {
			int fact = 1;
			for(int i=n ; i>=1;i--) {
				fact = fact*i;
			}
			return fact;
		};
		System.out.println("Using lambda :"+ obj.findFactorial(6));
		
		
		
		
		
		
		FI1 ref1  = new FI1() {
			@Override
			public void greet() {
				System.out.println("Hello world using anonymous class");
			}
		};
		ref1.greet();
		
		FI1 ref2 = () -> System.out.println("Hello world using lambda");
		ref2.greet();
		System.out.println("----------------------------------------------");
		FI2 obj1 = new FI2() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		System.out.println("Using anonymous class :"+ obj1.add(10, 20));
		
		FI2 obj2 = (a,b) ->  a+b;
		System.out.println("Using lambda exp :"+ obj2.add(20, 30));
	}
}