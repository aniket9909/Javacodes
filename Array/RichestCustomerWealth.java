package Array;

public class RichestCustomerWealth {
  public static void main(String[] args) {
    int[][] arr = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
    System.out.println(wealth(arr));
  }

  private static int wealth(int[][] accounts) {
    int preSum = 0, postSum = 0;
    for (int i = 0; i < accounts.length; i++) {
      preSum = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        preSum += accounts[i][j];
      }
      if (preSum > postSum) {
        postSum = preSum;
      }
    }
    return postSum;
  }
}
