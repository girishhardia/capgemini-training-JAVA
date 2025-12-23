import java.util.Scanner;
class Prac1{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a letter - ");
		char a = sc.next().charAt(0);

		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
			System.out.println(a+" is a vovel");
			if(a>='a' && a<='z'){
				int i = 10;
				do{
					System.out.print(i);
					i++;
					System.out.print(" ");
				}
				while(i<=20);

		System.out.println(" ");
			}else if(a>='A' && a<='Z'){
				int i = -10;
			while(i>=-20){
				System.out.print(i);
				i--;
				System.out.print(" ");
				}
			System.out.println("");
			}

		}else{
			if(a>='a' && a<='z'){
				System.out.println(a+" is lower case character");
			}else if(a>='A' && a<='Z'){
				System.out.println(a+" is a upper case character");
			}		
		}
	}
}