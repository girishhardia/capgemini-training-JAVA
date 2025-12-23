import java.util.Scanner;
public class Factorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		long n = sc.nextLong();

		long fac = 1;
		for(long i = 1; i<=n; i++){
			fac*=i;
		}
		System.out.println(fac +" is ans.");
	}
}