// public class SumOfNum{
	
// 	public static int sum(int n){
// 		int sumt=0;
// 		if(n<6){ 
// 			sumt+=n;
// 			sum(++n);
// 		}
// 		else return sumt;
// 	}

// 	public static void main(String[] args) {
// 		System.out.println(sum(1));
// 	}
// }

public class SumOfNum {

    public static int sum(int n) {
        if (n > 5) {          // base condition
            return 0;
        }
        return n + sum(n + 1); // recursive call
    }

    public static void main(String[] args) {
        System.out.println(sum(1));
    }
}
