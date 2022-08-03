public class OperadorInstanceOfTiposGenericos {
  public static void main(String[] args) {
    Object text = "Creando un objeto de la clase String...";
    //De esta manera se define de forma explícita, hacerlo de manera literal es lo mismo
    Number num = Integer.valueOf(7);      //7;
    Number decimal = 45.45;

    Boolean b1 = text instanceof String;
    System.out.println("texto es del tipo String = " + b1);

    //"Object" es la clase padre de todos los objetos
    b1 = text instanceof Object;
    System.out.println("texto es del tipo Object = " + b1);

    b1 = text instanceof Integer;
    System.out.println("texto es del tipo Integer = " + b1);

    b1 = num instanceof Integer;
    System.out.println("num es del tipo Integer = " + b1);

    b1 = num instanceof Number;
    System.out.println("num es del tipo Number = " + b1);

    b1 = num instanceof Long;
    System.out.println("num es del tipo Long = " + b1);

    b1 = num instanceof Double;
    System.out.println("num es del tipo Double = " + b1);
    
    b1 = decimal instanceof Number;
    System.out.println("decimal es del tipo Number = " + b1);

    b1 = decimal instanceof Double;
    System.out.println("decimal es del tipo Double = " + b1);

    b1 = decimal instanceof Float;
    System.out.println("decimal es del tipo Float = " + b1);

    b1 = decimal instanceof Integer;
    System.out.println("decimal es del tipo Integer = " + b1);

    b1 = b1 instanceof Boolean;
    System.out.println("b1 es del tipo Boolean = " + b1);

  }
}
