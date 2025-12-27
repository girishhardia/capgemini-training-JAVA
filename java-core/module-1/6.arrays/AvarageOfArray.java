public class AvarageOfArray{

	public static int avarage(int[] arr) {
		
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];			
		}
		int av = sum/arr.length;
		return av;
	}

	public static int count(int[] arr, int av) {
		
		int con=0; 
		for(int i=0; i<arr.length; i++){
			if(arr[i]==av){
				con+=1;
			}			
		}
		return con;
	}

	public static void main(String[] args) {

		int arr[]={1,2,3,4,5,6,7,8,9};
		int av = avarage(arr);
		System.out.println(av + " is present "+ count(arr,av)+" times.");
	}
}