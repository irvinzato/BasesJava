public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        //De esta manera se crea como una instancia
        boolean datoLogico2 = Boolean.TRUE;

        double d = 98765.43e-3; //98.765
        float f = 1.2345e2f;    //123.45

        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);

        boolean isSame = (3-2 == 1);
        System.out.println("isSame = " + isSame);
    }
}
