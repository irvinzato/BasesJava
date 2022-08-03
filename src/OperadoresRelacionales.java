public class OperadoresRelacionales {
  public static void main(String[] args) {
    int i = 3;
    byte j = 7;
    float f = 127e-7F;
    double d = 2.1413e3;
    boolean m = false;
    
    //Cuando queremos comparar objetos no se usa "==", se usa "equals"
    boolean b1 = i == j;
    System.out.println("b1 = " + b1);

    boolean b2 = !b1;
    System.out.println("b2 = " + b2);
    
    boolean b3 = i != j;  //En otros lenguajes "<>"
    System.out.println("b3 = " + b3);

    boolean b4 = m == true;
    System.out.println("b4 = " + b4);

    boolean b5 = m != true;
    System.out.println("b5 = " + b5);
    
    boolean b6 = i > j;
    System.out.println("b6 = " + b6);
    
    boolean b7 = i < j;
    System.out.println("b7 = " + b7);
    
    boolean b8 = d >= f;
    System.out.println("b8 = " + b8);

    boolean b9 = d <= f;
    System.out.println("b9 = " + b9);

  }
}
