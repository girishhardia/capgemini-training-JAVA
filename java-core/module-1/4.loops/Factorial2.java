import java.util.Scanner;
public class Factorial2{
	public static void main(String[] args) {

		for(int j = 1; j<11; j++){
			long fac = 1;
			for(long i = 1; i<=j; i++){
				fac*=i;
			}
			System.out.println(fac);
		}
		
	}
}