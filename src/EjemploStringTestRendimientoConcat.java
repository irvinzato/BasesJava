public class EjemploStringTestRendimientoConcat {
  public static void main(String[] args) {
    String a = "a";
    String b = "b";
    String c = a;
    StringBuilder sb = new StringBuilder(a);    //En conclusión es el más rápido y/o eficiente

    long start = System.currentTimeMillis();

    //En los comentarios están los resultados del test
    for( int i = 0; i < 1000; i++ ) {
      //c = c.concat( a ).concat( b ).concat( "\n" ); //con 500 - Demoro 2ms / con 1000 - Demoro 4ms / con 10000 - Demoro 105ms / con 100000 - Demoro 5071ms
      //c += a + b + "\n";                            //con 500 - Demoro 19ms / con 1000 - Demoro 21ms / con 10000 - Demoro 68ms / con 100000 - Demoro 1976ms
      sb.append( a ).append( b ).append( "\n" );      //con 500 - Demoro 0ms / con 1000 - Demoro 0ms / con 10000 - Demoro 2ms / con 100000 - Demoro 8ms
    }

    long end = System.currentTimeMillis();

    System.out.println("sb = " + sb.toString());
    System.out.println("c = " + c);
    System.out.println( end - start );

  }
}
