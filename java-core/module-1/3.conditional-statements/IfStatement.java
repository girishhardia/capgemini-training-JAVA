import java.util.Scanner; 
class IfStatement{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number - ");
		int a = sc.nextInt();
		if(a%2==0){
			System.out.println(a+" is a even number.");
		}
		if(a%2!=0){
			System.out.println(a+" is a odd number.");
		}
	}
}