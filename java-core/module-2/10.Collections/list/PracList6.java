import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracList6 {
    public static void main(String[] args) {
        String[] s = {"Mridul", "Girish","Pawan", "Balaji", "Murali"};
        List<String> list = new ArrayList<String>();
        for(String name : s){
            list.add(name);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to remove: ");
        String name = sc.nextLine();
        if(list.contains(name)){
            int index = list.indexOf(name);
            System.out.println(name + " found at index " + index);
        }
        else{
            System.out.println(name + " not found");
        }
        sc.close();

        System.out.println(list);
    }
}
