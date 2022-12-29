package String;

// A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
// You are given an array of strings sentences, where each sentences[i] represents a single sentence.
// Return the maximum number of words that appear in a single sentence.
class MostWord {
  public static void main(String[] args) {
    String[] arr = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
    System.out.println(mostWordsFound(arr));
  }

  public static int mostWordsFound(String[] sentences) {
    int first = 1, second = 0;
    for (int i = 0; i < sentences.length; i++) {
      for (int j = 0; j < sentences[i].length(); j++) {
        if (sentences[i].charAt(j) == ' ') {
          first++;
        }
      }
      if (first > second) {
        second = first;
      }
      first = 1;
    }
    return second;
  }
}