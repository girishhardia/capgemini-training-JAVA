// Write a Java program that satisfies all the following conditions:

// Requirements
// 	1.	Create a class named Processor.
// 	2.	Declare two non-static variables x and y.

// 	4.	Initialize the instance variables only inside a non-static method using the this keyword.
// 	5.	Create three non-static methods:
// 	•	initialize() – assigns values to x and y using this.
// 	•	update() – modifies the values of x and y and demonstrates variable shadowing by declaring a local variable with the same name as one instance variable.
// 	•	display() – prints the final values of the instance variables.
// 	6.	One non-static method must call another non-static method using the this keyword.



public class Processor{

	int x,y;

	void initialize(){
		Processor obj = new Processor();
		this.x = 1;
		this.y = 2;
	}

	void update(){
		this.x = 3;
		this.y = 4;
		int x = 5;
		int y = 6;
	}

	void display(){
		System.out.println(this.x);
		System.out.println(this.y);
	}

	void call(){
		this.initialize();
		this.update();
		this.display();
	}

	public static void main(String[] args) {
		Processor obj = new Processor();
		obj.call();
	}
}