public class SwappingNumber {
  public static void main(String[] args) {
    int x = 50, y = 60;
    x = x + y;
    y = x - y;
    x = x - y;
    System.out.println("x" + x + " y " + y);
  }
}
