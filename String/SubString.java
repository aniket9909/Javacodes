package String;
// public class SubString {

//   static String getSubStr(String str) {
//     String substr = "";
//     for (int i = 0; i < str.length(); i++) {
//       for (int j = i + 1; j < str.length(); j++) {
//         if (str.charAt(i) == str.charAt(j)) {
//           substr = substr + str.charAt(i);
//         }
//       }
//     }
//     return substr;
//   }

//   static String getResult(String str) {
//     String result = "";
//     for (int i = 0; i < str.length(); i++) {
//       for (int j = i + 1; j < str.length(); j++) {
//         if (str.charAt(i) == str.charAt(j)) {
//           result = result + str.charAt(i);
//         }
//       }
//     }
//     return str;
//   }

//   public static void main(String[] args) {
//     String str = "abcabc";

//     System.out.println(getSubStr(str));
//     System.out.println(getSubStr(str).length());

//   }
// }

/**
 * SubString
 */
public class SubString {

  public static void main(String[] args) {
    String str = "abab";
    String result = "";
    int count = 0;
    result = result + str.charAt(0);
    for (int i = 1; i < str.length(); i++) {
      for (int j = 0; j < result.length(); j++) {
        System.out.println("compare of " + str.charAt(i) + " " + result.charAt(j));
        if (str.charAt(i) == result.charAt(j)) {
          count = 1;
          System.out.println("under");
          continue;
        } else {
          count = 0;
        }
        // System.out.println(count);
      }
      if (count == 0) {
        result = result + str.charAt(i);
        // System.out.println(result);
      }
    }
    System.out.println(result);
  }
}