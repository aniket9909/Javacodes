package Array;

public class BuildArrayPermutation {
  public static void main(String[] args) {
    int[] arr = { 5, 0, 1, 2, 3, 4 };
    for (int i : builtArray(arr)) {
      System.out.println(i);
    }
  }

  private static int[] builtArray(int[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = arr[arr[i]];
    }
    return result;
  }
}
