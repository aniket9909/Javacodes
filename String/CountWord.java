package String;

import java.util.*;

public class CountWord {
  public static void main(String[] args) {
    String str = "abiket balao tekawde";
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "anikt");
    map.put(2, "anikt");
    map.put(3, "anikt");
    map.put(4, "anikt");
    // Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();

    // for (Map.Entry i : map.entrySet()) {
    // System.out.println(i.getKey() + " " + i.getValue());
    // }
    map.forEach((i, value) -> System.out.println(i + "=" + value));
  }

}
