// what is wrapper class.
// A wrapper class is a class that encapsulates a primitive data type into an object.

// why we need wrapper class.
// They are used to treat primitives as objects, which is required for Collections, synchronization, and utility methods.

// Types of wrapper class.
// byte    -> Byte
// short   -> Short
// int     -> Integer
// long    -> Long
// float   -> Float
// double  -> Double
// char    -> Character
// boolean -> Boolean

public class Intro {
    public static void main(String[] args) {
        // Autoboxing: primitive to wrapper object
        int primitiveInt = 100;
        Integer wrappedInt = primitiveInt;

        // Unboxing: wrapper object to primitive
        int backToPrimitive = wrappedInt;

        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unwrapped int: " + backToPrimitive);

        // Example with Character
        char primitiveChar = 'A';
        Character wrappedChar = Character.valueOf(primitiveChar); // Explicit boxing
        char backToChar = wrappedChar.charValue(); // Explicit unboxing

        System.out.println("Wrapped Character: " + wrappedChar);
    }
}

