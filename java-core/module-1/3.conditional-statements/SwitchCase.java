import java.util.Scanner;
class SwitchCase{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a letter - ");
	char a = sc.next().charAt(0);

	// we cannot use long, float, double and boolean as an input.
	// if we want a desired output so need break statement.
	// brek statement is a control tranfer statement.
	// default statemrnt is not mendatory.
	// we can write default statemrnt anywhere inside block

	switch (a){
	case 'A':
		System.out.println("Excellent");
		break;
	case 'B':
		System.out.println("Good");
		break;
	case 'C':
		System.out.println("Average");
		break;
	case 'D':
		System.out.println("Marginal");
		break;
	case 'F':
		System.out.println("Fail");
		break;
	default:
		System.out.println("Invalid Grade");
		break;

	}
		

	}
}