public class SingleNumber {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 1, 2, 5, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 3, 2, 23, 23 };
    System.out.println(singleNum(arr));
  }

  private static int singleNum(int[] arr) {
    int count = 1;
    for (int i = 0; i < arr.length; i++) {
      if (count == 1) {
        count = 0;
        for (int j = i + 1; j < arr.length; j++) {

          if (arr[i] == arr[j]) {
            count = 1;
            System.out.println("comparison : " + arr[i] + " - " + arr[j]);
            break;
          }
        }
      } else {
        return arr[i - 1];
      }
    }
    return 0;
  }

}
