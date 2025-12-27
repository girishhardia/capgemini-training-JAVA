public class Recursion{

	public static int printNum(int n){
		System.out.print(n+" ");
		
		if(n==100){
			return 0;
		}
		return printNum(++n);

	}

	public static void main(String[] args) {
		printNum(1);
	}
}