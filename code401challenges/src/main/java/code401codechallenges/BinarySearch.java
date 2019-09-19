package code401codechallenges;

import code401codechallenges.Library;


public class BinarySearch{


  //main method for running code
  public static int binarySearch( int[] array, int key) {
    //declaring as a starting point of the array
    int lowerClass = 0;
    //declaring as the endpoint of the array
    int upperClass = array.length - 1;

    while (lowerClass <= upperClass) {
      //this line of code should compute for the my middle class to identify the middle of
      // the array and have it divided by 2
      int middle = (lowerClass + upperClass) / 2;
      //if the middle of the array is equals to key then i want what is the middle
      if (array[middle] == key)
      return middle;
      //if my key is greater than middle then add 1 to
    else if (key > middle)
      lowerClass = middle + 1;
    else
      upperClass = middle - 1;
  }
  return - 1;

  }
}
