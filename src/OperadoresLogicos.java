public class OperadoresLogicos {
  public static void main(String[] args) {
    int i = 3;
    byte j = 7;
    float f = 127e-7F;
    double d = 2.1413e3;
    boolean m = false;

    //El doble "&&" es eficiente, si la primera no cumple, la segunda no la evalúa(todas deben ser true)
    boolean b1 = i == j && f > d && m == false;
    System.out.println("b1 = " + b1);

    //Con que una sea true se cumple(Si la primera es true las siguientes no se evalúan)
    boolean b2 = i == j || f < d;
    System.out.println("b2 = " + b2);

    //Paréntesis para dar prioridad a la evaluación, es muy diferente con o sin paréntesis
    boolean b3 = i < j && (f < d || m == true);
    System.out.println("b3 = " + b3);
    
    //Primero se hace el AND por la prioridad de los operadores, la precedencia es importante
    boolean b4 = i == j || f < d && m == true;
    System.out.println("b4 = " + b4);
    
    boolean b5 = (true || true) && false;
    System.out.println("b5 = " + b5);

  }
}
