import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParseEjemplo {
  public static void main(String[] args) {
    //Convierte un String dado por el usuario a un objeto fecha
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Scanner s = new Scanner( System.in );
    System.out.println("Ingrese una fecha con formato \"yyyy-MM-dd\"");

    try {
      Date date = format.parse( s.next() );
      System.out.println("fecha = " + date);
      System.out.println("formato = " + format.format(date));

      //Comparo si la fecha del usuario es mayor,menor o igual a la actual
      Date date2 = new Date();
      System.out.println("fecha actual = " + format.format( date2 ));
      if( date.after( date2 ) ) {
        System.out.println("Tu fecha es mayor que la actual");
      } else if( date.before( date2 ) ) {
        System.out.println("Tu fecha es anterior a la actual");
      } else if( date.equals( date2 ) ) {
        //Si no entra es por la hora de la fecha
        System.out.println("Tu fecha es igual a la actual");
      }

      //Otra forma de comparar fechas
      System.out.println("Segunda forma de comparar fechas");
      if( date.compareTo(date2) > 0 ) {
        System.out.println("Tu fecha es mayor a la actual");
      } else if( date.compareTo(date2) < 0 ) {
        System.out.println("Tu fecha es menor a la actual");
      } else if( date.compareTo(date2) == 0 ) {
        System.out.println("Tu fecha es igual a la actual");
      }


    } catch (ParseException e) {
      e.printStackTrace();
    }


  }
}
