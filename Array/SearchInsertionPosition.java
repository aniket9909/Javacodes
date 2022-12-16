package Array;

public class SearchInsertionPosition {
  public static void main(String[] args) {
    int[] arr = { 1 };
    int target = 0;
    System.out.println(search(arr, target));
  }

  private static int search(int[] arr, int target) {
    if ((arr.length == 1) && (arr[0] < target)) {
      return 1;
    } else {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < target && arr[i + 1] > target) {
          return i + 1;
        } else if (arr[i] == target || target < arr[0]) {
          return i;
        } else if (arr[arr.length - 1] < target) {
          return arr.length;
        }
      }
    }

    return 0;
  }
}
