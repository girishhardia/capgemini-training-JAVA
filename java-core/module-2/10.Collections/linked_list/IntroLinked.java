/*
LinkedList :
    It is an implementation of the List interface and Queue interface.
    It is present inside java.util package
    It is present since jdk 1.2v
    It is used to perform list operation.

To perform list operation we have multiple methods in LinkedList class.

It is a doubly-linked list data structure.

Types of Linked List:
1. Singly Linked List: Each node contains data and a reference to the next node, ending with a null pointer.
2. Doubly Linked List: Each node contains data and two references, one to the next node and one to the previous node.
3. Circular Linked List: A list where the last node points back to the first node, forming a continuous loop.


addFirst(Object obj) :
    It is used to add object at the first position of the linked list.
    The return type is void.

addLast(Object obj) :
    It is used to add object at the last position of the linked list.
    The return type is void.

add(Object obj) :
    It is used to add object inside the linked list.
    The return type is boolean.

remove(Object obj) :
    It is used to remove object from the linked list.
    return type is boolean.

*/

public class IntroLinked {
    public static void main(String[] args) {
        java.util.LinkedList<Object> list = new java.util.LinkedList<>();

        // add(Object obj)
        list.add("B");
        list.add("C");

        // addFirst(Object obj)
        list.addFirst("A");

        // addLast(Object obj)
        list.addLast("D");

        System.out.println("Original List: " + list);

        // remove(Object obj)
        list.remove("C");

        System.out.println("List after removal: " + list);
        
    }
}
