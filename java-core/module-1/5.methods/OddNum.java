public class OddNum{

	public static void odd(int n){
		if(n%2!=0){
			System.out.print(n+" ");
		}
		if(n<1000){
			odd(++n);
		}
	}

	public static void main(String[] args){
		odd(1);
	}
}