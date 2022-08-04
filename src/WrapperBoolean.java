public class WrapperBoolean {
  public static void main(String[] args) {
    Integer num1, num2;
    num1 = 1;
    num2 = 2;

    boolean primitivoBoolean = num1 > num2;
    Boolean objectBoolean = Boolean.valueOf(primitivoBoolean);
    Boolean objectBoolean2 = Boolean.valueOf("false");
    Boolean objectBoolean3 = false;

    System.out.println("primitivoBoolean = " + primitivoBoolean);
    System.out.println("objectBoolean = " + objectBoolean);
    System.out.println("objectBoolean2 = " + objectBoolean2);

    //Los Booleans no se comportan igual que los enteros
    System.out.println("Comparacion de 2 objetos Boolean: " + ( objectBoolean == objectBoolean2 ));
    System.out.println("Comparacion de 2 objetos Boolean: " + ( objectBoolean.equals(objectBoolean2) ));

    System.out.println("Comparacion de 2 objetos Boolean: " + ( objectBoolean2 == objectBoolean3 ));
    System.out.println("Comparacion de 2 objetos Boolean: " + ( objectBoolean == objectBoolean3 ));

    //Puedo pasar valores sin usar el ".booleanValue()" de manera implícita
    boolean primitivoBoolean2 = objectBoolean2.booleanValue();
    System.out.println("primitivoBoolean2 = " + primitivoBoolean2);
    

  }
}
