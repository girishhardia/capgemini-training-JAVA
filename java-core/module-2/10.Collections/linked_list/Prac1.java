/*
Problem Statement

You are developing a Train Compartment Management System using Java Collections.
Each compartment is identified by a compartment number (Integer).

Tasks to Perform
	Create a LinkedList<Integer> to store compartment numbers.
	Add compartments in the following order: 101, 102, 103, 104, 105, 106

Perform the following operations step by step:
Operations
	Insert a VIP compartment (999): Immediately after compartment 102
	Remove all even-numbered compartments (Use Iterator only)
	Reverse the remaining compartments without using Collections.reverse()
	Check whether compartment 105 exists:
		If present → print its index
		If not present → print "Compartment not found"

*/

public class Prac1 {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();

        // Add compartments in the following order: 101, 102, 103, 104, 105, 106
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        list.add(105);
        list.add(106);

        System.out.println("Original List: " + list);

        // Insert a VIP compartment (999): Immediately after compartment 102
        list.add(list.indexOf(102) + 1, 999);

        System.out.println("List after inserting VIP compartment: " + list);

        // Remove all even-numbered compartments (Use Iterator only)
        java.util.Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer compartment = iterator.next();
            if (compartment % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("List after removing even-numbered compartments: " + list);

        // Reverse the remaining compartments without using Collections.reverse()
        java.util.LinkedList<Integer> reversedList = new java.util.LinkedList<>();
        for (Integer compartment : list) {
            reversedList.addFirst(compartment);
        }
        list = reversedList;

        System.out.println("List after reversing: " + list);

        // Check whether compartment 105 exists:
        // If present → print its index
        // If not present → print "Compartment not found"
        int index = list.indexOf(105);
        if (index != -1) {
            System.out.println("Compartment 105 is at index: " + index);
        } else {
            System.out.println("Compartment not found");
        }
    }
}