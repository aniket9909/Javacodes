package DS;

public class NewLL {
  public static void main(String[] args) {
    LinkedListExample l1 = new LinkedListExample();
    l1.add(10);
    l1.add(10);
    l1.add(10);
    l1.inertAt(1, 9);
    l1.inertAt(6, 11);
    l1.printAll();
  }
}
