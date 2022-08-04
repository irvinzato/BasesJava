public class PasarPorValor {
  public static void main(String[] args) {
    //Toda variable primitiva siempre se pasa por valor y no por referencia porque no es un objeto
    Integer i = 10;

    System.out.println("Iniciando metodo main con i = " + i );
    test(i);
    System.out.println("Finaliza metodo main con i = " + i );
  }

  public static void test( Integer i ) {
    System.out.println("Iniciando metodo test con i = " + i );
    i = 24;
    System.out.println("Finaliza metodo test con i = " + i );
  }

}
