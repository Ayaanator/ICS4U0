import java.util.Random;

public class Exercise21 {
  public static void main(String[] args) {

    int[][] arr = new int[15][10];
    Random rand = new Random();

    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 10; j++) {
        arr[i][j] = rand.nextInt(50);
      }
    }

    System.out.println("Original Array:");
    
    System.out.printf("%-8s", "");
    for (int j = 0; j < 10; j++) {
      System.out.printf("%-5s", "Col " + j);
    }
    System.out.println();

    for (int i = 0; i < 15; i++) {
      System.out.printf("%-8s", "Row " + i);
      for (int j = 0; j < 10; j++) {
        System.out.printf("%-5d", arr[i][j]);
      }
      System.out.println();
    }

    int[][] transposed = new int[10][15];

    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 10; j++) {
        transposed[j][i] = arr[i][j];
      }
    }

    System.out.println("\nTransposed Array:");
    
    System.out.printf("%-8s", "");
    for (int j = 0; j < 15; j++) {
      System.out.printf("%-6s", "Col " + j);
    }
    System.out.println();

    for (int i = 0; i < 10; i++) {
      System.out.printf("%-8s", "Row " + i);
      for (int j = 0; j < 15; j++) {
        System.out.printf("%-6d", transposed[i][j]);
      }
      System.out.println();
    }
  }
}