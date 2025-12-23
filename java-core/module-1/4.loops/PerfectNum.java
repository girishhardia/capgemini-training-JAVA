import java.util.Scanner;
public class PerfectNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long sum = 0;
		for(long i = 1; i<n; i++){
			if(n%i==0){
				sum+=i;
			}
		}
		if(sum==n){
			System.out.println(n+ " is a Perfect number.");
		}else{
			System.out.println(n+ " is not a Perfect number.");
		}
	}
}