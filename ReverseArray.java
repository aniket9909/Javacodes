
public class ReverseArray {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50 };
    int[] arr2 = new int[arr.length];
    String atr = "aniket";
    StringBuffer str = new StringBuffer(atr);
    str.reverse();
    System.out.println(str);
    // int temp = 0;
    // for (int i = arr.length - 1; i >= 0; i--) {
    // arr2[temp++] = arr[i];
    // }
    // arr2.append(arr);
    for (int i : arr) {
      System.out.println(i);
    }
  }
}
