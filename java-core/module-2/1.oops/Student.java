// static block runs at time of class loading and non static block runs at time of object creation.
// constructon is a method named same as class name and with runs at time of object creation by 
// default by compilar while a method exicuts when called


// WAJP to create student class consist of 4 data such as:
// 	id, name , percentage, college name
// create parameterized constructor to initialize only id.
// -create parameterized constructor to initialize only name.
// -create parameterized constructor to initialize only percentage.
// -create parameterized constructor to initialize id and name.
// -create parameterized constructor to initialize id and percentage.
// -create parameterized constructor to initialize name and percentage.
// -create parameterized constructor to initialize id , name and percentage.
// -create default / no argument constructor to assign default values.
// -create one static method called printDetail to print all the details of 
// student.
// -in main method create objects using all constructors.

public class Student{
	int id;
	String name,collegeName;
	double percentage;

	 Student(){
		this.id=0;
		this.name="";
		this.percentage=0.0;
	}
	 Student(int id){
		this.id=id;
	}
	 Student(String name){
		this.name=name;
	}
	 Student(double percentage){
		this.percentage=percentage;
	}
	 Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	 Student(int id, double percentage){
		this.id=id;
		this.percentage=percentage;
	}
	 Student(String name, double percentage){
		this.name=name;
		this.percentage=percentage;
	}
	 Student(int id, String name, double percentage){
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}

	public static void printDetails(Student s){
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.percentage);
		
	}

	public static void main(String[] args) {
		int id;
		String name,collegeName;
		double percentage;

		Student s1 = new Student();
        Student.printDetails(s1);

        Student s2 = new Student(456);
        Student.printDetails(s2);

        Student s3 = new Student("Harshit");
        Student.printDetails(s3);

        Student s4 = new Student(61.5);
        Student.printDetails(s4);

        Student s5 = new Student(456, "Harshit");
        Student.printDetails(s5);

        Student s6 = new Student(456, 61.5);
        Student.printDetails(s6);

        Student s7 = new Student("Harshit", 61.5);
        Student.printDetails(s7);

        Student s8 = new Student(456, "Harshit", 61.5);
        Student.printDetails(s8);

	}
}