public class StringPalindrom {
  public static void main(String[] args) {
    String str = "assa";
    String str2 = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      str2 = str2 + str.charAt(i);
    }
    System.out.println(str.length());
    System.out.println(str2.length());
    if (str.equals(str2)) {
      System.out.println("palindrome");
    } else {
      System.out.println("not palindrome");
    }
  }
}
