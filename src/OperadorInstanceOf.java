public class OperadorInstanceOf {
  public static void main(String[] args) {
    //Es lo mismo si uso el ... = new String();
    String text = "Creando un objeto de la clase String...";
    Integer num = 7;
    Double decimal = 45.45;

    Boolean b1 = text instanceof String;
    System.out.println("texto es del tipo String = " + b1);

    //"Object" es la clase padre de todos los objetos
    b1 = text instanceof Object;
    System.out.println("texto es del tipo Object = " + b1);

    b1 = num instanceof Integer;
    System.out.println("num es del tipo Integer = " + b1);

    b1 = num instanceof Number;
    System.out.println("num es del tipo Number = " + b1);
    
    b1 = decimal instanceof Number;
    System.out.println("decimal es del tipo Number = " + b1);

    b1 = b1 instanceof Boolean;
    System.out.println("b1 es del tipo Boolean = " + b1);

  }
}
