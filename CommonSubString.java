public class CommonSubString {
  public static void main(String[] args) {
    String[] str = { "aniket", "andy", "anik" };
    // String[] str = { "eit", "yi", "anik", "dti" };

    String ans = "", fans = "-";
    for (int i = 0; i < str.length - 1; i++) {
      String str1 = str[i];
      String str2 = str[i + 1];
      for (int j = 0; j < str1.length(); j++) {
        for (int j2 = 0; j2 < str2.length(); j2++) {
          if (str1.charAt(j) == str2.charAt(j2)) {
            ans = ans + str1.charAt(j);
          }
        }
      }
    }
    for (int i = 0; i < ans.length(); i++) {
      for (int j = 1; j < ans.length(); j++) {
        if (ans.charAt(i) == ans.charAt(j)) {
          fans = fans + ans.charAt(i);
          i = j + 1;
        }
      }
    }
    System.out.println(ans);
    System.out.println(fans);

  }
}
