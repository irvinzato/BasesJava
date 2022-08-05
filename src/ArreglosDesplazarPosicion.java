import java.util.Scanner;

public class ArreglosDesplazarPosicion {
  public static void main(String[] args) {
    int[] numbers = new int[10];
    int last;
    Scanner s = new Scanner(System.in);

    for( int i = 0; i < numbers.length; i++ ) {
      System.out.println("Ingrese el numero");
      numbers[i] = s.nextInt();
    }

    last = numbers[numbers.length-1];
    for( int i = numbers.length - 2; i >= 0; i-- ) {
      numbers[i+1] = numbers[i];
    }
    numbers[0] = last;
    System.out.println("Arreglo final");
    for( int num: numbers) {
      System.out.println("num = " + num);
    }


  }
}
