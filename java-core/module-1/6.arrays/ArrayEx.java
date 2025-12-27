public class ArrayEx{

	public static void even(int[] arr) {
		System.out.println(" even num ");
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
			}			
		}
		System.out.println(" ");
	}

	public static void prime(int[] arr) {
		System.out.println(" prime num ");
		for(int i=0; i<arr.length; i++){
			int count = 0;
			for(int j=2; j<=arr[i]/2; j++){
				if(arr[i]%j==0) count++;
			}
			if(count==0){
				System.out.print(arr[i]+" ");
			}			
		}
		System.out.println(" ");
		
	}

	public static void perfect(int[] arr) {
		System.out.println(" perfect num ");
		for(int i=0; i<arr.length; i++){
			int sum = 0;
			for(int j=1; j<=arr[i]/2; j++){
				if(arr[i]%j==0){
					sum+=j;
				}
			}
			if(sum==arr[i]){System.out.print(arr[i]+" ");}			
		}
		System.out.println(" ");
		
	}

	public static void sum(int[] arr) {
		System.out.println(" sum ");
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];			
		}
		System.out.println(sum+" ");
	}

	public static void prod(int[] arr) {
		System.out.println(" prod ");
		int prod=1;
		for(int i=0; i<arr.length; i++){
			prod*=arr[i];			
		}
		System.out.println(prod+" ");
	}




	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9};

		even(arr);
		prime(arr);
		perfect(arr);
		sum(arr);
		prod(arr);
		
	}
}