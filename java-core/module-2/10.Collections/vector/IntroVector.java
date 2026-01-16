/*
    Vector : 
	It is a implementing class of List interface.
	It is present inside jav.util package
	It is known as legacy class .
	It present since jdk 1.0v
	It follows dynamic array datastructure.
	Objects of vectors are stored in continious block of memory.
	
	Difference between ArrayList and Vector:
	1. Synchronization: Vector is synchronized (thread-safe), whereas ArrayList is not synchronized.
	2. Capacity Increment: Vector doubles its capacity (100% increase) when the array is full, 
		while ArrayList increases its capacity by 50% (1.5x of current size).
	3. Performance: ArrayList is faster because there is no overhead of synchronization.
	4. Legacy: Vector is a legacy class (JDK 1.0), whereas ArrayList was introduced in JDK 1.2.

*/

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IntroVector {
	public static void main(String[] args) {
		List<String> v =  new Vector<String>();
		v.add("Suraj");
		v.add("mridul");
		v.add("kabir");
		v.add("girish");
		System.out.println(v);
		System.out.println(v.size());
		
		for(int i = 0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("-----");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}