import java.util.Random;

public class Exercise22 {
  public static void main(String[] args) {

    int rows = 5;
    int cols = 3;

    int[][] A = new int[rows][cols];
    int[][] B = new int[rows][cols];
    int[][] C = new int[rows][cols];

    Random rand = new Random();

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        A[i][j] = rand.nextInt(16) - 6;
        B[i][j] = rand.nextInt(16) - 6;

        C[i][j] = A[i][j] + B[i][j];
      }
    }

    System.out.println("\t[A]\t+\t\t[B]\t\t=\t[C]");
    System.out.println("        -----------------------------------------------------------------");

    for (int block = 0; block < 3; block++) {
      System.out.printf("\t");
        for (int j = 0; j < cols; j++) {
          System.out.printf("%-6s", "Col " + j);
        }
    }

    System.out.println();
    for (int i = 0; i < rows; i++) {

      System.out.printf("%-6s", "Row " + i);

      System.out.printf("\t");
      for (int j = 0; j < cols; j++) {
        System.out.printf("%-6d", A[i][j]);
      }


      System.out.printf("\t");
      for (int j = 0; j < cols; j++) {
        System.out.printf("%-6d", B[i][j]);
      }

      System.out.printf("\t");
      for (int j = 0; j < cols; j++) {
        System.out.printf("%-6d", C[i][j]);
      }

      System.out.println();
    }
  }
}