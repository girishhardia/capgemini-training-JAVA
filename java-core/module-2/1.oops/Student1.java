// Create a Java class named Student with the following requirements:
// 	1.	Instance variables:
// 		int id
// 		String name
// 		int[] marks (size 3)
// 	2.	Create:
// 		A parameterized constructor to initialize all variables.
// 		A copy constructor that creates a deep copy of a Student object.
// 	3.	In the main method:
// 		Create one Student object using the parameterized constructor.
// 		Create another Student object using the copy constructor.
// 		Modify the marks of the copied object.
// 		Print details of both objects.
// 	4.	Ensure that changes made to the copied object do not affect the original 
// 	object.

public class Student1 {
    int id;
    String name;
    int[] marks=new int[3];

    public Student1(int id, String name,int[] marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public Student1(Student1 s){
        this.id=s.id;
        this.name=s.name;
        // Deep copy of the array
        this.marks = new int[s.marks.length];
        for(int i=0; i<s.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }
    
    public void display() {
        System.out.print("ID: " + id + ", Name: " + name + ", Marks: [");
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + (i < marks.length-1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] marks1 = {80, 90, 85};
        Student1 s1 = new Student1(1, "Alice", marks1);
        
        // Create copy
        Student1 s2 = new Student1(s1);
        
        System.out.println("Before modification:");
        System.out.print("Original: "); s1.display();
        System.out.print("Copy:     "); s2.display();
        
        // Modify marks of the copied object
        s2.marks[0] = 99;
        s2.name = "Bob"; // Also changing name to distinguish clearly
        
        System.out.println("\nAfter modification (Copy's marks[0] changed to 99):");
        System.out.print("Original: "); s1.display();
        System.out.print("Copy:     "); s2.display();
        
        if(s1.marks[0] != s2.marks[0]) {
             System.out.println("\nSUCCESS: Original object is unaffected.");
        } else {
             System.out.println("\nFAILURE: Original object was modified.");
        }
    }
}
