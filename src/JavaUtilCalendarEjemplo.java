import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendarEjemplo {
  public static void main(String[] args) {
    //En esta creación no se usa new pero por debajo si se hace, por diseño se usa "getInstance()"
    Calendar calendar = Calendar.getInstance();
    //Con este método customizo la fecha y también puedo la hora, minutos...
    //calendar.set( 2022, 0, 2, 19, 20 );
    //Otra forma de customizar la fecha con calendar
    calendar.set( Calendar.YEAR, 2022 );
    calendar.set( Calendar.MONTH, Calendar.JANUARY );
    calendar.set( Calendar.DAY_OF_MONTH, 2 );
    //calendar.set( Calendar.HOUR_OF_DAY, 21 );
    calendar.set( Calendar.HOUR, 8 );
    calendar.set( Calendar.AM_PM, Calendar.PM );
    calendar.set( Calendar.MINUTE, 10 );
    calendar.set( Calendar.SECOND, 20 );

    Date date = calendar.getTime();
    System.out.println("Fecha sin formato = " + date);
                        //"HH" es para formato 24hrs, "hh" para formato am, pm
    SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd hh:mm:ss:SSS a" );
    String formatDate = format.format( date );

    System.out.println("fecha con formato = " + formatDate);

  }
}
