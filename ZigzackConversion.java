
public class ZigzackConversion {
  public static void conversion(String str, int row) {
    int count = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(str.charAt(count));
        count++;
      }

      System.out.println();
    }
  }

  public static void main(String[] args) {
    String str = "PAYPALISHIRING";
    int row = 3;
    conversion(str, row);
  }
}

/**
 * ZigzackConversion
 */
// public class ZigzackConversion {

// public static void main(String[] args) {
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 5; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }