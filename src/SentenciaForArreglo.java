import javax.swing.*;

public class SentenciaForArreglo {
  public static void main(String[] args) {
    String[] names = { "Irving", "Angeles", "Jade", "Jesus", "Almendra", "Laura", "Emiliano", "Camila" };

    for( int i = 0; i < names.length; i++ ) {
      //También pudiera usar "contains" pero trasformando a minúsculas o mayúsculas
      if( names[i].equalsIgnoreCase("irving") || names[i].equalsIgnoreCase("angeles") ) {
        continue; //Es decir se salta la iteración actual y sigue con la siguiente iteración
      }
      System.out.println( i + ".-" + names[i] );
    }

    String search = JOptionPane.showInputDialog("Ingrese un nombre");
    System.out.println("search = " + search);

    boolean found = false;

    for( int i = 0; i < names.length; i++ ) {
      if( names[i].equalsIgnoreCase( search ) ) {
        found = true;
        break;
      }
    }

    if( found ) {
      JOptionPane.showMessageDialog( null, "Se encontró " + search );
    } else {
      JOptionPane.showMessageDialog( null, "Se encontró " + search );
    }


  }
}
