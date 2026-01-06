// has-a and is-a relationship
// types of relationship
// 	1.HAS-A relationship
// 	2.IS-A relationship

// HAS-A relationship:
// 	1.Aggregation
// 		is a weak HAS-A relationship where the child object is created outsidde the parent class and can exit independent;y.
// 	2.Composition
//		is a strong HAS-A relationship where the parent class creates and own the child object, and the child cannot exit independently.

//



class Address{
	String city;
	String state;
	public Address(String city, String state){
		this.city=city;
		this.state=state;
	}
	public void display(){
		System.out.println(this.city+this.state);
	}
}

class Student{
	int id;
	String name;
	double marks;
	Address address;
	public Student(int id, String name, double marks, Address address){
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.address=address;
	}
	public void display(){
		System.out.println(this.id+this.name+this.marks);
	
		this.address.display();
	}
}

public class Intro{
	public static void main(String[] args) {
		Address ad = new Address("Jalandhar", "Punjab");

		Student s1 = new Student(1,"Harshit",83.3,ad);
		ad.display();
		s1.display();
	}
}