public class MaxMinFromArray {
  public static void main(String[] args) {
    int[] arr = { -8, -10, -3, -45, -86, -2, -8, -31, -5 };
    checkNumber(arr);
  }

  private static void checkNumber(int[] arr) {
    int max = arr[0], min = arr[0];
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Maximum : " + max + " Minimum : " + min);
  }
}
