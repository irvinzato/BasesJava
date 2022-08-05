import java.util.Arrays;
import java.util.Collections;

public class ArreglosForInversoMutableEjemplos {
  //Otra manera de resolverlo y reutilizando un método
  public static void reverseArray(String[] arrayProducts) {
    int totalProducts = arrayProducts.length;
    for( int i = 0; i < totalProducts; i++ ) {
      String actual = arrayProducts[i];
      String reverse = arrayProducts[arrayProducts.length-1-i];
      arrayProducts[i] = reverse;
      arrayProducts[arrayProducts.length-1-i] = actual;
      totalProducts--;
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

    Arrays.sort(products);
    for (int i = 0; i < totalProducts; i++) {
      System.out.println("Para indice " + i + " : " + products[i]);
    }
    System.out.println("Pongo el ultimo al inicio y el que estaba al inicio al final");
    for( int i = 0; i < totalProducts/2; i++ ) {
      String actual = products[i];
      String reverse = products[totalProducts-1-i];
      products[i] = reverse;
      products[totalProducts-1-i] = actual;
    }
    for (int i = 0; i < totalProducts; i++) {
      System.out.println("Para indice " + i + " : " + products[i]);
    }

    //Segunda forma}
    System.out.println("Después de llamar método");
    reverseArray( products );
    for (int i = 0; i < totalProducts; i++) {
      System.out.println("Para indice " + i + " : " + products[i]);
    }

    //Otra forma con la API de JAVA
    System.out.println("Con la API de Java");
    Collections.reverse(Arrays.asList(products));
    for (int i = 0; i < totalProducts; i++) {
      System.out.println("Para indice " + i + " : " + products[i]);
    }

  }
}
