public class WrapperOperadoresRelacionales {
  public static void main(String[] args) {
    //Con JAVA hay un número curioso, que es 127
    Integer num1 = Integer.valueOf(1000);
    Integer num2 = num1;

    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);

    System.out.println("¿Son el mismo objeto? " + (num1 == num2));

    //Contiene el mismo valor pero no la misma instancia, los primitivos siempre comparan por el valor
    num2 = 1000;

    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);

    System.out.println("¿Son el mismo objeto? " + (num1 == num2));
    System.out.println("Comparar por el valor num1.equals(num2)  " + num1.equals(num2) );
    //Otra forma
    System.out.println("Comparar por el valor, otra manera ( num1.intValue() == num2.intValue() )  " + ( num1.intValue() == num2.intValue() ) );

    //Se puede hacer sin detalle, por debajo JAVA usa "intValue()" para compararlos, solo con el "==" tener cuidado
    boolean condition = num1 > num2;
    System.out.println("condition = " + condition);

  }
}
