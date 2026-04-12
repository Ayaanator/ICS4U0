public class Exercise19 {
  public static void main(String[] args) {

    int ROWS = 5;
    int COLUMNS = 4;
    int[][] arr = new int[ROWS][COLUMNS];

    for (int i = 0; i < ROWS; i++) {
      for (int j = 0; j < COLUMNS; j++) {
        arr[i][j] = 0;
      }
    }

    arr[3][2] = 5;

    System.out.printf("%-6s", "");
    for (int j = 0; j < COLUMNS; j++) {
      System.out.printf("%-6s", "Col " + j);
    }
    System.out.println();

    for (int i = 0; i < ROWS; i++) {
      System.out.printf("%-6s", "Row " + i);
      for (int j = 0; j < COLUMNS; j++) {
        System.out.printf("%-6d", arr[i][j]);
      }
      System.out.println();
    }
  }
}