import java.util.Scanner;

public class ArreglosDesplazarPosicionAmpliandoArreglo {
  public static void main(String[] args) {
    int[] numbers = new int[10];
    int element, position, last;
    Scanner s = new Scanner(System.in);

    for( int i = 0; i < numbers.length; i++ ) {
      System.out.println("Ingrese el numero");
      numbers[i] = s.nextInt();
    }
    System.out.println("¿Que elemento quiere agregar?");
    element = s.nextInt();
    System.out.println("En que posicion del 0 al 9?");
    position = s.nextInt();
    last = numbers[numbers.length - 1];

    for( int i = numbers.length - 2; i >= position; i-- ) {
      numbers[i+1] = numbers[i];
    }
    numbers[position] = element;

    //Nuevo arreglo ampliado
    int[] numbers2 = new int[numbers.length + 1];
    System.arraycopy( numbers, 0, numbers2, 0, numbers.length); //El último valor es la cantidad de elementos que voy a copiar
    numbers2[position] = element;
    numbers2[numbers2.length - 1] = last;

    System.out.println("Arreglo final");
    for( int num: numbers2) {
      System.out.println("num = " + num);
    }


  }
}
