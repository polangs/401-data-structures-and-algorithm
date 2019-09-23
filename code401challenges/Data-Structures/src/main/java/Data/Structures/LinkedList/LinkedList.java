package Data.Structures.LinkedList;


import org.w3c.dom.Node;

public class LinkedList {
  public Node head;

  public LinkedList() {

  }
//i Had help from quang
//define a method called insert which takes any value as an argument and adds
//a new node with that value to the head of the list with an O(1) Time performance

  public void insert(int value) {
    Node oldNode = head;
    head = new Node(value);
    head.next = oldNode;
  }


//Define a method called includes which takes any value as an argument and returns a boolean
//result depending on whether that value exists as a Node's value somewhere within the list

  public boolean includes(int value) {
    Node currentNode = head;
    while (currentNode != null) {
      if (currentNode.value == value) {
        return true;
      }
      currentNode = currentNode.next;
    }
    return false;
  }


//define a method toString which takes in no arguments and returns a string representing
//all the values in the linked list

//public String toString

}