import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class pracList5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        List<Integer> al = new ArrayList<Integer>();
        for(int i : arr) {
            al.add(i);
        }
        System.out.println(al);

        List<Integer> al2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(al2);

        al.add(10);
        al.remove(0);
        System.out.println(al);

        // al2.add(10); UnsupportedOperationException
        // al2.remove(0); UnsupportedOperationException
        System.out.println(al2);
    }
}
