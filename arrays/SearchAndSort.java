public class SearchAndSort {

  public static void initializeArray(int[] list) {
    for (int index = 0; index < list.length; index++) {
      list[index] = (int) (Math.random() * 1000);
    }
  }

  public static void printArray(int[] list) {
    for (int index = 0; index < list.length; index++) {
      System.out.println(list[index]);
    }
  }

  public static int findItem(int n, int[] list) {
    int index = 0;
    for (; index < list.length && list[index] != n; index++);

    return index == list.length ? -1 : index;
  }

  public static void populateWithRandomNumbers(int[] list) {
    for (int index = 0; index < list.length; index++) {
      list[index] = (int) (Math.random() * 500);
    }
  }

  public static void swap(int[] list, int i, int j) {
    int temp = list[i];
    list[i] = list[j];
    list[j] = temp;
  }

  public static int findLargestItem(int[] list, int end) {
    int maxIndex = 0;

    for (int index = 1; index <= end; index++) {
      if (list[index] > list[maxIndex]) {
        maxIndex = index;
      }
    }

    return maxIndex;
  }

  public static void selectionSort(int[] list) {
    for(int i = list.length - 1; i >= 1; i--) {
      int k = findLargestItem(list, i);
      swap(list, k, i);
    }
  }

  public static void bubbleSort(int[] list) {
    for(int limit = list.length - 1; limit >= 1; limit--) {
      for(int i = 0; i < limit; i++) {
        if(list[i] > list[i + 1]) swap(list, i, i + 1);
      }
    }
  }

  public static void main(String[] args) {
    int[] numbers = new int[10];
    populateWithRandomNumbers(numbers);
    //printArray(numbers);
    System.out.println();
    bubbleSort(numbers);
    printArray(numbers);
  }
}
