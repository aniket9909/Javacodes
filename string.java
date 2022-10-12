import javax.swing.SortingFocusTraversalPolicy;

// class string{
//   public static void main(String args[]){
//     String str="aniket";
//     boolean target=false;
//     for(int i =0;i<str.length();i++){
//       if(str.charAt(i) == 'e'){
//           target=true;
//       }
//     }
//     if(target==true){
//       System.out.println("character re present ");
//     }else{
//       System.out.println("character re present ");
//     }
//   }
// } 

// Write a program to check if the word 'orange' is present in the "This is orange juice".
// class string {
//   public static void main(String[] args) {
//     Boolean res = false;
//     String s1 = "geek";
//     String s2 = "geeks";
//     int m = s1.length();
//     int n = s2.length();
//     for (int i = 0; i < m - n; i++) {
//       for (int j = 0; j < m; j++) {
//         if (s2.charAt(i + j) != s1.charAt(j)) {
//           break;
//         }
//         if (j == m) {
//           System.out.println(i);
//         }
//       }
//       res = false;
//     }
//     if (res == false) {
//       System.out.println("not present");
//     } else {
//       System.out.println(" present");
//     }
//   }
// }

// class GFG {

//   // Returns true if s1 is substring of s2
//   static int isSubstring(String s1, String s2) {
//     int M = s1.length();
//     int N = s2.length();

//     /* A loop to slide pat[] one by one */
//     for (int i = 0; i <= N - M; i++) {
//       int j;

//       /*
//        * For current index i, check for
//        * pattern match
//        */
//       for (j = 0; j < M; j++)
//         if (s2.charAt(i + j) != s1.charAt(j))
//           break;

//       if (j == M)
//         return i;
//     }

//     return -1;
//   }

//   /* Driver code */
//   public static void main(String args[]) {
//     String s1 = "aniket";
//     String s2 = "geeaniketgeeks";

//     int res = isSubstring(s1, s2);

//     if (res == -1)
//       System.out.println("Not present");
//     else
//       System.out.println(
//           "Present at index "
//               + res);
//   }
// }

/**
 * string
 */
public class string {

  public static void main(String[] args) {
    String str = "aniket";
    String subStr = "ani";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      for (int j = 0; j < subStr.length(); j++) {
        if (str.charAt(i) == subStr.charAt(count)) {
          count++;
          break;
        }
      }
      if (count == str.length()) {
        System.out.println("true");
      }
    }

  }
}