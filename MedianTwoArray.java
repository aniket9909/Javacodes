public class MedianTwoArray {
  static public double median(int[] arr1, int[] arr2) {
    double result = 0;
    int sum = 0;
    int sum2 = 0;
    for (int i = 0; i < arr1.length; i++) {
      sum = sum + arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
      sum2 = sum2 + arr2[i];
    }
    int length = (arr1.length + arr2.length);
    result = sum + sum2;
    return result / length;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 3 };
    int[] arr2 = { 2, 7 };
    System.out.println(median(arr1, arr2));
  }
}
