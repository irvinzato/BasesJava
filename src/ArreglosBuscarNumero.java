import java.util.Scanner;

public class ArreglosBuscarNumero {
  public static void main(String[] args) {
    int[] a = new int[10];
    Scanner s = new Scanner(System.in);

    for( int i = 0; i < a.length; i++ ) {
      System.out.println("Ingres un numero");
      a[i] = s.nextInt();
    }
    System.out.println("Ingresa el numero a buscar:");
    int num = s.nextInt();
    int i = 0;
    while( i < a.length && a[i] != num) {
      i++;
    }
    if( i == a.length) {
      System.out.println("No se encontro el numero a buscar");
    } else if( a[i] == num ) {
      System.out.println("Se encontro en numero en la posicion " + i );
    }





  }
}
