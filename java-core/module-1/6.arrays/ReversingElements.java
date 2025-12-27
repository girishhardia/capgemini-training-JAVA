public class ReversingElements{
	
	public static int reverse(int a){
		int n = a;
		int rev=0;
		while(n!=0){
			int digit = n%10;
			rev = rev*10+digit;
			n/=10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int arr[] = {234,543,63,6534,354,344};

		int arr1[] = new int[arr.length];

		for (int i=0;i<arr.length ;i++ ) {
			arr1[i]=reverse(arr[i]);
			// System.out.print(reverse(arr[i])+" ");
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}