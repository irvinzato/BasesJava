public class SentenciaFor {
  public static void main(String[] args) {
    for( int i = 0 ; i < 10 ; i++ ){
      System.out.println("i = " + i);
    }

    //Puede haber muchas variaciones en los datos que recibe el for pero no es común
    for( int i = 10 ; i < 20 ;  ){
      System.out.println("i = " + i);
      i++;
    }
    //Combinaciones raras
    for( int i = 1, j = 10; i < j; i++, j-- ) {
      System.out.println(i + " - " + j);
    }

    //"continue" se sale de la iteración, ejemplo que imprime impares
    for( int i = 0; i <= 10; i++ ) {
      if( i % 2 == 0 ) {
        continue;
      }
      System.out.println("i = " + i);
    }

  }
}
