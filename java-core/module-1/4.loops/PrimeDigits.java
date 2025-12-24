import java.util.Scanner;
public class PrimeDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		
		while(n!=0){
			int digit = n%10;
			
			int count=0;
			for(int j = 2;j<=digit/2;j++){
				if(digit%j==0){
					count+=1;
				}
			}
			if (count==0){
				System.out.println(digit);
			}
				
			n/=10;
		}
		
	}
}