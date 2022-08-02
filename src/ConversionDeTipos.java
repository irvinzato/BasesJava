public class ConversionDeTipos {
  public static void main(String[] args) {
    String numeroStr = "50";
    int numeroInt = Integer.parseInt( numeroStr );
    System.out.println("numeroInt = " + numeroInt);
    
    String realStr = "9231.78e-2";
    double realDouble = Double.parseDouble( realStr );
    System.out.println("realDouble = " + realDouble);
    
    String logicoStr = "true";
    boolean logicoBoolean = Boolean.parseBoolean( logicoStr );
    System.out.println("logicoBoolean = " + logicoBoolean);
    
    int numInt = 100;
    System.out.println("numInt = " + numInt);
    
    String numStr = Integer.toString( numInt );
    System.out.println("numStr = " + numStr);
    
    //Otra forma de convertir entero a string
    numStr = String.valueOf( numInt + 10 );
    System.out.println("numStr = " + numStr);

    double otroRealDouble = 1.23456e2;
    String otroRealStr = Double.toString( otroRealDouble );
    System.out.println("otroRealStr = " + otroRealStr);
    
    otroRealStr = String.valueOf( 1.23456e2f );
    System.out.println("otroRealStr = " + otroRealStr);

    int i = 32900;
    //A esto se llama casteo o forzar la conversión, se pueden pasar valores a mayores bites pero a menores puede haber perdida de información
    short s = (short) i;
    System.out.println("s = " + s);
    System.out.println("Máximo valor de short " + Short.MAX_VALUE);
    long l = i;
    System.out.println("l = " + l);
    char c = (char) i;
    System.out.println("c = " + c);
    float f = (float) i;
    System.out.println("f = " + f);

    System.out.println("Comillas \"dentro de un mensaje\" de salida");
  }
}
