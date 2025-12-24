import java.util.Scanner;
public class SpecialNumber2{
	public static void main(String[] args) {
		

		for (int i = 1; i<=100 ; i++ ) {
			
			int temp=i;
			int product=1;
			int sum=0;
			while(temp!=0){
				int digit = temp%10;
				sum+=digit;
				product*=digit;		
				temp/=10;
			}
		
			if (i==(sum+product)) {
				System.out.print(i+" ");
			}
		
		}
	}
}