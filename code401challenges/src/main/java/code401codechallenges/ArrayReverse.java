// package code401codechallenges;

import java.util.Arrays;

//update git ignore
public class ArrayReverse {

  //main method for running code
  public static void main(String[] args) {
    //input 
    int[] arrToReverse = new int[]{1,2,3,4,5,6};
    int[] reversedArray = reverseArray(arrToReverse);
    System.out.println(Arrays.toString(reversedArray));
  }

  //arrayReverse method
  public static int[] reverseArray(int[] arr) {
    //returns int[]
    // return arr;
  int[] array2 = new int[arr.length];
  int currentNumber = arr.length;
    // adding current number to new array
  for (int i = 0; i < arr.length; i++){
    //return the array less one until it hit the lowest number
    //using current length while decrementing it // research from geeksforgeeks.com https://www.geeksforgeeks.org/reverse-an-array-in-java/#targetText=The%20third%20method%20is%20to,and%20then%20reverse%20the%20list.
    array2[currentNumber - 1] = arr[i];
    currentNumber = currentNumber - 1;
  }
  //this should return reversed array from higest to lowest
  return array2;
  }
}

