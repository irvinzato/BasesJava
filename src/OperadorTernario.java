import java.util.Scanner;

public class OperadorTernario {
  public static void main(String[] args) {
    //variable = condition ? es verdadero : es falso;
    String variable = 7 == 5 ? "es verdadero" : "es falso";
    System.out.println("variable = " + variable);

    String state = "";
    double average = 0.0;

    double maths = 0.0;
    double sciences = 0.0;
    double history = 0.0;

    Scanner s = new Scanner( System.in );
    System.out.println("Ingresa calificación de matemáticas");
    maths = s.nextDouble();

    System.out.println("Ingresa calificación de ciencias");
    sciences = s.nextDouble();

    System.out.println("Ingresa calificación de historia");
    history = s.nextDouble();

    average = (maths + sciences + history) / 3;

    //Muy parecido al if pero en una línea
    state = average >= 6 ? "Aprobado" : "Reprobado";
    System.out.println("average = " + average);
    System.out.println("state = " + state);


  }
}
