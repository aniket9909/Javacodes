import java.util.*;

public class SunnyNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = sc.nextInt();
    System.out.println(check(num));
  }

  public static boolean check(int num) {
    num++;
    for (int i = 1; i < num; i++) {
      if (i * i == num) {
        return true;
      }
    }
    return false;
  }
}