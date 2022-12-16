package Sortings;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = { 12, 3, 5, 6, 9, 7, 4, 2, 8, 9, 6, 8, 5 };
    int min;
    for (int i = 0; i < arr.length; i++) {
      min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[min] > arr[j]) {
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
