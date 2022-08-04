public class SentenciaForEach {
  public static void main(String[] args) {
    int[] numbers = { 1, 3, 5, 7, 9, 11, 13, 15 };
    String[] names = { "Irving", "Angeles", "Jade", "Jesus", "Almendra", "Laura", "Emiliano", "Camila" };

    //Solo cambia su estructura, normalmente para arreglos y objetos se utiliza
    for( int num: numbers ) {
      System.out.println("num = " + num);
    }

    for( String name: names ) {
      System.out.println("nombre = " + name);
    }


  }
}
