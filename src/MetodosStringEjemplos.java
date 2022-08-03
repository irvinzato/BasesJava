import java.util.Locale;

public class MetodosStringEjemplos {
  public static void main(String[] args) {
    String name = "Irving";

    System.out.println("name.length() = " + name.length());
    System.out.println("name.toUpperCase() = " + name.toUpperCase());
    System.out.println("name.toLowerCase() = " + name.toLowerCase());
    System.out.println("name.equals(\"Irving\") = " + name.equals("Irving"));
    System.out.println("name.equals(\"irving\") = " + name.equals("irving"));
    System.out.println("name.equalsIgnoreCase(\"irving\") = " + name.equalsIgnoreCase("irving"));
    System.out.println("name.compareTo(\"Irving\") = " + name.compareTo("Irving")); //Si es 0 son identicos, es parecido al "equals()"
    System.out.println("name.compareTo(\"Ivan\") = " + name.compareTo("Ivan"));    //Devuelve enteros
    System.out.println("name.charAt(0) = " + name.charAt(0));
    System.out.println("name.charAt(1) = " + name.charAt(1));
    System.out.println("name.charAt( name.length() - 1 ) = " + name.charAt( name.length() - 1 ));
    System.out.println("name.substring(1) = " + name.substring(1)); //Desde el int dado al final
    System.out.println("name.substring(1, 4) = " + name.substring(1, 4));
    System.out.println("name.substring(4, 6) = " + name.substring(4, 6)); //Deja hasta el 6 porque no lo toma en cuenta, más de ese número da error en este ejemplo
    System.out.println("name.substring( name.length() -1 ) = " + name.substring( name.length() -1 ));

    //Segunda parte
    String trabalenguas = "trabalenguas";
    
    System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
    System.out.println("trabalenguas = " + trabalenguas); //Es inmutabilidad, retorna una nueva instancia, la original no cambia
    System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));  //Siempre entrega la primera posición encontrada
    System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); //Siempre la ultima ocurrencia
    System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z')); //Si no existe el valor dado retorna -1
    System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas")); //Siempre debe recibir un string el método contains y retorna true o false
    System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));
    System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("tra")); //comienza con
    System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("as")); //termina con
    System.out.println("  trabalenguas  " );
    System.out.println("  trabalenguas  ".trim() );
  }
}
