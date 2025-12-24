import java.util.Scanner;
public class LargestDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		int largestDigit= Integer.MIN_VALUE;
		while(n!=0){
			int digit = n%10;
			if(largestDigit<digit){
				largestDigit=digit;
			}
			n/=10; // 
		}
		System.out.println(largestDigit);
		
	}
}