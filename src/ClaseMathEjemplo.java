public class ClaseMathEjemplo {
  public static void main(String[] args) {
    int absolute = Math.abs(-3);
    System.out.println("absolute = " + absolute);

    absolute = Math.abs(3);
    System.out.println("absolute = " + absolute);
    
    double max = Math.max( 3.5, 1.2 );
    System.out.println("max = " + max);
    
    double min = Math.min( 3.5, 1.2);
    System.out.println("min = " + min);
    //techo
    double ceiling = Math.ceil( 3.5 );
    System.out.println("ceiling = " + ceiling);
    //piso
    double floor = Math.floor( 3.5 );
    System.out.println("floor = " + floor);
    //redondear
    long round = Math.round( Math.PI );
    System.out.println("round = " + round);

    double exp = Math.exp(1);
    System.out.println("exp = " + exp);
    
    double log = Math.log(10);
    System.out.println("log = " + log);

    double potencia = Math.pow( 10, 3 ); //10*10*10
    System.out.println("potencia = " + potencia);
    
    double raiz = Math.sqrt(5);
    System.out.println("raiz = " + raiz);

    double grados = Math.toDegrees(1.57);
    grados = Math.round(grados);
    System.out.println("Convertir de radianes a grados = " + grados);

    double radianes = Math.toRadians(90.00);
    System.out.println("Convertir de grados a radianes = " + radianes);

    System.out.println("sin(90) = " + Math.sin(radianes));

    
  }
}
