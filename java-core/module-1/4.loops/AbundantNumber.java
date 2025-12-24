import java.util.Scanner;
public class AbundantNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number - ");
		long n = sc.nextLong();
		int sum = 0;
		for(long i = 1; i<n; i++){
			if(n%i==0){
			sum+=i;
			
			}
		}
		if(sum>n){
			System.out.println(n+ " is a abundant number.");
		}
		else System.out.println(n+ " is not a abundant number.");
	}
}