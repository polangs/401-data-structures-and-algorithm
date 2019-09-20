package code401codechallenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class testBinarySearch {
  @Test
  public void testBinarySearch()
  {
    int[] newArray = new int[]{4, 8, 15, 16, 23, 42};
    int expected = 2;
    assertEquals("resulting binary should be 2 or -1",
            expected,
            BinarySearch.binarySearch(newArray, 15));
  };
}

///adding comment to make sure test is included 
