public class PrecedenciaOperadores {
  public static void main(String[] args) {
    //Tabla de precedencia de operadores para saber que ocurre
    int i = 14, j = 8, k = 20;
    
    double average = (i + j + k) / 3d;
    System.out.println("average = " + average);

    average = i + j + k / 3d * 10;
    System.out.println("average = " + average);

    average = ++i + j-- + k / 3d * 10; //(15 + 8) + (20/6) * 10
    System.out.println("average = " + average);
    
  }
}
