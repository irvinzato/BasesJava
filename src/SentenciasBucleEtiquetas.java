public class SentenciasBucleEtiquetas {
  public static void main(String[] args) {
    //Esta es la etiqueta del for "bucle1"
    bucle1: for( int i = 0; i < 5; i++ ) {
      for( int j = 0; j < 5; j++ ) {
        if( i == 2 ) {
          continue bucle1;
        }
        System.out.println("i = " + i + ", j = " + j);
      }
    }

    System.out.println();

    tag: for( int i = 0; i < 5; i++ ) {
      for( int j = 0; j < 5; j++ ) {
        if( i == 2 ) {
          break tag;
        }
        System.out.println("i = " + i + ", j = " + j);
      }
    }

    //EJEMPLO DE DIAS LABORALES
    tag2: for( int i = 1; i <= 7; i++ ) {
      int j = 1;
      while( j <= 8 ) { //8 Horas laborales
        if( i == 6 || i ==7 ) {
          System.out.println("Dia de descanso " + i);
          continue tag2;
        }
        System.out.println("Trabajando en dia " + i + " a las " + j + " hrs");
        j++;
      }
    }



  }
}
