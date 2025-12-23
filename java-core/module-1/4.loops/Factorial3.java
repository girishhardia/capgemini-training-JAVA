import java.util.Scanner;
public class Factorial3{
	public static void main(String[] args) {

		for(int j = 10; j>1; j--){
			long fac = 1;
			if(j%2!=0){
				for(int i = 1; i<=j; i++){
					fac*=i;
				}			
			System.out.println(fac);
			}
		}	
	}
}