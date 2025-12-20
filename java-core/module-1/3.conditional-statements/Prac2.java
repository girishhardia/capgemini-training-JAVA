import java.util.Scanner;
class Prac2{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a letter - ");
	char a = sc.next().charAt(0);

	if(a>='a' && a<='z'){
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
			System.out.println(a+" is lower case vovel character");
		}
	else{
		System.out.println(a+" is lower case constant character");
	}
	}
	else if(a>='A' && a<='Z'){
		if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
			System.out.println(a+" is upper case vovel character");
		}else{
			System.out.println(a+" is upper case constant character");
		}
	}
		
}
}
