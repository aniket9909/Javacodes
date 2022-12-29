package Array;

import java.util.*;
// There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
// Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
// Note that multiple kids can have the greatest number of candies.

public class ExtraCandi {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 1, 3 };
    int extracandi = 3;
    for (boolean i : kidsWithCandies(arr, extracandi)) {
      System.out.println(i);
    }
  }

  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    boolean[] arr = new boolean[candies.length];
    int totalCandi = 0, greater = 0;
    for (int i = 0; i < candies.length; i++) {
      if (candies[i] > greater) {
        greater = candies[i];
      }
    }

    for (int i = 0; i < candies.length; i++) {
      totalCandi = extraCandies + candies[i];
      if (totalCandi >= greater) {
        arr[i] = true;
      } else {
        arr[i] = false;
      }
      totalCandi = 0;
    }
    List<Boolean> myList = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      myList.add(arr[i]);
    }
    return myList;
  }

}
