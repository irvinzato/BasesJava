import javax.swing.*;

public class SistemasNumericosVentana {
    public static void main(String[] args) {
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog( null, "Ingrese un número entero" ));
        } catch( NumberFormatException e ){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            main( args );
            //Tambien funciona el return;
            System.exit(0 );
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " +Integer.toBinaryString(numeroDecimal));

        //Con "0b" para distinguir que sera un numero binario, octal y hexadecimal tambien usa operadores especiales
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String message = "numero binario de " + numeroDecimal + " = " +Integer.toBinaryString(numeroDecimal) + '\n';
        message += "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) + '\n';
        message += "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) + '\n';
        JOptionPane.showMessageDialog(null, message);
    }
}
