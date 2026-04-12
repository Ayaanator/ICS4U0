
public class ExtraExercise3 {
  public static void transfer2to1(int[][] table, int[] list) {

  int index = 0;
  for (int i = 0; i < table.length; i++) {
    for (int j = 0; j < table[i].length; j++) {
      list[index] = table[i][j];
      index++;
    }
  }
}
  public static void main(String[] args) {

    int[][] table = {
      {2, 7, 5},
      {4, 9, 2},
      {1, 3, 8},
      {0, 2, 6}
    };

    int total = 0;
    for (int i = 0; i < table.length; i++) {
      total += table[i].length;
    }

    int[] list = new int[total];

    transfer2to1(table, list);

    System.out.println("1D array result:");

    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }
  }
}