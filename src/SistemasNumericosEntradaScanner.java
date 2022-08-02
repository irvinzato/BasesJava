import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Ingrese un número entero: ");
        int numeroDecimal = 0;
        try {
            //numeroDecimal = Integer.parseInt( scanner.nextLine() );
            //Otra opción para no hacer él parseo, solo se maneja otra excepción
            numeroDecimal = scanner.nextInt();
        } catch( InputMismatchException e ){
            System.out.println("Error, debe ingresar un número entero");
            main( args );
            //Tambien funciona el return;
            System.exit(0 );
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String message = "numero binario de " + numeroDecimal + " = " +Integer.toBinaryString(numeroDecimal) + '\n';
        message += "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) + '\n';
        message += "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) + '\n';
        System.out.println( message );
    }
}
