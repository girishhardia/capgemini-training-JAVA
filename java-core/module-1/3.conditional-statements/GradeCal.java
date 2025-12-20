import java.util.Scanner;
class GradeCal{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Marks - ");
		int a = sc.nextInt();

		if(a>100){
			System.out.println("Marks should be less than 100");
		}else if(a>=90){
			System.out.println("Student Passed with Grade A");
		}else if(a>=80){
			System.out.println("Student Passed with Grade B");
		}else if(a>=70){
			System.out.println("Student Passed with Grade C");
		}else if(a>=60){
			System.out.println("Student Passed with Grade D");
		}else if(a>=0){
			System.out.println("Student Failed");
		}


		else{
			System.out.println("Marks Can't be negative");
			
		}
		

	}
}