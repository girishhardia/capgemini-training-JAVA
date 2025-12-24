import java.util.Scanner;
public class SpecialNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		int temp=n;
		int product=1;
		int sum=0;
		while(n!=0){
			int digit = n%10;
			sum+=digit;
			product*=digit;		
			n/=10;
		}
		
		if (temp==(sum+product)) {
			System.out.println(temp+" is a special number.");
		}
		else System.out.println(temp+" is not a special number.");
		
	}
}