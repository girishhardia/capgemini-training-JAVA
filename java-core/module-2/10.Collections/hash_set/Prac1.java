import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Prac1 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(12);
        al.add(13);
        al.add(12);
        al.add(14);
        al.add(14);
        al.add(null);
        al.add(15);
        al.add(11);
        al.add(10);
        al.add(16);
        al.add(null);
        al.add(10);
        System.out.println("al: " + al);
        // WAJP to remove duplicates from given list. and print only unique objects.
        // output : [10, 12, 13, 14, null, 15, 11, 16]
        Set<Integer> hs = new LinkedHashSet<Integer>(al);
        System.out.println("hs: " + hs);
        al = new ArrayList<>(hs);
        System.out.println("al: " + al);
    }
}