import java.util.Scanner;
public class SumOfDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		int evenSum=0;
		int oddSum =0;
		int sum=0;
		while(n!=0){
			int digit = n%10;
			sum+=digit;
			if(digit%2==0){
				evenSum+=digit;
			}else{
				oddSum+=digit;
			}
			n/=10;
		}
		System.out.println(sum+" ia sum of digits.");
		System.out.println(evenSum+" ia sum of even digits.");
		System.out.println(oddSum+" ia sum of odd digits.");
		
	}
}