import java.util.Arrays;
import java.util.Collections;

public class ArreglosForOrdenamientoBurbujaEjemplos {
  //Reciclo con las formas más genéricas para que acepte cualquier arreglo
  public static void burbuja( Object[] array ) {
    //Burbuja optimizado
    int total = array.length;
    for( int i = 0; i < total-1; i++ ) {
      for( int j = 0; j < total-1-i; j++ ) {
        if( ((Comparable) array[j+1]).compareTo(array[j]) < 0 ) {
          Object aux = array[j];
          array[j] = array[j+1];
          array[j+1] = aux;
        }
      }
    }
  }

  public static void main(String[] args) {
    String[] products = new String[7];
    int totalProducts = products.length;

    products[0] = "Kingston Pendrive 64GB";
    products[1] = "Samsung Galaxy";
    products[2] = "Disco duro SSD Samsung Externo";
    products[3] = "Asus Notebook";
    products[4] = "Macbook Air";
    products[5] = "Chromecast 4ta generacion";
    products[6] = "AMD Ryzhen 3500";

    //Arrays.sort(products);
    burbuja( products );

    for (int i = 0; i < totalProducts; i++) {
      System.out.println("Para indice " + i + " : " + products[i]);
    }

    Integer[] numbers = new Integer[4];
    int totalNumbers = numbers.length;
    //Trabajo con arreglo de números
    numbers[0] = 24;
    numbers[1] = Integer.valueOf("2");
    numbers[2] = 10;
    numbers[3] = 4;

    burbuja( numbers );
    System.out.println("Ordenamiento de enteros");
    for( int i = 0; i < totalNumbers; i++ ) {
      System.out.println("numbers[i] = " + numbers[i]);
    }

  }
}
