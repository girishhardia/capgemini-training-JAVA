/*
List :
     It is a interface 
     It is a ordered collection of elements that allows duplicates.
     It is a child interface of Collection interface.
     It is present in java.util package.
     It is a interface so we can't create the object of List but we can use it as a reference variable to refer child classes of List interface.

        It can store different type of Object.
        It is dynamic in size.
        It can maintain insertion order
        It can store duplicate objects.
        It maintain index.
        index value start from 0.
        It has Random access.
        It can store null Object.

        add(Object obj) :
            It is used to add object inside List.
            Return type of add method is boolean.

        size() :
            It is used to return size or length of List.
            Return type of size method is int.

        get(int index) :
            It is used to return Object from specific index.
            Return type is Object.

        addAll() :
            It is used to add all objects from another collection inside List.
            Return type of addAll method is boolean.

        addAll(int index, Collection c) :
            It is used to add all objects from another collection inside List at specific index.
            Return type of addAll method is boolean.

        remove(Object obj) :
            It is used to remove object from List.
            Return type of remove method is boolean.

        remove(int index) :
            It is used to remove object from List at specific index.
            Return type of remove method is Object.

        removeAll(Collection c) :
            It is used to remove all objects from another collection inside List.
            Return type of removeAll method is boolean.

        clear() :
            It is used to remove all objects from List.
            Return type of clear method is void.

        contains(Object obj) :
            It is used to check if List contains specific object.
            Return type of contains method is boolean.

        containsAll(Collection c) :
            It is used to check if List contains all objects from another collection.
            Return type of containsAll method is boolean.
            


    1. to add an object:
        add(Object)
        addAll(Collection)
        add(int index, Object)
        addAll(int index, Collection)

    2. to remove an object:
        remove(Object)
        remove(int index)
        removeAll(Collection)
        clear()

    3. to search an object:
        contains(Object)
        containsAll(Collection)
        
    4. to get an object:
        get(int index)
        iterator()
        listIterator()
        for each loop

    

*/

public class IntroList {
    public static void main(String[] args) {
        List al = new ArrayList();
        al.add(10);
        al.add(10.5);
        al.add('a');
        al.add("LPU");
        al.add(false);
        System.out.println(al);
        System.out.println(al.size());
        al.add(15);
        System.out.println(al);
        System.out.println(al.size());
        al.add("LPU");
        al.add('a');
        System.out.println(al);
        System.out.println(al.get(1));
        al.add(null);
        System.out.println(al);
    }
}