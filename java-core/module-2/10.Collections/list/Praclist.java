import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Praclist {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);

        numbers.add(2, 12);

        System.out.println("List elements: " + numbers);

        if (numbers.contains(15)) {
            System.out.println("The number 15 exists in the list.");
        } else {
            System.out.println("The number 15 does not exist in the list.");
        }

        Collections.sort(numbers);

        numbers.remove(Integer.valueOf(5));

        System.out.println("Final list: " + numbers);
        System.out.println("Size of the list: " + numbers.size());
    }
}