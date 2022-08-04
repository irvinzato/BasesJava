import java.util.Locale;

public class EjecutarProgramaSistemaOperativoEjemplo {
  public static void main(String[] args) {
    //Tiempo de ejecución
    Runtime rt = Runtime.getRuntime();
    Process process;

    try {
      //Este es el caso de Windows se puede anidar los casos de Mac y Linux, también puedo usar "contains()"
      if( System.getProperty("os.name").toLowerCase().startsWith("windows") ) {
        process = rt.exec("notepad");
      } else {
        process = rt.exec("gedit");
      }
      process.waitFor();
    } catch (Exception e) {
      System.out.println("Excepción = " + e.getMessage());
    }
    System.out.println("Se ha cerrado el editor");


  }
}
