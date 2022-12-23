package Array;

// 9) Write a program in C to find two elements whose sum is closest to zero
public class ZeroSum {
  public static void main(String[] args) {
    int[] arr = { 38, 44, 63, -51, -35, 19, 84, -69, 4, -46 };
    int temp = Integer.MIN_VALUE, add = Integer.MIN_VALUE, first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        temp = arr[i] + arr[j];
        if (temp > add && temp < 0) {
          first = arr[i];
          second = arr[j];
          add = temp;
        }
      }
    }
    System.out.println(first + " + " + second);
  }
}
