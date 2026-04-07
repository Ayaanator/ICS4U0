public class List {

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
      list[index] = (int) (Math.random() * 1000);
    }
  }

  public static void swap(int[] list, int i, int j) {
    int temp = list[i];
    list[i] = list[j];
    list[j] = temp;
  }

  public static int findLargestItem(int[] list) {
    int maxIndex = 0;

    for (int index = 1; index < list.length; index++) {
      if (list[index] > list[maxIndex]) {
        maxIndex = index;
      }
    }

    return maxIndex;
  }

  public static void main(String[] args) {
    int[] numbers = new int[50];

    for (int index = 0; index < numbers.length; index++) {
      numbers[index] = 2 * index;
    }

    initializeArray(numbers);
    printArray(numbers);
    System.out.println(findItem(451, numbers));
  }
}
