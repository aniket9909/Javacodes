public class OnePlus {
  static public int[] plus(int[] arr) {

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] < 9) {
        arr[i]++;
        return arr;
      }
      arr[i] = 0;
    }
    arr[0]++;
    return arr;

    // long sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // sum = sum * 10 + arr[i];
    // }
    // sum = sum + 1;
    // // System.out.println(sum);
    // long num = sum;
    // String result = Long.toString(sum);
    // int size = result.length();
    // int[] arr1 = new int[size];
    // // System.out.println("size is " + arr1.length);
    // int count = size - 1;
    // // System.out.println(count);

    // while (num > 0) {
    // long rem = num % 10;
    // arr1[count] = (int) rem;
    // // System.out.println(arr1[count]);
    // num = num / 10;
    // count--;
    // // System.out.println("count is " + count);
    // }
    // // for (int i : arr1) {
    // // System.out.println(i);
    // // }
    // return arr1;
  }

  public static void main(String[] args) {
    // int[] arr = { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9,
    // 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1,
    // 7, 4, 0, 0, 6 };
    int[] arr = { 123 };
    for (int i : plus(arr)) {
      System.out.print(" " + i);
    }
    System.out.println();
  }
}