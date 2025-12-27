public class MergeArray{
	public static void main(String[] args) {
		int arr1[]={1,2,3,4,5};
		int arr2[]={6,7,8,9,0};

		int a = arr1.length+arr2.length;
		int arr[] = new int[a];

		for (int i=0; i< arr1.length ;i++ ) {
			arr[i]=arr1[i];
		}
		for (int i=arr1.length; i< a ;i++ ) {
			arr[i]=arr2[i-arr1.length];
		}

		for (int i=0; i< a ;i++ ) {
			System.out.print(arr[i]+" ");
		}
	}
}