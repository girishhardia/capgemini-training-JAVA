/*
Q. WAJP to convert all the elemets of array into List.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracList2 {
    public static void main(String[] args) {
        // Method 1: Using Arrays.asList (Fixed size list backed by array)
        String[] strArray = {"Java", "Python", "C++", "JavaScript"};
        List<String> list1 = Arrays.asList(strArray);
        
        System.out.println("List from Arrays.asList: " + list1);

        // Method 2: Manual copy to ArrayList (Modifiable list)
        List<String> list2 = new ArrayList<>();
        for (String s : strArray) {
            list2.add(s);
        }
        // Or nicer: new ArrayList<>(Arrays.asList(strArray));
        
        System.out.println("ArrayList from manual copy: " + list2);
        
        // Modifying the second list to prove it's independent
        list2.add("Ruby");
        System.out.println("Modified ArrayList: " + list2);
    }
}
