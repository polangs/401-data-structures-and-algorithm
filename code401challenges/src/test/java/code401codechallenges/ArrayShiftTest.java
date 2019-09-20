package code401codechallenges;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class ArrayShiftTest {
  @Test
  public void testInsertArrayShiftEven() {
    int[] newArray = new int[]{2, 4, 8, 6, 8};
    assertArrayEquals(
            "the resulting array should be [2, 4, 8, 6, 8]",
            newArray,
            ArrayShift.insertShiftArray(new int[]{2, 4, 6, 8}, 8));
  }

    @Test
    public void testInsertArrayShiftOdd() {
      int[] newArray = new int[]{1, 5, 8, 7};
      assertArrayEquals(
            "the resulting array should be [1, 5, 8, 7]",
            newArray,
            ArrayShift.insertShiftArray(new int[]{1, 5, 7}, 8));
  }

}



