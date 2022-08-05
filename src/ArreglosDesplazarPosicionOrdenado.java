import java.util.Scanner;

public class ArreglosDesplazarPosicionOrdenado {
  public static void main(String[] args) {
    //Este ejemplo es solo para arreglos ordenados
    int[] numbers = new int[7];
    int number = 0, position = 0;
    Scanner s = new Scanner(System.in);

    for( int i = 0; i < numbers.length-1; i++ ) {
      System.out.println("Ingresa un numero");
      numbers[i] = s.nextInt();
    }
    System.out.println("--------------------");
    System.out.println("Ingresa el numero que quieres insertar");
    number = s.nextInt();

    while( position < numbers.length-1 && number > numbers[position] ) {
      position ++;
    }
    for( int i = numbers.length-2; i >= position; i-- ) {
      numbers[i+1] = numbers[i];
    }
    numbers[position] = number;
    System.out.println("EL arreglo ordenado queda:");
    for( int num: numbers ) {
      System.out.println("num = " + num);
    }



  }
}
