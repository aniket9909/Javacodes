package Array;

public class AddTwoArray {
  public static int[] addarrayelement(int[] arr1, int arr2[]) {
    int num1 = 0, num2 = 0;
    for (int i = arr1.length - 1; i >= 0; i--) {
      num1 = num1 * 10 + arr1[i];
    }
    for (int i = arr2.length - 1; i >= 0; i--) {
      num2 = num2 * 10 + arr2[i];
    }
    int sum = num1 + num2;
    String ans = String.valueOf(sum);
    int count = 0;
    while (sum > 0) {
      int rem = sum % 10;
      arr2[count] = rem;
      sum = sum / 10;
      count++;
    }
    return arr2;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3 };
    int[] arr2 = { 1, 2, 3 };
    for (int i : addarrayelement(arr1, arr2)) {
      System.out.println(i);
    }

  }
}
