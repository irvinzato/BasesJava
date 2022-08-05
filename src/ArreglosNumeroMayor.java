import java.util.Scanner;

public class ArreglosNumeroMayor {
  public static void main(String[] args) {
    int[] a = new int[5];
    Scanner s = new Scanner(System.in);

    System.out.println("Ingresa los numeros");
    for( int i = 0; i < a.length; i++ ) {
      a[i] = s.nextInt();
    }
    int maxPos = 0;
    for( int i = 1; i < a.length; i++ ) {
      maxPos = (a[maxPos] > a[i]) ? maxPos : i;
    }
    System.out.println("El numero maximo es: " + a[maxPos]);



  }
}
