import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveOddObject {
    public static void main(String[] args) {
        int[] a = {10,21,23,25,26,28,22,23,21,24,25,26};
        List<Integer> list = new ArrayList<Integer>();
        for(int i : a){
            list.add(i);
        }
        System.out.println(list);
        //Write a program to remove odd objects from list

        for(int i = 0; i < list.size(); i++){
            if(list.get(i)%2!=0){
                list.remove(i);
                i--;
            }
        }
        
        // Iterator<Integer> iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     if (iterator.next() % 2 != 0) {
        //         iterator.remove();
        //     }
        // }
        System.out.println(list);
    }
}
