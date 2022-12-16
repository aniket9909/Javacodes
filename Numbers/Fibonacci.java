package Numbers;
// public class Fibonacci {

//   public static void main(String[] args) {
//     int num = 20, num1 = 0, num2 = 1, sum = 0;
//     while (num > 0) {
//       System.out.print(num1 + " ");
//       sum = num1 + num2;
//       num1 = num2;
//       num2 = sum;
//       num--;
//     }
//   }
// }

//fibonacci with recursion

public class Fibonacci {
  static int num1 = 0, num2 = 1, sum = 0;

  static void fib(int count) {
    if (count > 0) {
      System.out.print(num1 + " ");
      sum = num1 + num2;
      num1 = num2;
      num2 = sum;
      count--;
      fib(count--);
    }
  }

  public static void main(String[] args) {
    // Fibonacci f = new Fibonacci();
    int count = 25;
    fib(count);
  }
}

/**
 * Fibonacci
 * //
 */
// public class Fibonacci {
// // static int num=20;
// static void add(int num) {
// if (num > 0) {
// System.out.print(num + " ");
// add(num - 1);
// }

// }

// public static void main(String[] args) {
// int num = 20;
// while (num > 0) {
// System.out.print(num + " ");
// num--;
// }
// System.out.println("");
// // add(num);
// }
// }