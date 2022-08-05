import java.util.Arrays;

public class ArreglosForEjemplos {
  public static void main(String[] args) {
    String[] products = new String[7];
    int[] numbers = new int[10];
    int totalProducts = products.length;
    int totalNumbers = numbers.length;

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
    System.out.println("--------- Ahora con forEach ----------");
    for( String prod: products ) {
      System.out.println("prod = " + prod);
    }

    for( int i = 0; i < totalNumbers; i++ ) {
      numbers[i] = i * 3;
    }

    for( int i = 0; i < totalNumbers; i++ ) {
      System.out.println("numbers[i] = " + numbers[i]);
    }


  }
}
