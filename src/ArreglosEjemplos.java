import java.util.Arrays;

public class ArreglosEjemplos {
  public static void main(String[] args) {
    String[] productos = new String[7];
    int[] numbers = new int[4];

    //Trabajo con arreglo de números
    numbers[0] = 24;
    numbers[1] = Integer.valueOf("2");
    numbers[2] = 10;
    numbers[3] = 4;
    //No da error pero marcara una Excepción
    //numbers[4] = 5;
    Arrays.sort( numbers );
    int i = numbers[0];
    int j = numbers[1];
    int k = numbers[2];
    int l = numbers[3];

    System.out.println("i = " + i);
    System.out.println("j = " + j);
    System.out.println("k = " + k);
    System.out.println("l = " + l);

    //Trabajo con arreglo de productos
    productos[0] = "Kingston Pendrive 64GB";
    productos[1] = "Samsung Galaxy";
    productos[2] = "Disco duro SSD Samsung Externo";
    productos[3] = "Asus Notebook";
    productos[4] = "Macbook Air";
    productos[5] = "Chromecast 4ta generacion";
    productos[6] = "AMD Ryzhen 3500";
    //Para ordenar los elementos
    Arrays.sort( productos );
    
    System.out.println("productos[0] = " + productos[0]);
    System.out.println("productos[1] = " + productos[1]);
    System.out.println("productos[2] = " + productos[2]);
    System.out.println("productos[3] = " + productos[3]);
    System.out.println("productos[4] = " + productos[4]);
    System.out.println("productos[5] = " + productos[5]);
    System.out.println("productos[6] = " + productos[6]);


  }
}
