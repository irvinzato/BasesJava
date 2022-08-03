import java.util.Scanner;

public class LoginOperadoresLogicos {
  public static void main(String[] args) {
    //En java asi se definen los arreglos, para hacerlos dinámicos se usa una API
    /*String[] users = new String[4];
    String[] passwords = new String[4];

    users[0] = "irvinzato";
    users[1] = "admin";

    passwords[0] = "123456";
    passwords[1] = "admin";*/

     //Otra forma de definir arreglos
    String[] users = { "irvinzato", "admin", "pepe" };
    String[] passwords = { "123456", "admin", "hola" };

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el username");
    String givenUser = scanner.next();

    System.out.println("Ingrese el password");
    String givenPassword = scanner.next();

    boolean isAuthenticated = false;

    for( int i = 0; i < users.length; i++ ) {
      if( users[i].equals(givenUser) && passwords[i].equals(givenPassword) ) {
        isAuthenticated = true;
        break; //Para salirse del for si ya encontró alguno
      }
    }

    String msg = isAuthenticated ? "Bienvenido " + givenUser : "No es correcta la autenticación\nUsername o password incorrectos";
    System.out.println("msg = " + msg);

    /*if( isAuthenticated ) {
      System.out.println("Bienvenido " + givenUser);
    } else {
      System.out.println("No es correcta la autenticación");
    }*/


  }
}
