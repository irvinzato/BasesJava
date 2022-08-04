import java.util.Map;

//Podemos crear nuestras propias variables de ambiente y saldrán al consultar
//Con "setx" desde terminal o entrando directamente a variables de entorno
public class VariablesDeEntornoEjemplo {
  public static void main(String[] args) {
    //Un mapa en JAVA es como un arreglo asociativo, asocia valores guardados con un nombre
    Map<String, String> varEnv = System.getenv();
    System.out.println("variables de ambiente o entorno del sistema = " + varEnv);

    System.out.println("---- Listando variables de entorno del sistema ----");
    for( String key: varEnv.keySet() ) {
      System.out.println("key = " + key + " - " + varEnv.get(key));
    }

    String userName = System.getenv("USERNAME");
    System.out.println("userName = " + userName);

    String path = System.getenv("PATH");
    System.out.println("path = " + path);

    //Otra forma de acceder al Path mediante el mapa, solo que en el mapa es estricta la escritura
    String path2 = varEnv.get("Path");
    System.out.println("path2 = " + path2);
    
    String javaHome = System.getenv("JAVA_HOME");
    System.out.println("javaHome = " + javaHome);

    String tempDir = System.getenv("TEMP");
    System.out.println("tempDir = " + tempDir);

  }
}
