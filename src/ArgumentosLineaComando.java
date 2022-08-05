public class ArgumentosLineaComando {
  public static void main(String[] args) {
    //con "javac ArgumentosLineaComando.java" se compila manualmente
    if( args.length == 0 ) {
      System.out.println("Debe ingresar argumentos o parámetros");
      System.exit(-1);
    }
    for( int i = 0; i < args.length; i++ ) {
      System.out.println("Argumentos n = " + i + " : " + args[i]);
    }


  }
}
