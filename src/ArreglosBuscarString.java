import java.util.Scanner;

public class ArreglosBuscarString {
  public static void main(String[] args) {
    //Puede ser optimizado para que no importe mayusculas, minusculas, etc.
    String[] a = new String[5];
    Scanner s = new Scanner(System.in);

    for( int i = 0; i < a.length; i++ ) {
      System.out.println("Ingres un nombre");
      a[i] = s.next();
    }
    System.out.println("Ingresa el nombre a buscar:");
    String word = s.next();
    int i = 0;
    while( i < a.length && !a[i].equalsIgnoreCase(word) ) {
      i++;
    }
    if( i == a.length) {
      System.out.println("No se encontro el nombre a buscar");
    } else if( a[i].compareTo(word) == 0 ) { //Si es igual a 0 es por que son iguales
      System.out.println("Se encontro el nombre en la posicion " + i );
    }


  }
}
