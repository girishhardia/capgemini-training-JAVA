/*
Map
    It is an interface of java.util package
    It was introduced in JDK 1.2
    It stores data in key-value pairs
    It does not allow duplicate keys
    It allows duplicate values
    It does not allow null keys
    It allows one null value
    It is used when we need to store data in key-value pairs

    Map :
    Map is a interface, present inside java.util package.
    It is used to store data in key value pair.
    one key value pair is known as one entry.
    keys must be unique
    values can be duplicates.
    
Map does not comes under collection because in collection we store only object but in map we
store objects in the form of key value pair.

Map interface has 3 implementing classes such as HashMap, LinkedHashMap and TreeMap
*/


import java.util.HashMap;
import java.util.Map;

public class IntroMap {
    public static void main(String[] args) {
        Map hm = new HashMap();
        System.out.println(hm.put(1, "Kabir")); // null
        System.out.println(hm.put(12.2, 12.5)); // null
        System.out.println(hm.put(1, "Mohit")); // Kabir
        System.out.println(hm);
    }
}
// {1=Mohit, 12.2=12.5}