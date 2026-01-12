// What is String in Java?
// •	
// String is a non-primitive data typr
// String represents a group / sequence of characters
// String is a class
// Every String value is an object
// ________________________________________
//  Classes Used to Create Strings in Java
// Java provides three classes to work with character sequences:
// String → Immutable
// StringBuffer → Mutable + Thread-safe
// StringBuilder → Mutable + Not Thread-safe
// ________________________________________
// Ways to Create a String Object
// 1) String str = "suraj";                    // String literal (SCP)
// 2) String str = new String();               // Empty String object
// 3) String str = new String("suraj");        // Heap object
// 4) String str = new String(char[] ch);      // From character array
// 5) StringBuilder sb = new StringBuilder("suraj");
// 6) StringBuffer sb = new StringBuffer("suraj");
// ________________________________________
// Inbuilt String Class Structure
// public final class String 
//     extends Object 
//     implements CharSequence, Serializable, Comparable
// {
//     // constructors
//     // methods
// }
// Why these interfaces?
// CharSequence → Maintains sequence of characters
// Comparable → Used to compare objects using compareTo()
// Serializable → Used to store and transfer object state
// 📌 Note:
// Objects created using String class are immutable
// ________________________________________
// Immutability of String
// Once a String object is created, its value cannot be changed
// Any modification creates a new object
// String s = "Java";
// s.concat(" World");
// System.out.println(s);   // Output: Java
// ________________________________________
//  StringBuffer Class
// Definition
// StringBuffer provides an alternative to the immutable String class, allowing modification without creating a new object every time.
// ________________________________________
// Important Methods of StringBuffer
// append() → Adds data at the end
// insert() → Inserts data at a specific position
// delete() → Removes characters
// reverse() → Reverses characters
// StringBuffer sb = new StringBuffer("Java");
// sb.append(" World");
// ________________________________________
// Key Characteristics
// StringBuffer objects are mutable
// Modification happens on the same object
// More efficient than String when frequent changes are required
// Thread-safe (methods are synchronized)
// Suitable for multi-threaded environments
// ________________________________________
// Difference: String vs StringBuffer
// Feature	String	StringBuffer
// Mutability	Immutable	Mutable
// Object Creation	New object created	Same object modified
// Performance	Slow in loops	Better
// Thread Safety	Yes (immutable)	Yes (synchronized)
// ________________________________________
// StringBuilder Class
// Definition
// StringBuilder works similar to StringBuffer but without synchronization.
// ________________________________________
// Key Points
// Mutable
// Not thread-safe
// Faster than StringBuffer
// High performance
// Best suited for single-threaded applications
// 📌 Recommendation:
// If synchronization is required → use StringBuffer
// If performance is required → use StringBuilder
// ________________________________________
//  StringBuilder vs StringBuffer
// Feature	StringBuffer	StringBuilder
// Thread Safety	Yes	No
// Synchronization	Yes	No
// Performance	Medium	High
// Use Case	Multi-threaded	Single-threaded
// ________________________________________
// Important String Methods
// 1. length()
// Return type: int
// Returns number of character
// 2. charAt(int index)
// Return type: char
// Returns character at given index
// 3. equals(String str)
// Return type: boolean
// Compares content (case-sensitive)
// 4. equalsIgnoreCase(String str)
// Ignores case while comparing
// 5. trim()
// Removes spaces from beginning and end
// 6. toCharArray()
// Converts String into char[]
// 7. toUpperCase()
// Converts to uppercase
// 8. toLowerCase()
// Converts to lowercase
// 9. split(String regex)
// Splits string into String array
// 10. indexOf(char ch)
// Returns index of first occurrence
// 11. replace(char old, char new)
// Replaces characters
// 12. replace(String old, String new)
// Replaces sequence
// 13. startsWith(String str)
// Checks prefix
// 14. endsWith(String str)
// Checks suffix
// 15. substring(int beginIndex)
// Returns substring from index to end
// 16. substring(int beginIndex, int endIndex)
// Returns substring (endIndex – 1)
// 17. toString()
// Returns String representation
// 18. concat(String str)
// Concatenates two strings
// 19. contains(String str)
// Checks sequence presence
// 20. isEmpty()
// Checks if string length is 0
// ________________________________________


