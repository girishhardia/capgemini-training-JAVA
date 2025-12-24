import java.util.Scanner;
public class XylemPhloemNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int n = sc.nextInt();

		int temp=n;
		int sideSum = (n%10);
		n/=10;
		int meanSum=0;
		while(n!=0){
			int digit = n%10;
			
			if(n/10==0){
				sideSum+=digit;
				break;
			}
			
			meanSum+=digit;
			n/=10;
		}
		if(sideSum==meanSum){
			System.out.println(temp+" is a xylem number.");
		}
		else System.out.println(temp+" is a phloem number.");
	}
}