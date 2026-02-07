/*
Stream :
    Stream is a Java 8 feature used to process collection data in a functional way without using loops.
    Stream was introduced in Java 8
    Stream does not store data
    It works on Collection data
    Stream processes data one by one
    Stream does not change original collection

Basic Stream Flow : Collection -> Stream -> Operation -> Result
eg: List -> stream() -> filter() -> forEach()

Basic methods of stream :

stream() -> Converts a collection into a stream so we can process data in a functional way.
filter() -> Selects elements from the stream based on a condition.
map() -> Transforms each element in the stream into another form.
forEach() -> Performs an action on each element of the stream (commonly used for printing).
collect() -> Converts the processed stream back into a collection or another result.
sorted() -> Sorts stream elements using natural ordering (uses Comparable).
sorted(Comparator) -> Sorts stream elements using custom sorting logic (uses Comparator).
*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays; // Implied import

public class Stream {
    public static void main(String[] args) {
        // 1. Create a list of numbers from 1 to 10
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // 2. Print all elements using Method Reference (::)
        System.out.println("To print all elements one by one");
        numbers.stream().forEach(System.out::println);

        // 3. Filter: Print only even numbers
        System.out.println("\nTo print only even elements");
        numbers.stream().filter(n -> n%2==0).forEach(System.out::println);

        // 4. Map: Filter odd numbers, add 3 to them, then print
        System.out.println("\n To print odd number with extra value 3");
        numbers.stream().filter(n -> n%2!=0).map(n -> n+3).forEach(System.out::println);

        // 5. Collect: Filter even numbers and store them in a new List
        System.out.println("\nfind even numbers and stored in another list");
        List<Integer> even_collector = numbers.stream().filter( n-> n%2==0).collect(Collectors.toList());
        System.out.println(even_collector);

        List<String> names = List.of("Nitish", "Aditya", "Devansh", "Mohit", "Girish");
        System.out.println("\n print  objects end with sh");
        names.stream().filter(name -> name.endsWith("sh")).forEach(System.out::println);

        List<Students> st = List.of(
            new Students("Nitish", 11), 
            new Students("Aditya", 22), 
            new Students("Devansh", 13), 
            new Students("Mohit", 24), 
            new Students("Girish", 25));

        System.out.println("\n print objects with age greater than 20");
        st.stream().filter(student -> student.getAge() > 20).forEach(System.out::println);
        
    }
}
