public class Wrapper{
    public static void main(String[] args) {
        int intValue = 5;
        char charValue = 'A';
        byte byteValue = 10;
        short shortValue = 100;
        long longValue = 1000L;
        float floatValue = 9.76f;
        double doubleValue = 99.99;
        boolean booleanValue = true;

     
        Integer intObj = intValue;
        Character charObj = charValue;
        Byte byteObj = byteValue;
        Short shortObj = shortValue;
        Long longObj = longValue;
        Float floatObj = floatValue;
        Double doubleObj = doubleValue;
        Boolean booleanObj = booleanValue;

      
        int intUnboxed = intObj;
        char charUnboxed = charObj;
        byte byteUnboxed = byteObj;
        short shortUnboxed = shortObj;
        long longUnboxed = longObj;
        float floatUnboxed = floatObj;
        double doubleUnboxed = doubleObj;
        boolean booleanUnboxed = booleanObj;

        
        System.out.println("The value of intValue is " + intValue);
        System.out.println("The value of intObj (after autoboxing) is " + intObj);
        System.out.println("The value of intUnboxed (after unboxing) is " + intUnboxed);

        System.out.println("The value of charValue is " + charValue);
        System.out.println("The value of charObj (after autoboxing) is " + charObj);
        System.out.println("The value of charUnboxed (after unboxing) is " + charUnboxed);

        System.out.println("The value of byteValue is " + byteValue);
        System.out.println("The value of byteObj (after autoboxing) is " + byteObj);
        System.out.println("The value of byteUnboxed (after unboxing) is " + byteUnboxed);

        System.out.println("The value of shortValue is " + shortValue);
        System.out.println("The value of shortObj (after autoboxing) is " + shortObj);
        System.out.println("The value of shortUnboxed (after unboxing) is " + shortUnboxed);

        System.out.println("The value of longValue is " + longValue);
        System.out.println("The value of longObj (after autoboxing) is " + longObj);
        System.out.println("The value of longUnboxed (after unboxing) is " + longUnboxed);

        System.out.println("The value of floatValue is " + floatValue);
        System.out.println("The value of floatObj (after autoboxing) is " + floatObj);
        System.out.println("The value of floatUnboxed (after unboxing) is " + floatUnboxed);

        System.out.println("The value of doubleValue is " + doubleValue);
        System.out.println("The value of doubleObj (after autoboxing) is " + doubleObj);
        System.out.println("The value of doubleUnboxed (after unboxing) is " + doubleUnboxed);

        System.out.println("The value of booleanValue is " + booleanValue);
        System.out.println("The value of booleanObj (after autoboxing) is " + booleanObj);
        System.out.println("The value of booleanUnboxed (after unboxing) is " + booleanUnboxed);
    }
}
