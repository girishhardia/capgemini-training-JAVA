import java.util.Scanner;
public class SmallestDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		int smallestDigit=(n%10); // int smallestDigit = Integer.MAX_VALUE;
		while(n!=0){
			int digit = n%10;
			if(smallestDigit>digit){
				smallestDigit=digit;
			}
			n/=10; // 
		}
		System.out.println(smallestDigit);
		
	}
}