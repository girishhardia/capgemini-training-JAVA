// static block and static method
// excuded when jvm loads a class or creates a class static area
// static method is stored in class static area, all calls directly points towards class static area
// WAJP to overload mainmethod
public class OopsPrac{
	public static void main(String[] args){
		int a =124;
		main(a);
	}
	public static void main(int a){
		System.out.println(a);
	}

}