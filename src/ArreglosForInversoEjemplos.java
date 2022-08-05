import java.util.Arrays;

public class ArreglosForInversoEjemplos {
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

    Arrays.sort( products );
    for( int i = 0; i < totalProducts; i++ ) {
      System.out.println("Para indice " + i + " : " + products[i]);
    }
    System.out.println("Muestro el arreglo de manera inversa");
    for( int i = 0; i < totalProducts; i++ ) {
      System.out.println("Para indice " + i + " : " + products[totalProducts-i-1]);
    }
    System.out.println("Inverso implementado de otra forma");
    for( int i = totalProducts - 1; i >= 0; i-- ) {
      System.out.println("Para indice " + i + " : " + products[i]);
    }


  }
}
