package my.java.ds.linkedlist.single;

public class SinglyLinkedList {

  private Node first = null;

  public void addAtBeginning(int value) {
    System.out.println("Inserting: " + value + " at the begining.");
    Node newNode = new Node(value);
    newNode.setNext(first);
    first = newNode;
  }

  public void addAtEnd(int value) {
    System.out.println("Inserting: " + value + " at the end.");
    if (first == null) {
      addAtBeginning(value);
      return;
    }
    Node newNode = new Node(value);
    Node current = first;
    while (current.getNext() != null) {
      current = current.getNext();
    }
    newNode.setNext(current.getNext());
    current.setNext(newNode);
  }

  public void addAt(int value, int position) {
    System.out.println("Inserting: " + value + " at position: " + position);
    if (position <= 1) {
      addAtBeginning(value);
      return;
    }
    Node newNode = new Node(value);
    Node current = first;
    int count = 1;
    while (current.getNext() != null) {
      // count + 1 because, by the time you reach the specified position current would have
      // moved ahead of the position and you'll only be able add after the position, not "at the
      // position"
      // at least not without creating a new pointer which just moves behind the current pointer.
      if (count + 1 >= position) {
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        return;
      }
      count++;
      current = current.getNext();
    }
    // Add at the end if position is greater than the list size
    newNode.setNext(current.getNext());
    current.setNext(newNode);
  }

  public void deleteAtBeginning() {
    System.out.println("Deleting at the begining.");
    // No element in the list
    if (first == null) {
      System.out.println("The list is empty.");
      return;
    }
    // Only one element in the list
    if (first.getNext() == null) {
      first = null;
      return;
    }
    Node temp = first;
    first = first.getNext();
    temp = null;
  }

  public void deleteAtEnd() {
    System.out.println("Deleting at the end.");
    // No element in the list
    if (first == null) {
      System.out.println("The list is empty.");
      return;
    }
    // Only one element in the list
    if (first.getNext() == null) {
      first = null;
      return;
    }
    Node current = first;
    Node temp = first;
    while (current.getNext() != null) {
      temp = current;
      current = current.getNext();
    }
    temp.setNext(null);
    current = null;
  }

  public void deleteAtPosition(int position) {
    System.out.println("Deleting the node at position: " + position);
    if (position <= 1) {
      deleteAtBeginning();
      return;
    }
    Node current = first;
    Node temp = first;
    int count = 1;
    while (current.getNext() != null) {
      if (count == position) {
        temp.setNext(current.getNext());
        current = null;
        return;
      }
      count++;
      temp = current;
      current = current.getNext();
    }
    // Delete at the end if position is greater than the list size
    deleteAtEnd();
  }

  public void display() {
    if (first == null) {
      System.out.println("The list is empty.");
      return;
    }
    Node current = first;
    while (current != null) {
      System.out.print(current);
      current = current.getNext();
    }
    System.out.println();
  }
}
