import java.util.Scanner;

public class ArreglosDesplazarPosicionElegida {
  public static void main(String[] args) {
    int[] numbers = new int[10];
    int element, position;
    Scanner s = new Scanner(System.in);

    for( int i = 0; i < numbers.length-1; i++ ) {
      System.out.println("Ingrese el numero");
      numbers[i] = s.nextInt();
    }
    System.out.println("¿Que elemento quiere agregar?");
    element = s.nextInt();
    System.out.println("En que posicion del 0 al 9?");
    position = s.nextInt();

    for( int i = numbers.length - 2; i >= position; i-- ) {
      numbers[i+1] = numbers[i];
    }
    numbers[position] = element;
    System.out.println("Arreglo final");
    for( int num: numbers) {
      System.out.println("num = " + num);
    }


  }
}
