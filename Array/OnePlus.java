package Array;

public class OnePlus {
  static public int[] plus(int[] arr) {

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] < 9) {
        arr[i]++;
        return arr;
      } else if (arr[i] == 9) {
        arr[i] = 0;
        arr[i - 1]++;
        return arr;
      }
    }
    arr[0]++;
    return arr;

  }

  public static void main(String[] args) {
    // int[] arr = { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9,
    // 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1,
    // 7, 4, 0, 0, 6 };
    int[] arr = { 9 };
    for (int i : plus(arr)) {
      System.out.print(" " + i);
    }
    System.out.println();
  }
}