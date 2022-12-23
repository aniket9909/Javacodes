package Array;

public class Concatenation {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 1 };
    for (int i : getConcatenation(nums)) {
      System.out.print(i + " ");
    }

  }

  public static int[] getConcatenation(int[] nums) {
    int length1 = nums.length * 2;
    int[] arr = new int[length1];
    int count = 0;
    for (int i = 0; i < length1; i++) {
      arr[i] = nums[count++];
      if (count == nums.length) {
        count = 0;
      }
    }
    return arr;
  }
}
