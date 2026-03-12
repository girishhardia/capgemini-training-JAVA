/*  
1.Write a Java program using Stream API to:
Store integers in a list
Filter and display only even numbers

2.Write a Java program using Stream API to:
Store names in a list
Convert all names to uppercase
Display the result

3.Write a Java program using Stream API to:
Store integers in a list
Count how many numbers are greater than 50
*/

import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        // 1. Filter and display even numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        java.util.Collections.addAll(numbers, 10, 15, 20, 25, 30);
        System.out.println("Even numbers:");
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // 2. Convert names to uppercase and display
        ArrayList<String> names = new ArrayList<>();
        java.util.Collections.addAll(names, "alice", "bob", "charlie");
        System.out.println("\nUppercase names:");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        // 3. Count numbers greater than 50
        ArrayList<Integer> numbers2 = new ArrayList<>();
        java.util.Collections.addAll(numbers2, 40, 60, 80, 30, 90);
        long count = numbers2.stream().filter(n -> n > 50).count();
        System.out.println("\nNumbers greater than 50: " + count);
    }
}
