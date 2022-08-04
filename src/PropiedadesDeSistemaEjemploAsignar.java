import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropiedadesDeSistemaEjemploAsignar {
  public static void main(String[] args) {
    try {
      //Lleva la ruta del archivo donde están las configuraciones que queremos agregar
      FileInputStream file = new FileInputStream("src/config.properties");
      Properties p = new Properties(System.getProperties());
      //método load para cargar las nuevas configuraciones
      p.load(file);
      //Otra forma de agregar configuracion una por una, sin archivo
      p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

      System.setProperties(p);
      System.out.println("Ya actualice, ahora puedo acceder " + System.getProperty("config.autor.email"));
      System.getProperties().list(System.out);
    } catch (Exception e) {
      System.err.println("El sistema no puede encontrar = " + e);
      //Con exit le digo que termine el código y le asigno un status
      System.exit(1);
    }


  }
}
