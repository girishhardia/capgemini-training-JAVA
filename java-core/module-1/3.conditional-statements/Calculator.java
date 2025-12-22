import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("how many operands you want for this operation 2,3 or 4 - ");
		int vnum = sc.nextInt();
		switch (vnum){
		case 2:{
			
			System.out.print("enter 1st Number - ");
			int a = sc.nextInt();
			System.out.print("enter 2nd Number - ");
			int b = sc.nextInt();


			
			System.out.print("which operation you want to perform from +, -, *, /  ->  ");
			char opr = sc.next().charAt(0);
			switch(opr){
			case '+':
				System.out.println(a+b+" is the answer.");			
			break;

			case '-':
				System.out.println(a-b+" is the answer.");			
			break;

			case '*':
				System.out.println(a*b+" is the answer.");			
			break;

			case '/':
				System.out.println((double)a/b+" is the answer.");
			break;

			default:
				System.out.println("Invalid Input");
		}
		break;}


		case 3:{
			System.out.print("enter 1st Number - ");
			int a = sc.nextInt();
			System.out.print("enter 2nd Number - ");
			int b = sc.nextInt();
			System.out.print("enter 3rd Number - ");
			int c = sc.nextInt();


			
			System.out.print("which operation you want to perform from +, -, *  ->  ");
			char opr = sc.next().charAt(0);
			switch(opr){
			case '+':
				System.out.println(a+b+c+" is the answer.");		
			break;

			case '-':
				System.out.println(a-b-c+" is the answer.");			
			break;

			case '*':
				System.out.println(a*b*c+" is the answer.");		
			break;

			default:
				System.out.println("Invalid Input");
		}
		break;}
		case 4:{
			System.out.print("enter 1st Number - ");
			int a = sc.nextInt();
			System.out.print("enter 2nd Number - ");
			int b = sc.nextInt();
			System.out.print("enter 3rd Number - ");
			int c = sc.nextInt();
			System.out.print("enter 4th Number - ");
			int d = sc.nextInt();


			
			System.out.print("which operation you want to perform from +, -, *  ->  ");
			char opr = sc.next().charAt(0);
			switch(opr){
			case '+':
				System.out.println(a+b+c+d+" is the answer.");			
			break;

			case '-':
				System.out.println(a-b-c-d+" is the answer.");			
			break;

			case '*':
				System.out.println(a*b*c*d+" is the answer.");			
			break;

			default:
				System.out.println("Invalid Input");
		}
		break;}

		default:
			System.out.println("Invalid Input");

		}
	

	}
}