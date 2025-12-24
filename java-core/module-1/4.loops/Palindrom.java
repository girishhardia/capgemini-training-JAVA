import java.util.Scanner;
public class Palindrom{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		int rev=0;
		int temp=n;
		while(n!=0){
			int digit = n%10;
			rev = rev*10+digit;
			n/=10;
		}
		if(rev==temp){
			System.out.println(temp+" is a palindrom. ");
		}
		else{ System.out.println(temp+" is not a palindrom. ");}

		for (int i = 100;i<=200 ;i++ ) {
			int rev2=0;
			int temp2=i;
			while(temp2!=0){
				int digit = temp2%10;
				rev2 = rev2*10+digit;
				temp2/=10;
			}
			if(rev2==i){
				System.out.println(i+" is a palindrom. ");
			}	
		}
	}
}