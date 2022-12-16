package String;

import javax.naming.spi.DirStateFactory.Result;

public class LongestCommonprefix {
  static String commen(String[] strs) {
    String result = "";
    int length = 0, pos = 0, grt = 0;
    for (int i = 0; i < strs.length; i++) {
      if (strs[i].length() < strs[i + 1].length()) {
        length = strs[i].length();
        pos = i;
        grt = i + 1;
      } else {
        length = strs[i + 1].length();
        pos = i + 1;
        grt = i;
      }
      for (int j = 0; j < pos; j++) {
        for (int j2 = 0; j2 < strs[grt].length(); j2++) {
          if (strs[pos].charAt(j) == strs[i + 1].charAt(j2)) {
            result = result + strs[pos].charAt(j);
            continue;
          }
        }
      }

    }
    return result;
  }
  // public int length(String strs[]){
  // for (int i = 0; i < strs.length; i++) {

  // }
  // }
  public static void main(String[] args) {
    String strs[] = { "aniket", "tekewade" };
    System.out.println(commen(strs));
  }
}
