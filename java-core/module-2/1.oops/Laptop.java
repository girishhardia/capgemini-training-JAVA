// Write a Java program to create a Laptop class that demonstrates constructor chaining using this().

// Requirements:

// The Laptop class should have three instance variables:
// brand (String)
// ramSize (int)
// price (double)

// Implement the following constructors using constructor chaining (this()):

// Default constructor that sets default values ("Unknown", 8GB, 50000.0).
// Constructor with only brand (calls the default constructor).
// Constructor with brand and ramSize (calls the constructor with brand).
// Constructor with all three fields (brand, ramSize, price) --(the final constructor)--.

// Create a printDetails() method to display laptop details.

// In main(), create different Laptop objects using all constructors and print their details.

public class Laptop{

	String brand;
	int ramSize;
	double price;

	public Laptop(){
		this.brand="Unknown";
		this.ramSize=8;
		this.price=50000.0;	
	}

	public Laptop(String brand){
		this();
		this.brand=brand;
	}

	public Laptop(String brand,int ramSize){
		this(brand);
		this.ramSize=ramSize;
	}

	public Laptop(String brand,int ramSize, double price){
		this(brand,ramSize);
		this.price=price;
	}

	public void print(){
		System.out.println("Brand: "+this.brand);
		System.out.println("Ram Size: "+this.ramSize+" GB");
		System.out.println("Price: "+this.price);
	}


	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.print();

		Laptop l2 = new Laptop("Apple");
		l2.print();

		Laptop l3 = new Laptop("Lenovo",16);
		l3.print();

		Laptop l4 = new Laptop("Dell",32,1000000.0);
		l4.print();



	}
}