public class SentenciasBucleEtiquetasBuscar {
  public static void main(String[] args) {
    String frase = "trigotrigo Tres tristes tigres tragan trigo en un trigal";
    String word = "trigo";
    char letter = 't';
    int amount = 0;

    for( int i=0; i < frase.length(); i++ ) {
      if( frase.toLowerCase().charAt( i ) != letter) {
        continue;
      }
      amount += 1;
    }

    System.out.println("Se encontraron " + amount + " veces el caracter " + letter + " en la frase");
    amount = 0;

    //Encuentro palabra en la frase
    tag: for( int i=0; i < frase.length();  ) {
      int k = i;
      for( int j=0; j < word.length(); j++ ) {
        if( frase.toLowerCase().charAt( k++ ) != word.charAt( j )) {
          i++;
          continue tag; //Si no coincide continua con la "i"
        }
      }
      amount += 1;
      i = i + word.length();
    }
    System.out.println("Se encontraron " + amount + " veces la palabra " + word + " en la frase");

  }
}
