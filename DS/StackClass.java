package DS;

import java.util.ArrayList;
import java.util.Stack;

public class StackClass {
  // static class stack {
  // static ArrayList<Integer> s = new ArrayList<>();

  // public static boolean isEmpty() {
  // return s.size() == 0;
  // }

  // public static void push(int data) {
  // s.add(data);
  // }

  // public static int pop(int data) {
  // if (isEmpty()) {
  // return -1;
  // }
  // int top = s.get(s.size() - 1);
  // s.remove(top);
  // return s.get(top);
  // }

  // public static int peek() {
  // if (isEmpty()) {
  // return -1;
  // }
  // return s.get(s.size() - 1);

  // }
  // }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();

    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
  }
}
