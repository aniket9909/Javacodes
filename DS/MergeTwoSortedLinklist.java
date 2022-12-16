package DS;

import java.util.Iterator;
import java.util.LinkedList;

public class MergeTwoSortedLinklist {
  public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<Integer>();
    LinkedList<Integer> l2 = new LinkedList<Integer>();
    LinkedList<Integer> l3 = new LinkedList<Integer>();

    l1.add(1);
    l1.add(2);
    l1.add(3);
    l1.add(4);

    l2.add(1);
    l2.add(2);
    l2.add(3);
    l2.add(4);
    for (int i = 0; i < 4; i++) {
      l3.add(l1.indexOf(i));
    }
    System.out.println(l1);
    Iterator<Integer> i = l3.iterator();
    while (i.hasNext()) {
      System.out.println(i.next());
    }
  }
}
