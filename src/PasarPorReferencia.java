public class PasarPorReferencia {
  public static void main(String[] args) {
    //Ambas variables apuntan al mismo lugar de memoria, por eso aun que está en otro método si modifica el arreglo original
    int[] ages = { 10, 11, 12 };

    System.out.println("Iniciando metodo main =  ");
    for( int age: ages) {
      System.out.println("age " + age);
    }
    System.out.println("Antes de llamar el metodo test");
    test(ages);
    System.out.println("Despues de llamar el metodo test");
    for( int age: ages) {
      System.out.println("age " + age);
    }
    System.out.println("Finaliza metodo main con los datos del arreglo modificados ");
  }

  public static void test( int[] agesArray ) {
    System.out.println("Iniciando metodo test ");
    for( int i = 0; i < agesArray.length; i++ ) {
      agesArray[i] = agesArray[i] + 20;
    }
    System.out.println("Finaliza metodo test ");
  }

}
