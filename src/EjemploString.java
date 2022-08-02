public class EjemploString {
  public static void main(String[] args) {
    String course = "Programación en Java";
    String course2 = new String( "Programación en Java" );

    //Aquí se compara si el objeto es el mismo, pero se crearón de forma diferente
    boolean isSame = course == course2;
    System.out.println("course == course2 = " + isSame);

    //Aquí se compara que la cadena de texto sea la misma, existe "equalsIgnoreCase" para ignorar si esta en mayusculas o minusculas
    isSame = course.equals( course2 );
    System.out.println("course.equals( course2 ) = " + isSame);

    String course3 = "Programación en Java";
    //En este ejemplo si es true porque no crea un nuevo objeto, ya que ya estaba creado anteriormente(Para optimizar)
    isSame = course == course3;
    System.out.println("course == course3 = " + isSame);
  }
}
