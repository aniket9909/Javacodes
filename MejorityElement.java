import java.util.*;

public class MejorityElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 45, 58, 45, 78, 78, 78, 78, 78, 54, 54, 54, 56, 56, 59, 59, 95, 45, 48, 48, 48, 56, 52, 52, 2, 6, 3,
        5, 2, 6, 252, 6, 3, 56, 48, 48, 48 };
    System.out.println("Most Repeted Number = " + getCountArr(arr));
    // System.out.println(major(arr));
  }

  // private static int major(int[] arr) {
  // if (arr.length > 1) {
  // int count = 0, length = 0, result = 0;
  // for (int i = 0; i < arr.length - 1; i++) {
  // for (int j = i + 1; j < arr.length; j++) {
  // if (arr[i] == arr[j]) {
  // count++;
  // }
  // }
  // if (count > length) {
  // length = count;
  // result = arr[i];

  // }
  // count = 0;
  // }
  // return result;
  // } else {
  // return arr[0];
  // }

  // }

  public static int getCountArr(int[] array) {
    int count = 0, temp = 0, position = 0;
    if (array.length > 1) {
      for (int i = 0; i < array.length; i++) {
        count = 0;
        for (int j = i; j < array.length; j++) {
          if (array[i] == array[j]) {
            count++;
          }
        }

        if (temp < count) {
          position = array[i];
          temp = count;
        }
      }
      return position;
    } else {
      return array[0];
    }

  }
}
