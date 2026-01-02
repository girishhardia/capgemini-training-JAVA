// 3. Write a Java program to demonstrate method overloading by defining both static and non-static methods with the same name but different parameter lists. Your program should include the following:

// A class named OverloadingExample containing:

// A static method named display() that takes an int parameter and prints a message.
// A static method named display() that takes a String parameter and prints a message.
// A non-static method named display() that takes two parameters: an int and a double, and prints a message.
// A non-static method named display() that takes no parameters and prints a default message. 

// ---------------------------------------------------------------------------------------

public class OverloadingExample{

	public static void display(int a){
		System.out.println("Int SM Print!!!!  "+a);
	}

	public static void display(String a){
		System.out.println("String SM Print!!!!  "+a);
	}

	public void display(int a, double b){
		System.out.println("Int and Double NSM Print!!!!  "+a);
	}

	public void display(){
		System.out.println("No para NSM Print!!!!  ");
	}

	public static void main(String[] args) {
		display(3);
		display("Static Method");

		OverloadingExample obj1 = new OverloadingExample();
		obj1.display(6,1234.4);

		// OverloadingExample obj2 = new OverloadingExample();
		obj1.display();

	}
}