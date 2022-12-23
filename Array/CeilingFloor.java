package Array;

// Given a sorted array in ascending order and a value x, the ceiling of x is the smallest element in array
// greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
public class CeilingFloor {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 7, 8, 9 };
    int number = 5;
    numberFloorAndCeilling(arr, number);
    floorAndCeilling(arr);
  }

  private static void floorAndCeilling(int[] arr) {
    for (int i = 0; i <= 10; i++) {
      for (int j = 1; j < arr.length; j++) {
        if (i == 0) {
          System.out.println("Number: " + i + " ceiling is: " + arr[i] + " floor is: -1");
          break;
        } else if (i <= arr[j]) {
          System.out.println("Number: " + i + " ceiling is: " + arr[j] + " floor is: " + arr[j - 1]);
          break;
        }
      }
    }
  }

  // Write a program in C to find the ceiling in a sorted array?
  private static void numberFloorAndCeilling(int[] arr, int number) {
    for (int i = 0; i < arr.length; i++) {
      if (number < arr[i]) {
        System.out.println("Ceilling of " + number + " is : " + arr[i]);
        System.out.println("Floor of " + number + " is : " + arr[i - 1]);

        break;
      }
    }
  }

}