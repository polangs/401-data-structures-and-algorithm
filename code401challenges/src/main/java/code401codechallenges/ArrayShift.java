package code401codechallenges;

public class ArrayShift {


  //main method  - for the code to be able to run
  public static void main(String[] args) {
    insertShiftArray(new int[]{2, 4, 6, 8}, 0);
  }

  public static int[] insertShiftArray(int[] arrInput, int insNum) {
    int position = 0;
    int newArray[] = new int[arrInput.length + 1];
    int middleIndex = newArray.length / 2;


    
    for (int j = 0; j < newArray.length; j++) {
      if (j == middleIndex) {
        newArray[j] = insNum;
      } else {
        newArray[j] = arrInput[position];
        position++;
      }
    }
    return newArray;
  }
}
