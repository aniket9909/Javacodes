package String;

public class StringVowelConsonant {
  public static void main(String[] args) {
    String str = "aeiuoeaoia";
    int vowel = 0;
    int canso = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
          || str.charAt(i) == 'u') {
        vowel++;
      } else {
        canso++;
      }
    }
    System.out.println("total vowel is : " + vowel);
    System.out.println("total cansonant is : " + canso);

  }
}
