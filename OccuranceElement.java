public class OccuranceElement {
  public static void allElementOaccurance(int[] arr) {
    int times = 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j] && arr[i] != -1) {
          times++;
          arr[j] = -1;
        }
      }
      if (arr[i] != -1) {
        System.out.println(arr[i] + "----" + times);
        times = 1;
      }

    }
    // Time complexity is O(n^2)
    // Space Complexity is constant O(1)
  }

  public static void main(String[] args) {
    int[] arr = { 5, 7, 7, 8, 8, 10 };
    int target = 3;
    // allElementOaccurance(arr);
    System.out.println(targetElementOccurance(arr, target));
  }

  private static int targetElementOccurance(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (target == arr[i]) {
        count++;
      }
    }
    if (count > 0) {
      return count;
    } else {
      return -1;

    }
  }
}
