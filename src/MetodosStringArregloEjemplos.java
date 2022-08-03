public class MetodosStringArregloEjemplos {
  public static void main(String[] args) {
    String trabalenguas = "trabalenguas";
    //Da el hash de la instancia, para ver el contenido se debe iterar el arreglo
    System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
    char[] array = trabalenguas.toCharArray();

    for(int i = 0; i < array.length; i++) {
      System.out.println("array[i] = " + array[i]);
    }

    System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
    String[] arraySplit = trabalenguas.split("a");
    for( int i = 0; i < arraySplit.length; i++) {
      System.out.println("arraySplit = " + arraySplit[i]);
    }

    String file = "algun_nombre.pdf";
    //Debo usar "\\." por que el punto solo es una expresión regular, lo tengo que escapar
    String[] arrayFile = file.split("\\.");
    for( int i = 0; i < arrayFile.length; i++) {
      System.out.println("arrayFile[i] = " + arrayFile[i]);
    }

    System.out.println("extensión = " + arrayFile[ arrayFile.length - 1 ]);

  }
}
