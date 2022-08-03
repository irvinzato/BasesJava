public class StringArchivoEjemplo {
  public static void main(String[] args) {
    String file = "alguna_imagen.jpeg";
    int i = file.lastIndexOf('.');
    System.out.println("file.length() = " + file.length());
    System.out.println("file.substring( i + 1) = " + file.substring( i + 1));
  }
}
