/*
Q. WAJP to create array which can store different type of data.
   = {10, "LPU", 'a', null, false, 10.5}
   
Q. WAJP to convert all the elements of List into Array.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracList3 {
    public static void main(String[] args) {
        // Part 1: Array storing different types of data
        System.out.println("--- Array with different types ---");
        Object[] mixedArray = {10, "LPU", 'a', null, false, 10.5};
        
        for (Object obj : mixedArray) {
            System.out.println("Element: " + obj);
        }

        System.out.println("\n--- List to Array Conversion ---");
        // Part 2: Convert List to Array
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        
        System.out.println("Original List: " + fruitList);

        // Convert to Array
        // We pass an empty array of the same type to toArray() so it returns the correct type
        String[] fruitArray = fruitList.toArray(new String[0]);
        
        System.out.print("Converted Array: ");
        System.out.println(Arrays.toString(fruitArray));
    }
}
