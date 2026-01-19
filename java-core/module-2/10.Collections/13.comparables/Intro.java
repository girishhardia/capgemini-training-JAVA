/*

The Comparable interface is used to define the "natural ordering" of objects of a class.

1. Interface Definition:
   - Located in java.lang.
   - Signature: public interface Comparable<T> { int compareTo(T o); }

2. Comparison Logic (compareTo):
   - Returns a negative integer if this object is less than the specified object.
   - Returns zero if this object is equal to the specified object.
   - Returns a positive integer if this object is greater than the specified object.

3. Key Properties:
   - Symmetric: signum(x.compareTo(y)) == -signum(y.compareTo(x)).
   - Transitive: (x.compareTo(y) > 0 && y.compareTo(z) > 0) implies x.compareTo(z) > 0.
   - Consistency with Equals: Strongly recommended that (x.compareTo(y) == 0) == (x.equals(y)).

4. Usage:
   - Classes implementing Comparable can be sorted automatically by Collections.sort() and Arrays.sort().
   - They can be used as keys in a TreeMap or elements in a TreeSet without a separate Comparator.

5. Comparable vs Comparator:
   - Comparable: Internal to the class (natural ordering), defines "I can compare myself to another."
   - Comparator: External to the class (custom ordering), defines "I can compare two other objects."

*/

