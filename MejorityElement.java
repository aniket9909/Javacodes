import java.util.*;

public class MejorityElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
    System.out.println(mejor(arr));
  }

  private static int mejor(int[] arr) {
    if (arr.length > 1) {
      int count = 0, length = 0, result = 0;
      for (int i = 0; i < arr.length - 1; i++) {
        for (int j = i + 1; j < arr.length; j++) {
          if (arr[i] == arr[j]) {
            count++;
          }
        }
        if (count > length) {
          length = count;
          result = arr[i];
          count = 0;
        } else {
          count = 0;
        }
      }
      return result;
    } else {
      return arr[0];
    }

  }
}
