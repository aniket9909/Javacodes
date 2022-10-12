// public class ArmstrongNumber {
//   public static void main(String[] args) {
//     int num1 = 153, sum = 0;
//     int num = num1;
//     while (num > 0) {
//       int rem = num % 10;
//       sum = sum + rem * rem * rem;
//       num = num / 10;
//     }
//     System.out.println(sum);
//     if (num1 == sum) {
//       System.out.println("armstrong");
//     } else {
//       System.out.println("not armstrong");
//     }
//   }
// }

// usong recursion

/**
 * ArmstrongNumber
 */
public class ArmstrongNumber {
  static int sum = 0, num1 = 123545, num = num1;

  static int arm(int count) {

    if (count > 0) {
      int rem = num % 10;
      sum = sum + rem * rem * rem;
      num = num / 10;
      return arm(count - 1);
    } else {
      return sum;
    }
  }

  public static void main(String[] args) {
    int num1 = 153;
    int sum = arm(3);
    System.out.println(sum);
    if (num1 == sum) {
      System.out.println("armstrong");
    } else {
      System.out.println("not armstrong");
    }
  }
}