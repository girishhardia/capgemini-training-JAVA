/*
PriorityQueue :
    It is an implementation class of Queue interface
    It is present inside java.util package
    It was introduced in JDK 1.5
    It follows priority-based ordering, not insertion order
    By default, it follows Min-Heap (smallest element has highest priority)
    Elements are retrieved using FIFO based on priority, not on insertion time
    It does not allow null elements
    It allows duplicate elements
    It cn store only same type of objects.
    It is internally implemented using Heap data structure
    It is used to perform priority-based queue operations

*/

import java.util.PriorityQueue;
import java.util.Queue;

public class IntroPriorityList {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(10);
		pq.offer(15);
		pq.offer(26);
		pq.offer(7);
		pq.offer(13);
		pq.offer(10);
		pq.offer(14);
//		pq.offer(null); NullPointerException
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		
	}
}

/*
Output : 
[7, 10, 10, 15, 13, 26, 14]
7
7
7
[10, 13, 10, 15, 14, 26]
10
[10, 13, 26, 15, 14]
[13, 14, 26, 15]
[14, 15, 26]
*/