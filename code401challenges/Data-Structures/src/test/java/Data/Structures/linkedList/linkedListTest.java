package Data.Structures.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class linkedListTest {

  //linked list
  @Test
  public void testCreateEmptyLinkedList(){
   linkedList test = new linkedListTest();
     assertNull("Empty Linked List",
             test.head);
  }

}
