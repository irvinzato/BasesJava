public class ArreglosOrdenPrincipioFinal {
  public static void main(String[] args) {
    int[] numbers = new int[10];
    int[] numbers2 = new int[10];

    for( int i = 0; i < numbers.length; i++ ) {
      numbers[i] = i + 1;
    }

    int aux = 0;
    for( int i = 0; i < numbers.length - i ; i++ ) {
      numbers2[aux++] = numbers[i];
      numbers2[aux++] = numbers[numbers.length-1-i];
      System.out.print(numbers[i] + " ");
      System.out.println(numbers[numbers.length-1-i]);
    }
    System.out.println("Segundo arreglo");
    for( int i = 0; i < numbers2.length; i++ ) {
      System.out.println(numbers2[i]);
    }


  }
}
