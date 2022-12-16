package Array;

//WAP to insert the element on specified position in array
import java.util.Scanner;

public class InsertElement {
  public static void main(String[] args) {

    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int index = 4, value = 100;
    for (int i : insert(arr, index, value)) {
      System.out.println(i);
    }
    sc.close();
  }

  private static int[] insert(int[] arr, int index, int value) {

    for (int i = arr.length - 1; i > index; i--) {
      int temp = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = temp;
    }
    arr[index] = value;

    return arr;
  }
}
