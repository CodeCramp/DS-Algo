package my.java.ds.linkedlist.single;

/**
 * Represents the Node for Singly linked list.
 */
public class Node {

  private int data;
  private Node next;

  public Node(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  @Override
  public String toString() {
    String appender = " --> ";
    if (next == null) {
      appender = " --> NULL";
    }
    return data + appender;
  }
}
