public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 3.92e3F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo float corresponde en byte a "+ Float.BYTES);
        System.out.println("Tipo float corresponde en bites a "+ Float.SIZE);
        System.out.println("Tipo float su valor maximo es "+ Float.MAX_VALUE);
        System.out.println("Tipo float su valor menor es "+ Float.MIN_VALUE);

       double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en byte a "+ Double.BYTES);
        System.out.println("Tipo double corresponde en bites a "+ Double.SIZE);
        System.out.println("Tipo double su valor maximo es "+ Double.MAX_VALUE);
        System.out.println("Tipo double su valor menor es "+ Double.MIN_VALUE);

        var varFloat = 3.1416;
        System.out.println("varFloat = " + varFloat);
    }
}
