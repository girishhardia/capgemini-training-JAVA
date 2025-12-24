import java.util.Scanner;
public class StrongNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		int temp = n;
		long facSum = 0;
		while(n!=0){
			int digit = n%10;
			

			long fac = 1;
			for(long i = 1; i<=digit; i++){
				fac*=i;
			}
			facSum+=fac;

			n/=10;
		}
		if (facSum==temp) {
			System.out.println(temp+" is a strong number. ");
		}
		else System.out.println(temp+" is not a strong number. ");
	}
}