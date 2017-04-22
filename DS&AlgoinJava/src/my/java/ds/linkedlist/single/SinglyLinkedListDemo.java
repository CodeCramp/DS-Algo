package my.java.ds.linkedlist.single;

public class SinglyLinkedListDemo {

  public static void main(String[] args) {
    SinglyLinkedList myList = new SinglyLinkedList();
    SinglyLinkedListDemo demo = new SinglyLinkedListDemo();
    demo.performBasicSLLOperations(myList);
  }
  
  public void performBasicSLLOperations(SinglyLinkedList myList) {
    myList.addAtEnd(10);
    myList.display();
    myList.addAtEnd(20);
    myList.display();
    myList.addAtEnd(40);
    myList.display();
    myList.addAtEnd(30);
    myList.display();
    myList.deleteAtPosition(3);
    myList.display();
    myList.deleteAtPosition(3);
    myList.display();
    myList.deleteAtPosition(3);
    myList.display();
  }
}

