import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDateEjemplo {
  public static void main(String[] args) {
    Date date = new Date();

    System.out.println("date = " + date);
    //Para este paquete hay formatos que tiene para mostrar la fecha según el gusto "SimpleDateFormat" google
    SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM yyyy");
    String dateStr = df.format( date );
    long l = 0;
    for( int i = 0; i < 1000000; i++ ) {
      l += i;
    }

    System.out.println("long = " + l);

    Date date2 = new Date();
    long finalTime = date2.getTime() - date.getTime();

    System.out.println("dateStr = " + dateStr);
    System.out.println("Tiempo transcurrido en el for = " + finalTime);


  }
}
