
import java.util.List;
import java.util.Comparator;

public class Prac1 {
    public static void main(String[] args) {
        List<Students> students = List.of(
            new Students(1, "Nitish", 85),
            new Students(5, "Aditya", 72),
            new Students(3, "Devansh", 90),
            new Students(4, "Mohit", 65),
            new Students(2, "Girish", 88)
        );

        // 1. Write a Java Stream one-liner to sort Students objects by id in ascending order and print them.
        System.out.println("1. Sorted by ID (asc):");
        students.stream().sorted(Comparator.comparingInt(Students::getId)).forEach(System.out::println);

        // 2. Write a Java Stream one-liner to sort Students objects by id in descending order and print them.
        System.out.println("\n2. Sorted by ID (desc):");
        students.stream().sorted(Comparator.comparingInt(Students::getId).reversed()).forEach(System.out::println);

        // 3. Write a Java Stream one-liner to sort Students objects based on name and display the result.
        System.out.println("\n3. Sorted by Name:");
        students.stream().sorted(Comparator.comparing(Students::getName)).forEach(System.out::println);

        // 4. Write a Java Stream one-liner to sort Students objects by marks and print them.
        System.out.println("\n4. Sorted by Marks:");
        students.stream().sorted(Comparator.comparingInt(Students::getMarks)).forEach(System.out::println);

        // 5. Write a Java Stream one-liner to add 5 grace marks to each student and print the updated marks.
        System.out.println("\n5. Add 5 grace marks and print updated marks:");
        students.stream().map(s -> s.getMarks() + 5).forEach(System.out::println);
    }
}
