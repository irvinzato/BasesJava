import java.util.Locale;

public class ValidarString {
  public static void main(String[] args) {
    String course = null;
    
    boolean isNull = course == null;
    System.out.println("isNull = " + isNull);

    if( isNull ){
      course = "Programación en Java";
    }

    boolean isEmpty = course.length() == 0;
    System.out.println("isEmpty = " + isEmpty);
    //Otra forma
    boolean isEmpty2 = course.isEmpty();

    //"isBlack()" evalua que tenga contenido, no solo que tenga caracteres porque puede que tenga solo espacios
    boolean isWhite = course.isBlank();

    if( !isWhite ){
      //Con "concat" no se pueden unir String con Strings en "null", con "+" si se puede
      System.out.println( "Bienvenido al curso ".concat( course ) );
      System.out.println(course.toUpperCase());
    }
    
  }
}
