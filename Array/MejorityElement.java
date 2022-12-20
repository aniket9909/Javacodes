package Array;

// Write a program  to find the majority element of an array ?
import java.util.*;

public class MejorityElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 12, 4, 3, 6, 87, 54, 21, 54, 87, 9, 4, 3, 4, 6, 97, 5, 13, 1, 6, 97, 4, 6, 31, 64, 97, 97, 964, 31, 3,
        164, 97, 97, 6, 13, 1, 64, 97, 7, 94, 1, 3, 16, 79, 79 };
    System.out.println("Most Repeted Number = " + getCountArr(arr));
    majorElement(arr);
  }

  public static int getCountArr(int[] array) {
    int count = 0, temp = 0, position = 0;
    if (array.length > 1) {
      for (int i = 0; i < array.length; i++) {
        count = 0;
        for (int j = i; j < array.length; j++) {
          if (array[i] == array[j]) {
            count++;
          }
        }
        if (temp < count) {
          position = array[i];
          temp = count;
        }
      }
      return position;
    } else {
      return array[0];
    }
  }

  // A majority element in an array A[] of size n is an element that appears more
  // than n/2 times (and
  // hence there is at most one such element).
  public static void majorElement(int[] arr) {
    int count = 0, temp = 0, element = 0;
    for (int i = 0; i < arr.length; i++) {
      count = 0;
      for (int j = i + 1; j < arr.length; j++) {

        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (temp < count) {
        temp = count;
        element = arr[i];
      }
    }
    System.out.println(element);
  }

}
