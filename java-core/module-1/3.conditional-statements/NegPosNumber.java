import java.util.Scanner;
class NegPosNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number - ");
		int a = sc.nextInt();

		if(a>0){
			System.out.println(a+" is Positive number");
		}else if(a<0){
			System.out.println(a+" is Negative number");
		}else{
			System.out.println(a+" is a Unique number nor positive nor negative");
		}

	}
}