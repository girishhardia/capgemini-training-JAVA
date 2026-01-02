// A mobile phone can be initialized with default settings or custom settings.

// Create class Mobile with:
// 	•	String brand
// 	•	int storage
// 	•	boolean is5G

// Requirements:
// 	1.	Default constructor sets:
	// •	brand = “Unknown”
	// •	storage = 64
	// •	is5G = false
// 	2.	Parameterized constructor sets all values.
// 	3.	Use this() to chain constructors.

public class Mobile{

	String brand;
	int storage;
	boolean is5G;

	public Mobile(){
		brand = "Unknown";
		storage = 64;
		is5G = false;
	}

	public Mobile(String brand,int storage,boolean is5G){
		this();
		this.brand = brand;
		this.storage = storage;
		this.is5G = is5G;

	}

	public void display(){
		System.out.println("Brand: "+ this.brand);
		System.out.println("Storage: "+ this.storage);
		System.out.println("is5G "+ this.is5G);
	}	

	public static void main(String[] args) {
		Mobile obj = new Mobile("apple",128,true);
		obj.display();
	}
}