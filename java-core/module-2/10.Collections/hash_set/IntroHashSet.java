/*
HashSet :
	It is an implementation class of Set interface
	It is present inside java.util package
	It was introduced in JDK 1.2
	It only allow one null element
	It does not allow duplicate elements
	It cn store only same type of objects
	It does not maintain insertion order
    it does not maintain any sorting order
	It is internally implemented using HashTable(Hashing mechanism)
	It privides fast performance for add, remove and search operations
    it is used when unique elements are required and order is not important

    linkedhashset :
        it is an implementation class of set interface
        it is present inside java.util package
        it was introduced in jdk 1.4
        it follows insertion order
        it only allow one null element
        it does not allow duplicate elements
        it can store only same type of objects
        it maintains insertion order
        it does not maintain any sorting order
        it is internally implemented using HashTable and doubly linked list
        it privides slightly slower performance than HashSet due to the additional overhead of maintaining the insertion order
        it is used when unique elements are required and order is important
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntroHashSet {
	public static void main(String[] args) {
		Set hs = new HashSet();
		hs.add(10);
		hs.add(12);
		hs.add(null);
		hs.add('a');
		hs.add(true);
		hs.add(10);
		hs.add("LPU");
		hs.add('a');
		hs.add(null);
		System.out.println(hs);
		System.out.println("----");
		for(Object obj : hs) {
			System.out.println(obj);
		}
		System.out.println("----");
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

// import java.util.LinkedHashSet;
// import java.util.Iterator;
// import java.util.Set;

// public class P7 {
// 	public static void main(String[] args) {
// 		Set hs = new LinkedHashSet();
// 		hs.add(10);
// 		hs.add(12);
// 		hs.add(null);
// 		hs.add('a');
// 		hs.add(true);
// 		hs.add(10);
// 		hs.add("LPU");
// 		hs.add('a');
// 		hs.add(null);
// 		System.out.println(hs);
// 		System.out.println("----");
// 		for(Object obj : hs) {
// 			System.out.println(obj);
// 		}
// 		System.out.println("----");
// 		Iterator itr = hs.iterator();
// 		while(itr.hasNext()) {
// 			System.out.println(itr.next());
// 		}
// 	}
// }