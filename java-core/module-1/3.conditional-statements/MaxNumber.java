import java.util.Scanner;
class MaxNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numbers - ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a==b && b==c){
			System.out.println(a+" is greatest number");
		}
		if(a>b && b>c){
			if(a>c){
			System.out.println(a+" is greatest number");
		}else{
			System.out.println(b+" is greatest number");
		}
		}else{
			System.out.println(c+" is greatest number");
		}

	}
}