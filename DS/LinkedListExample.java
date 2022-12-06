package DS;

import java.util.*;

public class LinkedListExample {
  static Node head = null;
  static Node tail = null;

  static int l = 0;

  static class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
      this.next = null;
    }
  }

  static public boolean isEmpty() {
    return head == null;
  }

  public static void add(int value) {
    Node newNode = new Node(value);
    if (isEmpty()) {
      head = newNode;
      tail = newNode;

      l++;
      return;
    }
    tail.next = newNode;
    tail = newNode;
    l++;
  }

  public static void inertAt(int position, int value) {
    Node temp = head;
    Node newNode = new Node(value);
    if (position == 1) {
      newNode.next = temp;
      head = newNode;
      l++;
    } else if (position == l + 1) {
      tail.next = newNode;
      tail = newNode;
      l++;
    } else if (position < 1 || position > l + 1) {
      System.out.println(" Invalid position !!");
    } else {
      while (--position > 1) {
        temp = temp.next;
      }
      newNode.next = temp.next;
      temp.next = newNode;
      l++;
    }
  }

  public static int remove() {
    if (isEmpty()) {
      return -1;
    }
    int temp = head.value;
    head = head.next;
    l--;
    return temp;
  }

  public static int peek() {
    if (isEmpty()) {
      return -1;
    }
    return head.value;
  }

  public static void printAll() {
    Node temp = head;
    temp = head;
    int length = l;
    while (length-- >= 1) {
      System.out.println(temp.value);
      temp = temp.next;
    }

  }

  public static void main(String[] args) {
    LinkedListExample l = new LinkedListExample();
    l.add(10);
    l.add(11);
    l.add(13);
    l.add(14);
    l.add(16);
    l.inertAt(1, 9);
    l.inertAt(8, 8);

    // l.inertAt(1, 17);
    System.out.println("------------");
    printAll();
    System.out.println("------------");

    System.out.println(l.l);

  }
}