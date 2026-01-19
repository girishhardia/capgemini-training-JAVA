
/*
TreeSet
    It is an implementation class of Set interface
    It is present inside java.util package
    It was introduced in JDK 1.2
    It follows sorted order (ascending order by default)
    It does not follow insertion order
    It does not allow duplicate elements
    It does not allow null elements
    It can store only same type of objects
    It is used when sorted data with uniqueness is required
*/

package basics;

import java.util.Set;
import java.util.TreeSet;

public class P7 {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<String>();
        ts.add("Kabir");
        ts.add("Nitish");
        ts.add("Aditya");
        ts.add("Animesh");
        ts.add("Pawan");
        ts.add("Devansh");
        ts.add("Balaji");
        
        // Prints in Ascending Order (Default for TreeSet)
        System.out.println("ASC: " + ts);
        
        // Casts Set interface reference back to TreeSet to access descendingSet()
        TreeSet<String> dts = (TreeSet<String>) ts;
        
        // Prints in Descending Order
        System.out.println("DESC: " + dts.descendingSet());
    }
}