import java.util.Random;

public class ClaseMathRandomEjemplo {
  public static void main(String[] args) {
    //"Math.random();" regresa un valor entre 0 y 1, sin llegar al 1
    double random = Math.random();
    String[] colors = { "azul", "amarillo", "verde", "rojo", "blanco", "negro" };
    System.out.println("random = " + random);
    
    random *= colors.length; //random = random * n;
    System.out.println("random = " + random);

    random = Math.floor( random );
    System.out.println("random con piso = " + random);

    System.out.println("colors[(int) random] = " + colors[(int) random]);

    //Clase Random, es mucho mas flexible
    Random randomObj = new Random();
    //Puedo pasarle o no argumento, si le paso argumento, el numero que le paso no se incluye (0-n)
    int randomInt = 15 + randomObj.nextInt( 25 - 15 + 1 );
    System.out.println("randomInt = " + randomInt);

    randomInt = randomObj.nextInt( colors.length );
    System.out.println("randomInt = " + randomInt);
    System.out.println("colors = " + colors[randomInt]);
    
    
  }
}
