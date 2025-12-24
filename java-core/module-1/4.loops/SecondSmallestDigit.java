import java.util.Scanner;
public class SecondSmallestDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		int secondSmallestDigit=Integer.MAX_VALUE;
		int smallestDigit = n%10;
		n/=10;
		while(n!=0){
			
			int digit = n%10;
			if(digit<secondSmallestDigit &&digit!=smallestDigit){
				if(digit<smallestDigit  ){
					secondSmallestDigit = smallestDigit;
					smallestDigit=digit;
				}
				else secondSmallestDigit = digit;
			}
			n/=10;
		}
		System.out.println(secondSmallestDigit);
		
	}
}