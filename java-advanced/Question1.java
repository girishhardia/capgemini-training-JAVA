/*
1.Write a Java program to:
Create an ArrayList of student names
Add at least 5 names
Display all names using a loop

2.Write a Java program to:
Store integers in an ArrayList
Count how many times a given number appears in the list

3.Write a Java program to:
Store employee ID and name using HashMap
Display all employee details
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Question1 {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("J");
        studentNames.add("K");
        studentNames.add("L");
        studentNames.add("M");
        studentNames.add("N");
        for (String name : studentNames) {
            System.out.println(name);
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 1) {
                count++;
            }
        }
        System.out.println("Number 1 appears " + count + " times in the list");

        HashMap<Integer, String> employeeDetails = new HashMap<>();
        employeeDetails.put(1, "J");
        employeeDetails.put(2, "K");
        employeeDetails.put(3, "L");
        employeeDetails.put(4, "M");
        employeeDetails.put(5, "N");
        for (Map.Entry<Integer, String> entry : employeeDetails.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
