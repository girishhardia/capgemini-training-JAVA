import java.util.Scanner;
public class EvenDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		
		while(n!=0){
			int digit = n%10;
			if(digit%2==0){
				System.out.println(digit);
			}
			n/=10;
		}
		
	}
}