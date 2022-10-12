import java.util.Stack;

// public class ValidParenthesis {
//   public static void main(String[] args) {
//     String s = "()[{]";
//     boolean ans = false;
//     for (int i = 0; i < s.length(); i++) {
//       for (int k = 1; k < s.length(); k++) {
//         if (s.charAt(i) == '(' && s.charAt(k) == ')') {
//           ans = true;
//         } else if (s.charAt(i) == '[' && s.charAt(k) == ']') {
//           ans = true;
//         } else if (s.charAt(i) == '{' && s.charAt(k) == '}') {
//           ans = true;
//         }else if ()) {

//         }
//       }

//     }
//     System.out.println(ans);
//   }
// }

/**
 * ValidParenthesis
 */
public class ValidParenthesis {

  public static Boolean compare(String s) {
    if (s.length() % 2 != 0)
      return false;
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        st.push(s.charAt(i));
      } else if (s.charAt(i) == ')' && st.peek() == '(') {
        st.pop();
      } else if (s.charAt(i) == '}' && st.peek() == '{') {
        st.pop();
      } else if (s.charAt(i) == ']' && st.peek() == '[') {
        st.pop();
      } else {
        return false;
      }
    }
    return st.isEmpty();
  }

  public static void main(String[] args) {
    String s = "([}}])";
    System.out.println(compare(s));
  }
}