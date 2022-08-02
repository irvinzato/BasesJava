public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numByte = 127;
        System.out.println("numByte = " + numByte);
        System.out.println("Tipo byte corresponde en byte a "+ Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a "+ Byte.SIZE);
        System.out.println("Tipo byte su valor maximo es "+ Byte.MAX_VALUE);
        System.out.println("Tipo byte su valor menor es "+ Byte.MIN_VALUE);

        short numShort = 30000;
        System.out.println("numShort = " + numShort);
        System.out.println("Tipo short corresponde en byte a "+ Short.BYTES);
        System.out.println("Tipo short corresponde en bites a "+ Short.SIZE);
        System.out.println("Tipo short su valor maximo es "+ Short.MAX_VALUE);
        System.out.println("Tipo short su valor menor es "+ Short.MIN_VALUE);

        int numInt = 32768;
        System.out.println("numInt = " + numInt);
        System.out.println("Tipo int corresponde en byte a "+ Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a "+ Integer.SIZE);
        System.out.println("Tipo int su valor maximo es "+ Integer.MAX_VALUE);
        System.out.println("Tipo int su valor menor es "+ Integer.MIN_VALUE);

        long numLong = 2147483648L;
        System.out.println("numLong = " + numLong);
        System.out.println("Tipo long corresponde en byte a "+ Long.BYTES);
        System.out.println("Tipo long corresponde en bites a "+ Long.SIZE);
        System.out.println("Tipo long su valor maximo es "+ Long.MAX_VALUE);
        System.out.println("Tipo long su valor menor es "+ Long.MIN_VALUE);
        
        var numVar = 9223372036854775809F;
        System.out.println("numVar = " + numVar);
    }
}
