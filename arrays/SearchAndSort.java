public class SearchAndSort {

  public static void initializeArray(int[] list) {
    for (int index = 0; index < list.length; index++) {
      list[index] = (int) (Math.random() * 1000);
    }
  }

  public static void printArray(int[] list) {
    for (int index = 0; index < list.length; index++) {
      System.out.println("Idx " + index + ": " + list[index]);
    }
  }

  public static int findItem(int n, int[] list) {
    int index = 0;
    for (; index < list.length && list[index] != n; index++);

    return index == list.length ? -1 : index;
  }

  public static void populateWithRandomNumbers(int[] list) {
    for (int index = 0; index < list.length; index++) {
      list[index] = (int) (Math.random() * 100);
    }
  }

  public static void swap(int[] list, int i, int j) {
    int temp = list[i];
    list[i] = list[j];
    list[j] = temp;
  }

  public static void rotateList(int[] list, int m, int n) {
    int temp = list[n];

    for(int i = n - 1; i >= m; i--) {
      list[i + 1] = list[i];
    }   

    list[m] = temp;
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

  public static void insertionSort(int[] list) {
    for(int i = 1; i <= list.length -1; i++) {
      int j = 0;
      for(; j <= i - 1 && list[j] < list[i]; j++);
      if(list[j] > list[i]) {
        rotateList(list, j, i);
      }
    }
  }

  public static int binarySearch(int[] list, int key) {
    int start = 0;
    int end = list.length - 1;
    int idx = (start + end) / 2;

    while(start < idx && list[idx] != key && start < idx) {
      if(key > list[idx]) {
        start = idx + 1;
      } else {
        end = idx - 1;
      }

      idx = (start + end) / 2;
    }
    if(start > end) {
      return -1;
    } else {
      return idx;
    }
  }

  public static void main(String[] args) {
    int[] numbers = new int[100];
    populateWithRandomNumbers(numbers);
    //printArray(numbers);
    System.out.println();
    insertionSort(numbers);
    printArray(numbers);

    System.out.println("\nPos: " + binarySearch(numbers, 67));
  }
}
