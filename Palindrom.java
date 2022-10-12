// public class Palindrom {
//   public static void main(String[] args) {
//     int num = 121;
//     int num1 = num;
//     int rem = 0, rev = 0;
//     while (num > 0) {
//       rem = num % 10;
//       rev = rev * 10 + rem;
//       num = num / 10;
//     }
//     System.out.println(rev);
//     if (num1 == rev) {
//       System.out.println("numbr is palindrom");
//     } else {
//       System.out.println("not palindrom");
//     }
//   }
// }

public class Palindrom {
  public static void main(String[] args) {
    String str = "aniket";
    String str1 = str;
    String revrse = "";
    int length = str.length();
    for (int i = length - 1; i >= 0; i--) {
      revrse = revrse + str.charAt(i);
    }
    System.out.println(revrse);
    System.out.println(str1);
    if (revrse.equals(str1)) {
      System.out.println("is palindrom");
    } else {
      System.out.println("not palindrom");
    }
  }
}
