public class EjemploStringInmutable {
  public static void main(String[] args) {
    String course = "Programación en Java";
    String teacher = "Irving Rivera";

    String result = course.concat( teacher );
    System.out.println("course = " + course);
    System.out.println("result = " + result);
    System.out.println("curso == resultado = " + course == result);

    //Estoy modificando el string original con expresiones lambda
    String result2 = course.transform( (c) -> {
      return c + " con " + teacher;
    });
    System.out.println("course = " + course);
    System.out.println("result2 = " + result2);

    //Para poder ver los cambios se debe guardar en otra variable
    String result3 = result.replace( "a", "A" );
    System.out.println("result = " + result);
    System.out.println("result3 = " + result3);
  }
}
