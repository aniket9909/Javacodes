package Numbers;

import java.util.Scanner;

public class HappyNumber {
  public static int hNumber(int num) {
    int rem = 0, sum = 0;
    while (num > 0) {
      rem = num % 10;
      sum = sum + (rem * rem);
      num = num / 10;
    }
    if (sum == 1) {
      return sum;
    } else {
      System.out.println(sum);
      return hNumber(sum);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number : ");
    int num = sc.nextInt();
    System.out.println(hNumber(num));
    if (hNumber(num) == 1) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
