import java.util.*;

public class Peterson {
  static public boolean checkPeterson(int num) {
    int temp = num, ans = 0;
    while (temp > 0) {
      int rem = temp % 10;
      ans = ans + fact(rem);
      temp = temp / 10;
    }
    System.out.println("number is " + num);
    System.out.println("petrson number is " + ans);

    return ans == num;
  }

  public static int fact(int n) {
    if (n == 0)
      return 1;
    else
      return (n * fact(n - 1));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = sc.nextInt();
    System.out.println("Number is Peterson : " + checkPeterson(num));
  }
}
