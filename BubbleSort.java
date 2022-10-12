public class BubbleSort {
  public static void main(String[] args) {
    int arr[] = { 8, 5, 2, 4, 9, 3, 12, 58, 66, 45, 32, 69, 87, 54, 12, 36, 98, 78, 45, 12, 563, 56, 2, 5662, 5, 8 };
    for (int j = 0; j < arr.length - 1; j++) {
      for (int i = 0; i < arr.length - 1 - j; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }

    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
