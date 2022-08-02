public class PrimitivosCaracteres {
    public static void main(String[] args) {
        //Equivalencias en chars
        char caracter = '\u0040'; //Mapa de caracteres
        char caracter2 = 'I';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';

        System.out.println("Tipo char corresponde en byte a" + espacio + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a" + retroceso + Character.SIZE);
        System.out.println("Tipo char su valor maximo es" + tabulador + Character.MAX_VALUE);
        System.out.println("Tipo char su valor menor es" + nuevaLinea + Character.MIN_VALUE);
    }
}
