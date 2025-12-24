import java.util.Scanner;
public class FactorialOfDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		
		while(n!=0){
			int digit = n%10;
			

			long fac = 1;
			for(long i = 1; i<=digit; i++){
				fac*=i;
			}
			System.out.println(digit+"! = "+fac +" ");

			n/=10;
		}
		
		
	}
}