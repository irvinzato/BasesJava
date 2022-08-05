import java.util.Scanner;

public class ArreglosEliminarElemento {
  public static void main(String[] args) {
    int[] numbers = new int[10];
    Scanner s = new Scanner(System.in);

    for( int i = 0; i < numbers.length; i++ ) {
      System.out.println("Ingrese un numero");
      numbers[i] = s.nextInt();
    }
    System.out.println("-----------");
    System.out.println("¿Que posicion quieres eliminar? entre 0 y 9");
    int position = s.nextInt();
    
    for( int i = position; i < numbers.length - 1; i++ ) {
      numbers[i] = numbers[i+1];
    }

    System.out.println("El arreglo queda");
    for( int num: numbers) {
      System.out.println("num = " + num);
    }

    int[] numbers2 = new int[numbers.length-1];
    //Copio arreglo usando la clases System
    System.arraycopy( numbers, 0, numbers2, 0, numbers2.length );
    System.out.println("Arreglo copiado con los elementos que quedaron");
    for( int num: numbers2 ) {
      System.out.println("num = " + num);
    }

  }
}
