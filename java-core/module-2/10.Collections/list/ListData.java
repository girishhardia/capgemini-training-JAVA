/*
// print the data of list one by one using get method
import java.util.ArrayList;
import java.util.List;
public class ListData {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Aarav");
        list.add("Vihaan");
        list.add("Aditya");
        list.add("Sai");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
*/

/*
Write a Java program that performs the following operations on an ArrayList of Strings:
- Create an ArrayList named cities.
- Add the following city names to the list: "Delhi", "Mumbai", "Chennai", "Kolkata".
- Insert the city "Bangalore" at index 2.
- Display all the cities in the list.
- Check whether the city "Mumbai" exists in the list and print a message:
	If found, print: "Mumbai is present in the list."
	Otherwise, print: "Mumbai is not present in the list."
- Sort the list of cities in alphabetical order and display the sorted list.
- Clear the list and print the final size of the ArrayList.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListData {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<String>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add(2, "Bangalore");
        System.out.println(cities);
        if (cities.contains("Mumbai")) {
            System.out.println("Mumbai is present in the list.");
        } else {
            System.out.println("Mumbai is not present in the list.");
        }
        Collections.sort(cities);
        System.out.println(cities);
        cities.clear();
        System.out.println(cities.size());
    }
}

