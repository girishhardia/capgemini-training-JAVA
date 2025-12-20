import java.util.Scanner;
class Prac1{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a letter - ");
		char a = sc.next().charAt(0);

		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
			System.out.println(a+" is a vovel");
		}else{
			System.out.println(a+" is not a vovel");
		}

		if(a>='a' && a<='z'){
			System.out.println(a+" is lower case character");
		}else if(a>='A' && a<='Z'){
			System.out.println(a+" is a upper case character");
		}else if(a>='0' && a<='9'){
			System.out.println(a+" is a number");
		}else{
			System.out.println(a+" is a spacial character");
		}
		

	}
}