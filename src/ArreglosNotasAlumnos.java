import java.util.Scanner;

public class ArreglosNotasAlumnos {
  public static void main(String[] args) {
    double[] classMath, classHistory, classLanguage;
    classMath = new double[7];
    classHistory = new double[7];
    classLanguage = new double[7];
    double sumGradesMath = 0, sumGradesHistory = 0, sumGradesLanguage = 0;

    Scanner s = new Scanner(System.in);
    System.out.println("Ingresa 7 calificaciones de estudiantes para matematicas");
    for( int i = 0; i < classMath.length; i++ ) {
      classMath[i] = s.nextDouble();
    }

    System.out.println("Ingresa 7 calificaciones de estudiantes para historia");
    for( int i = 0; i < classHistory.length; i++ ) {
      classHistory[i] = s.nextDouble();
    }

    System.out.println("Ingresa 7 calificaciones de estudiantes para lenguaje");
    for( int i = 0; i < classLanguage.length; i++ ) {
      classLanguage[i] = s.nextDouble();
    }

    for( int i = 0; i < 7; i++ ) {
      sumGradesMath += classMath[i];
      sumGradesHistory += classHistory[i];
      sumGradesLanguage += classLanguage[i];
    }

    System.out.println("Promedio clase matematicas = " + (sumGradesMath/classMath.length) );
    System.out.println("Promedio clase historia = " + (sumGradesHistory/classHistory.length) );
    System.out.println("Promedio clase lenguaje = " + (sumGradesLanguage/classLanguage.length) );
    System.out.println("Promedio total de la clase = "
    + ((sumGradesMath + sumGradesHistory + sumGradesLanguage)/3));


  }
}
