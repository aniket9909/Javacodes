// Write a program to enter the 5 values in ascending order and store in array and find out the
// missing element from array?

public class FindMissingElement {
  public static void main(String[] args) {
    int[] arr = { 1, 5, 9, 13, 17 };
    int count = 0;
    for (int i = 1; i < arr[arr.length - 1]; i++) {
      if (i == arr[count]) {
        count++;
        continue;
      } else {
        System.out.print(i + " ");
      }
    }
  }
}
