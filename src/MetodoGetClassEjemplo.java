import java.lang.reflect.Method;

public class MetodoGetClassEjemplo {
  public static void main(String[] args) {
    String text = "Aprendamos JAVA";

    //Obtengo la clase de la variable text, en este caso "String"
    Class strClass = text.getClass();

    System.out.println("strClass.getName() = " + strClass.getName());
    System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
    System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
    System.out.println("strClass = " + strClass);

    //Todos los métodos de la clase String
    for( Method m: strClass.getMethods() ) {
      System.out.println("m.getName() = " + m.getName());
    }

    Integer num = 34;
    Class intClass = num.getClass();

    System.out.println("intClass = " + intClass);
    System.out.println("intClass.getName() = " + intClass.getName());
    System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
    System.out.println("intClass.getPackage() = " + intClass.getPackage());
    System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
    System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass().getSuperclass());

    //Todos los métodos de la clase Object
    for( Method m: intClass.getSuperclass().getSuperclass().getMethods() ) {
      System.out.println("m.getName() = " + m.getName());
    }
    
  }
}