public class OperadoresAsignacion {
  public static void main(String[] args) {
    //Básicamente es el que trabajamos siempre, el igual "="
    int i = 5;
    int j = i + 4;
    System.out.println("i = " + i);
    System.out.println("j = " + j);

    i +=  2;  //Lo mismo a i = i + 2
    System.out.println("i = " + i);
    
    i += 5;
    System.out.println("i = " + i);
    
    j -= 4;  // j = j - 4;
    System.out.println("j = " + j);

    j *= 3; // j = j * 3;
    System.out.println("j = " + j);

    //Lo mismo se puede en Strings, por ejemplo para consultas sql
    String sqlString = "select * from clientes as c";
    sqlString += " where c.nombre = 'Irving'";
    sqlString += " and c.activo = 1";
    System.out.println("sqlString = " + sqlString);
    
  }
}
