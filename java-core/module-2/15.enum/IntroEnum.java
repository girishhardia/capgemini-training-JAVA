/*
Enum (Enumeration) : 
Enum  is a special data type used to define a fixed set of constant values.
Introduced in JDK 1.5
enum is a keyword
Enum constants are public static final by default
Enum constants are objects
Enum cannot be instantiated using new

It is used 
	To restrict values
	To improve code readability
	To avoid invalid data
	To replace multiple public static final constants	
	To provide type safety
	

values():  Returns all enum constants
valueOf():	Converts String to enum
ordinal():	Returns index position
name(): 	Returns constant name
*/

enum Student_Names {
	Aditya,Devansh,Vishnu,Animesh,Mohit,Pawan,Nitish,Kabir;
}
public class IntroEnum {
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("\n--All values of enum--");
		Student_Names[] students_names = Student_Names.values();
		for(Student_Names name:students_names) {
			System.out.println(name);
		}
		System.out.println("main end");
	}
}