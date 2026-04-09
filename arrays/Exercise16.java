public class Exercise16 {
  public static void main(String[] args) {
    int array[] = { 1, 2, 3, 4, 6, 5, 7};

    int index = -1;

    for(int i = 1; i < 7; i++) {
      index = (array[i - 1] + 1 != array[i]) && (index == -1) ? i : index;
    }

    System.out.println("Index: " + index + "\nNumber: " + array[index]);
  }
}
