public class EjemploStringConcatenacion {
  public static void main(String[] args) {
    String course = "Programación en Java";
    String teacher = "Irving Rivera";

    String detail = course + " con el instructor " + teacher;
    System.out.println(detail);

    int numA = 10;
    int numB = 5;

    //Importante la precedencia de las variables y/o parentesis
    System.out.println(detail + numA + numB);

    System.out.println(numA + numB + detail);
    
    //Otra forma de unir Strings sin unas el operador "+", los "concat" se pueden ir anidando
    String detail2 = course.concat( " con " ).concat( teacher );
    System.out.println("detail2 = " + detail2);
  }
}
