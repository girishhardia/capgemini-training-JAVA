/*
1. Remove Duplicates
	Given an array of integers, remove duplicate elements using HashSet and print unique values.

2. Count Unique Elements
	Write a program to count the number of unique characters in a given string using Set.

3. Common Elements
	Find common elements between two integer arrays using HashSet.

4. Check Element Presence
	Check whether a given element exists in a Set.

5. Union of Two Sets
	Find the union of two sets using Set methods.

6. Intersection of Two Sets
	Find the intersection of two sets using retainAll().

7. Difference of Sets
	Find elements present in Set A but not in Set B.

8. Remove all even numbers from a Set while iterating.

9. First Repeating Element
	Find the first repeating element in an array using HashSet.

10. First Non-Repeating Element
	Find the first non-repeating character in a string using LinkedHashSet.
*/

import java.util.*;

public class Prac2 {
    public static void main(String[] args) {
        // 1. Remove Duplicates
        int[] nums1 = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        Set<Integer> uniqueSet = new HashSet<>();
        for (int n : nums1) uniqueSet.add(n);
        System.out.println("1. Unique values: " + uniqueSet);

        // 2. Count Unique Elements
        String str2 = "java programming";
        Set<Character> charSet = new HashSet<>();
        for (char c : str2.toCharArray()) charSet.add(c);
        System.out.println("2. Count of unique characters: " + charSet.size());

        // 3. Common Elements
        int[] arrA = {1, 2, 3, 4, 5};
        int[] arrB = {4, 5, 6, 7, 8};
        Set<Integer> setA = new HashSet<>();
        for (int i : arrA) setA.add(i);
        System.out.print("3. Common elements: ");
        for (int i : arrB) {
            if (setA.contains(i)) System.out.print(i + " ");
        }
        System.out.println();

        // 4. Check Element Presence
        Set<String> languages = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        System.out.println("4. Does 'Java' exist? " + languages.contains("Java"));

        // 5. Union of Two Sets
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println("5. Union of sets: " + union);

        // 6. Intersection of Two Sets
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println("6. Intersection of sets: " + intersection);

        // 7. Difference of Sets
        Set<Integer> difference = new HashSet<>(s1);
        difference.removeAll(s2);
        System.out.println("7. Difference (S1 - S2): " + difference);

        // 8. Remove all even numbers from a Set while iterating
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println("8. Set after removing even numbers: " + numbers);

        // 9. First Repeating Element
        int[] arr9 = {10, 5, 3, 4, 3, 5, 6};
        Set<Integer> seen = new HashSet<>();
        Integer firstRepeat = null;
        for (int i : arr9) {
            if (seen.contains(i)) {
                firstRepeat = i;
                break;
            }
            seen.add(i);
        }
        System.out.println("9. First repeating element: " + firstRepeat);

        // 10. First Non-Repeating Element
        String str10 = "geeksforgeeks";
        Set<Character> repeated = new HashSet<>();
        Set<Character> candidates = new LinkedHashSet<>();
        for (char c : str10.toCharArray()) {
            if (repeated.contains(c)) continue;
            if (candidates.contains(c)) {
                candidates.remove(c);
                repeated.add(c);
            } else {
                candidates.add(c);
            }
        }
        Character firstNonRepeat = candidates.isEmpty() ? null : candidates.iterator().next();
        System.out.println("10. First non-repeating character: " + firstNonRepeat);
    }
}

