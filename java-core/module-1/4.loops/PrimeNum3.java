public class PrimeNum3{
	public static void main(String[] args) {
		for(int i = 14; i>5; i--){
			
			int count = 0;
			for(int j = 2; j<i; j++){
				if(i%j==0){
					count+=1;
				}
			}
			if(count==0){
				long fac=1;
				for(int j = 1; j<=i; j++){
					fac*=j;
				}
				System.out.println(i + " factorial is "+fac +" ");
			}
		}
	}
}