package DS;

public class StackExample {
  static int[] stack = new int[5];
  static int top = -1;

  public static boolean isEmpty() {
    return top == -1;
  }

  public static boolean isFull() {
    return top == stack.length - 1;
  }

  public static void push(int data) {
    if (isFull()) {
      System.out.println("Stack is full");
      return;
    }
    stack[++top] = data;
    System.out.println(stack[top]);
  }

  public static int pop() {
    if (isEmpty()) {
      System.out.println("Stack Is Empty !!");
      return -1;
    }
    int data = stack[top];
    top--;
    return data;
  }

  public static int peek() {
    if (isEmpty()) {
      System.out.println("Stack Is Empty !!");
      return -1;
    }
    int data = stack[top];
    return data;
  }

  public static void main(String[] args) {
    StackExample s = new StackExample();
    s.push(10);
    s.push(11);
    s.push(12);
    System.out.println("------------------------");
    // System.out.println(peek());
    // pop();
    // System.out.println(peek());
    while (!isEmpty()) {
      System.out.println(peek());
      pop();
    }
  }
}
