public class AutoboxingInteger {
  public static void main(String[] args) {
    Integer[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
    int sum = 0;

    for( Integer num: nums) {
      if( num % 2 == 0 ) {
        sum += num;  //num.intValue() es para sumar su valor primitivo, también funciona sin él
        System.out.println(num);
      }
    }

    System.out.println("suma = " + sum);


  }
}
