/*
Method Reference :
    method reference is just a shortcut for lambda that only calls an existing method.
    if a lambda expression contain only one statement and that statement simply calls an existing method,
    then a method reference can be used instead of lambda expression.
    
*/

import java.util.Arrays;
import java.util.List;

interface FI2{
    int add( int a, int b);
}
public class MethodReference {
    public static void main(String[] args) {
        FI2 f = (a, b) -> a + b;
        System.out.println("Using lambda expression : "+f.add(10, 20));
        FI2 f1 = Integer::sum;
        System.out.println("Using method reference : "+f1.add(10, 20));

        List<String> list = Arrays.asList("A","B","C","D");
        System.out.println("Using lambda expression : ");
        System.out.println("List : "+list);
        list.forEach(s -> System.out.println(s));
        System.out.println("Using method reference : ");
        list.forEach(System.out::println);
    }
}

