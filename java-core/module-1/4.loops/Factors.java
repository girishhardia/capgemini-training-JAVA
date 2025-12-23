import java.util.Scanner;
public class Factors{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number - ");
		long n = sc.nextLong();
		int count = 0;
		for(long i = 1; i<=n; i++){
			if(n%i==0){
			System.out.print(i+" ");
			count+=1;
			}
		}
		if(count==2){
			System.out.println("");
			System.out.println(n+ " is a prime number.");
		}
	}
}