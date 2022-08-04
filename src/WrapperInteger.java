public class WrapperInteger {
  public static void main(String[] args) {
    //Se aplica a cualquier tipo, solo recordar que si se hace mal puede haber perdida de información

    int intPrimitivo = 52000;
    //Forma explicita de crear el objeto Integer
    Integer intObject = Integer.valueOf(intPrimitivo);
    //Forma implícita, ambas correctas
    Integer intObject2 = 32768;
    System.out.println("intObject2 = " + intObject2);

    //Forma de transformar un entero objeto a primitivo, ambas correctas(implícita y explicita)
    int num = intObject;
    int num2 = intObject.intValue();

    //Transformar string a valor entero
    String valueTvLcd = "67000";
    Integer value = Integer.valueOf( valueTvLcd );
    System.out.println("value = " + value);

    //Si se transforma a un valor menor del que soporta abra perdida de información, ambiguedad
    Short shortObject = intObject.shortValue();
    System.out.println("shortObject = " + shortObject);



  }
}
