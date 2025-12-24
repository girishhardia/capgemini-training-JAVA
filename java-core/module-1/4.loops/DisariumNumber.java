import java.util.Scanner;
public class DisariumNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		int temp = n;
		int count = 0;
		int temp2 = n;

		while(temp2!=0){
			count++;
			temp2/=10;
		}

		int sum=0;
		while(n!=0){
			int digit = n%10;
			
			
			sum += Math.pow(digit,count--); 



			n/=10;
		}
		
		if(sum==temp){
			System.out.println(temp+" is a disarium number.");
		}
		else System.out.println(temp+" is not a disarium number.");
		
		
	}
}