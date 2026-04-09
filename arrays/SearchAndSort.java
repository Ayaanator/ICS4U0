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
      list[index] = (int) (Math.random() * 500000000);
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

  public static void main(String[] args) {
    int[] numbers = new int[1000000];
    populateWithRandomNumbers(numbers);
    //printArray(numbers);
    swap(numbers, 4, 11);
    System.out.println();
    selectionSort(numbers);
    printArray(numbers);
  }
}
