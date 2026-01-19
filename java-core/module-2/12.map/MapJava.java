/*
containsKey(Object key) :
    It is used to check whether the given key is present or not .
    return type is boolean

containsValue(Object value) :
    It is used to check whether the givemn value is present or not.
    return type is boolean.

get(Object key) :
    It is used to return the value present at specific key.
    return type is Object.

entrySet() :
    It is used to convert all the entries of map into Set interface.
    return type is Set interface.

keySet() :
    It is used to get all the keys of map in Set format.
    return type is Set interface.

values() :
    It is used to get all the values of map in Collection format.
    return type is Collection interface.
*/

import  java.util.*;
import java.util.HashMap;
import java.util.Map;

public class MapJava {

    /*
    Map:
        Map is a interface, present in java.util package.
        It is used to store data in key-value pair.
        one key value pair is known as one entry.
        keys must beunique
        values can be duplicates.
        Map does not extend collection because in collection we store only objects but in map we store key-value pair.

        Map Interface has 3 implementing classes:
            1. HashMap
            2. LinkedHashMap
            3. TreeMap

        put(Object key, Object value) :
            used to insert key-value pair in map.
            return type is object
            It will return previous value associated with the key, if key is already present in map otherwise it will return null.
            If we try to insert duplicate key, it will override the previous value with new value.

        remove(Object key) :
            used to remove key-value pair from map.
            return type is object
            It will return the value associated with the key, if key is present in map otherwise it will return null.
        
        containsKey(Object key) :
            It is used to check whether the specified key is present in the map or not.
            return type is boolean
        
        containsValue(Object value) :
            It is used to check whether the specified value is present in the map or not.
            return type is boolean
        
        get(Object key) :
            It is used to get the value associated with the specified key.
            return type is object
            It will return the value associated with the key, if key is present in map otherwise it will return null.
        
        entrySet() :
            It is used to get the set of key-value pairs present in the map.
            return type is set interface.

        keySet() :
            It is used to get all the keys of map in Set format.
            return type is set interface.

        values() :
            It is used to get all the values of map in Collection format.
            return type is collection interface.
     */
    public static void main(String[] args) {
        // Map hm = new HashMap();
        // System.out.println(hm.put(1, "Aman")); //null
        // System.out.println(hm.put(12.2, 12.5)); //null
        // System.out.println(hm.put(1, "Mohit")); //Aman
        // System.out.println(hm);

        Map  hm = new HashMap();
        hm.put(10,"Xyz");
        hm.put(12.5,false);
        hm.put(null, null);
        hm.put(true, 10);
        hm.put('a', 'a');
        hm.put("LPU", 100);
        System.out.println(hm);

        System.out.println(hm.remove(true));
        System.out.println(hm.remove("Jalandhar"));
        
        System.out.println(hm.containsKey(true));
        System.out.println(hm.containsKey("LPU"));

        System.out.println(hm.containsValue("Xyz"));
        System.out.println(hm.containsValue(10));

        System.out.println(hm.get(10));

        Set entries = hm.entrySet();
        System.out.println("Set: "+ entries);

        for (Object obj : entries) {
            System.out.println(obj);
        }

        Set keys = hm.keySet();
        System.out.println("KEYS: "+ keys);

        Iterator itr = keys.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Collection values = hm.values();
        System.out.println("VALUES: "+ values);

        Iterator itr2 = values.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}