/*
 * ======================================================================================
 *                               NON-PRIMITIVE TYPE CASTING
 * ======================================================================================
 *
 * ----------------------------------- UPCASTING ----------------------------------------
 * Description:
 *    - Process of creating a subclass object and storing it in a superclass variable.
 *    - It happens implicitly.
 *
 * Access:
 *    - We can access ONLY the members (variables/methods) of the SUPER CLASS.
 *
 * ---------------------------------- DOWNCASTING ---------------------------------------
 * Description:
 *    - The conversion of a superclass type (reference) back into a subclass type.
 *    - It must be done explicitly.
 *
 * Access:
 *    - We can access members of the SUB CLASS as well as members of the SUPER CLASS.
 *
 * ------------------------------------ WARNING -----------------------------------------
 * ! CRITICAL !
 *    - If we attempt to perform downcasting without prior upcasting, the runtime will 
 *      throw a ClassCastException.
 * ======================================================================================
 */

class Father {
	int a = 10;	
}
class Son extends Father {
	int b = 20;
}
public class NonPrimitiveTypeCasting {
	public static void main(String[] args) {
		System.out.println("Main start");
		System.out.println("---object of father store inside father class ref variable---");
		Father ref1 = new Father();
		System.out.println(ref1.a);
//		System.out.println(ref1.b); CTE cannot find symbol
		System.out.println("---Object of son store inside son class ref variable---");
		Son ref2 = new Son();
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		System.out.println("---upcasting---");
		Father ref3 = new Son(); 
		System.out.println(ref3.a);
//		System.out.println(ref3.b);CTE cannot find symbol
		System.out.println("---downcasting---");
		Son ref4 = (Son)ref3;
		System.out.println(ref4.a);
		System.out.println(ref4.b);
		System.out.println("main end");
	}
}