import java.util.Scanner;
public class NivenNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		int temp=n;
		
		int sum=0;
		while(n!=0){
			int digit = n%10;
			sum+=digit;
					
			n/=10;
		}
		
		if (temp%sum==0) {
			System.out.println(temp+" is a niven number.");
		}
		else System.out.println(temp+" is not a niven number.");
		
	}
}