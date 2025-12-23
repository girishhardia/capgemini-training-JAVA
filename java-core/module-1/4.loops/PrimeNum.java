public class PrimeNum{
	public static void main(String[] args){
		for(int i = 20; i>=10; i--){
			int count=0;
			for(int j = 2;j<=i/2;j++){
				if(i%j==0){
					count+=1;
				}
			}
			if (count==0){
				System.out.print(i+" ");
			}
		}		
	}
}