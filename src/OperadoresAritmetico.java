import javax.swing.*;

public class OperadoresAritmetico {
  public static void main(String[] args) {
    //Cuando son del mismo tipo puedo definir asi
    int i = 5, j = 4, sum = i + j;

    System.out.println("sum = " + sum);

    //Sin los parentesis concatena como un string por el orden de derecha a izquierda
    System.out.println("i + j = " + (i + j));

    //Si no lo paso a float o double, dara resultado próximo, no exacto(Si se queda en int da 1)
    float div = (float) i / j;
    System.out.println("div = " + div);

    int rest = i % j;
    System.out.println("rest = " + rest);

    int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

    if( num % 2 == 0 ) {
      System.out.println("Numero par " + num);
    } else {
      System.out.println("Numero in par " + num);
    }


  }
}
