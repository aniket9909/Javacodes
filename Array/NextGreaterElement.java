package Array;

// Write a program in C to to print next greater elements in a given unsorted array. Elements for
// which no greater element exist, consider next greater element as -1.
public class NextGreaterElement {
  public static void main(String[] args) {
    int[] nums1 = { 1, 3, 5, 2, 4 };
    int[] nums2 = { 6, 5, 4, 3, 2, 1, 7 };
    for (int i : nextGreater(nums1, nums2)) {
      System.out.println(i + ",");
    }
  }

  private static int[] nextGreater(int[] nums1, int[] nums2) {
    for (int i = 0; i < nums1.length; i++) {
      for (int j = nums2.length - 1; j >= 0; j--) {
        if (nums1[i] == nums2[nums2.length - 1]) {
          nums1[i] = -1;
        } else if (nums1[i] == nums2[j]) {
          if (nums2[j + 1] > nums1[i]) {
            nums1[i] = nums2[j + 1];
            break;
          } else {
            nums1[i] = -1;
            break;
          }
        }
      }
    }
    return nums1;
  }
}
