/*

ITERATORS IN JAVA: THEORY NOTES

1. Definition:
   - An Iterator is an interface in the `java.util` package used to traverse a collection sequentially.
   - It provides a uniform way to access elements of different collection types (List, Set, etc.) without exposing the underlying data structure.

2. Core Methods:
   - hasNext(): Returns true if the iteration has more elements.
   - next(): Returns the next element in the iteration and advances the cursor. Throws NoSuchElementException if no more elements exist.
   - remove(): Removes the last element returned by the iterator from the underlying collection. This is the only safe way to modify a collection during iteration.

3. Advantages over for-each or for-loops:
   - Safe Removal: Avoids ConcurrentModificationException when deleting elements while traversing.
   - Universality: Works on any class implementing the Iterable interface.

4. ListIterator (Specialized Sub-interface):
   - Specific to List implementations.
   - Bidirectional: Supports both forward and backward traversal (hasPrevious(), previous()).
   - Modification: Allows adding (add()) and replacing (set()) elements during iteration.
   - Indexing: Can retrieve the current index (nextIndex(), previousIndex()).

5. Fail-Fast vs Fail-Safe Iterators:
   - Fail-Fast: Immediately throws ConcurrentModificationException if the collection is modified structurally (add/delete) by any means other than the iterator's own methods (e.g., ArrayList, HashSet).
   - Fail-Safe: Operates on a clone of the collection, allowing modifications without throwing exceptions (e.g., CopyOnWriteArrayList).

6. Limitations:
   - Standard Iterator only moves forward.
   - Cannot be used to iterate back and forth unless using ListIterator.
   - Structural changes to the collection outside the iterator's methods invalidate the iterator.

        System.out.println(itr);// ArrayList$Itr@2a139a55
        System.out.println(itr.hasNext());
//		itr.remove(); IllegalStateException
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
//		System.out.println(itr.next()); NoSuchElementException

iterator() :


iterator is a cursor, it is a interface.
to activate iterator cursor in collection we have iterator() method.
the return type of iterator() method is Iterator interfae.

with the help of this method we can able accesss hasNext(), next() and remove() methods.

hasNext() :
    It is used to check whether next object is present or not .
    return type is boolean

next() :
    It is used return the next object of iteration.
    return type is Object.

remove() :
    it is used to remove the prvious object of itertion.
    which means we can use remove after next() method.
    if try to use remove method before next() method it will throw IllegalStateException
    return type is void

with the help of itertor() we can travers only in forward direction.

*/

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

// public class IntroIterator {
//     public static void main(String[] args) {
//         int[] a = {10, 21, 23, 25, 26};
//         List<Integer> al = new ArrayList<Integer>();
//         for (int i : a) {
//             al.add(i);
//         }
//         System.out.println(al);
        
//         Iterator<Integer> itr = al.iterator();
//         while(itr.hasNext()) {
//             System.out.println(itr.next());
//         }
//         // WAJP to remove object from list one by one
//         /*
//         * [10,21,23,25,26]
//         * [21,23,25,26]
//         * [23,25,26]
//         * [25,26]
//         * [26]
//         */

//         System.out.println("--- Output ---");
        
//         while (!al.isEmpty()) {
//             System.out.println(al); // Prints the current list state
//             al.remove(0);           // Removes the first element (index 0)
//         }
//     }
// }

/*
ListIterator:
1. Bidirectional Traversal: Unlike the standard Iterator, ListIterator allows traversal in both forward (next()) and backward (previous()) directions.
2. List-Specific: It is uniquely available for classes that implement the List interface (e.g., ArrayList, LinkedList, Vector).
3. Index Retrieval: It provides methods to retrieve the index of the next (nextIndex()) or previous (previousIndex()) elements relative to the current cursor position.
4. Modification Capabilities:
   - add(E e): Inserts a new element at the current cursor position.
   - set(E e): Replaces the last element returned by next() or previous() with a new value.
   - remove(): Deletes the last element returned by the iterator.
5. Cursor Logic: The iterator functions as a pointer that resides between elements. Calling next() moves the cursor forward and returns the element passed, while previous() moves it back.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IntroIterator {
    public static void main(String[] args) {
        String[] a = {"suraj", "Mridul", "kabir", "girish"};
        List<String> al = new ArrayList<String>();
        for (String i : a) {
            al.add(i);
        }
        System.out.println(al);
        ListIterator<String> ltr = al.listIterator();
        // System.out.println(ltr.hasPrevious()); false
        // System.out.println(ltr.previous()); NoSuchElementException
        System.out.println("==forward==");
        while(ltr.hasNext()) {
            System.out.println(ltr.next());
        }
        System.out.println("==backward==");
        while(ltr.hasPrevious()) {
            System.out.println(ltr.previous());
        }
        // remove from backward
        while (ltr.hasNext()) {
            ltr.next();
        }
        while(ltr.hasPrevious()) {
            ltr.previous();
            ltr.remove();
            System.out.println(al);
        }    
    }
}