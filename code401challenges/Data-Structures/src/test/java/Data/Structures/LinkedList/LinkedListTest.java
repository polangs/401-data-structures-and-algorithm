package Data.Structures.LinkedList;

import org.junit.Test;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class LinkedListTest {

  //linked list
  @Test
  public void testCreateEmptyLinkedList(){
   LinkedList test = new LinkedListTest();
     assertNull("Empty Linked List",
             test.head);
  }

}
