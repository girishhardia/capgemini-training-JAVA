public class LeaderOfArray{

	public static void isLeader(int arr[]) {
		for (int i=0; i<arr.length ; i++) {
			for (int j=i; j<arr.length ; j++) {
				if(arr[j]>arr[i]){
					break;
				}
				else if(j==arr.length-1){
					System.out.print(arr[i]+" ");
				}
			}

		}
	}

	public static void main(String[] args) {
		int arr[] = {8,4,5,7,3,6,5,3};
		isLeader(arr);
	}
}