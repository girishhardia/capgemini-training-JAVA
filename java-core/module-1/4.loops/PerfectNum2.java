import java.util.Scanner;
public class PerfectNum2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		for(long j=2; j<n; j++){
			long sum = 0;
			for(long i = 1; i<j; i++){
				if(j%i==0){
					sum+=i;
				}
			}
			if(sum==j){
				System.out.println(j);
			}
		}
	}
}