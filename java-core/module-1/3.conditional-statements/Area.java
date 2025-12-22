import java.util.Scanner;
class Area{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a shape ");
		String shape = sc.nextLine();

		switch (shape){
		case "circle":{
			System.out.print("enter radius - ");
			int a = sc.nextInt();
			System.out.println(3.14*a*a+" is the area.");
			break;
		}
		case "rectangle":{
			System.out.print("enter length - ");
			int a = sc.nextInt();
			System.out.print("enter breadth - ");
			int b = sc.nextInt();
			System.out.println(a*b+" is the area.");
			break;
		}
		case "triangle":{
			System.out.print("enter heigth - ");
			int a = sc.nextInt();
			System.out.print("enter base - ");
			int b = sc.nextInt();
			System.out.println((double)(a*b)/2+" is the area.");
			break;
		}
		case "square":{
			System.out.print("enter side - ");
			int a = sc.nextInt();
			System.out.println(a*a+" is the area.");
			break;
		}
		default:
			System.out.println("Invalid input");
		
		}
	}
}