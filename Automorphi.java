import java.util.*;

public class Automorphi {
  static public boolean check(int num) {
    int square = num * num;
    int count = 0;
    while (num > 0 && count <= 2) {
      if (num % 10 != square % 10)
        return false;
      num = num / 10;
      square = square / 10;
      count++;
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    System.out.println("number is automorphi : " + check(num));
  }
}
