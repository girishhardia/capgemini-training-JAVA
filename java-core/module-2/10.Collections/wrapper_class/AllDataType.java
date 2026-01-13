public class AllDataType {
    public static void main(String[] args) {
        // Autoboxing: Primitive to Wrapper
        Byte byteObj = 1;
        Short shortObj = 10;
        Integer intObj = 100;
        Long longObj = 1000L;
        Float floatObj = 10.5f;
        Double doubleObj = 20.99;
        Character charObj = 'A';
        Boolean booleanObj = true;

        // Implicit Unboxing: Wrapper to Primitive
        byte b = byteObj;
        short s = shortObj;
        int i = intObj;
        long l = longObj;
        float f = floatObj;
        double d = doubleObj;
        char c = charObj;
        boolean bool = booleanObj;

        // Explicit Unboxing: Wrapper to Primitive
        byte bExplicit = byteObj.byteValue();
        short sExplicit = shortObj.shortValue();
        int iExplicit = intObj.intValue();
        long lExplicit = longObj.longValue();
        float fExplicit = floatObj.floatValue();
        double dExplicit = doubleObj.doubleValue();
        char cExplicit = charObj.charValue();
        boolean boolExplicit = booleanObj.booleanValue();

        System.out.println("Integer value (Implicit): " + i);
        System.out.println("Integer value (Explicit): " + iExplicit);
        System.out.println("Character value: " + charObj);
        System.out.println("Boolean value: " + booleanObj);
    }
}
