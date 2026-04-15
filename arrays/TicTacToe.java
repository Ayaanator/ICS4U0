import java.util.Scanner;

public class TicTacToe {
  public static double[] productRows = { 1, 1, 1 };
  public static double[] productColumns = { 1, 1, 1 };
  public static double[] productDiagonals = { 1, 1 };

  public static void printArray(int[][] arr) {
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println("\n\n\n");
    }
  }

  public static boolean isFull(int[][] board) {
    boolean flag = true;

    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        if(board[i][j] == 0) {
          flag = false;
        }
      }
    }

    return flag;
  }

  public static int gameOver(int[][] board) {
    int winner = -1;
    boolean flag = false;

    for(int i = 0; i < 3; i++) {
      if(!flag) {
        if (productRows[i] == 1.1 * 1.1 * 1.1) {
          winner = 1;
          flag = true;
        } else if (productRows[i] == 8) {
          winner = 2;
          flag = true;
        }

        if (productColumns[i] == 1.1 * 1.1 * 1.1) {
          winner = 1;
          flag = true;
        } else if (productColumns[i] == 8) {
          winner = 2;
          flag = true;
        }
      }
    }

    for(int i = 0; i < 2; i++) {
      if(!flag) {
        if (productDiagonals[i] == 1.1 * 1.1 * 1.1) {
          winner = 1;
          flag = true;
        } else if (productDiagonals[i] == 8) {
          winner = 2;
          flag = true;
        }
      }
    }

    return winner == -1 && isFull(board) ? 0 : winner;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[][] board = {
      {0, 0, 0},
      {0, 0, 0}, 
      {0, 0, 0}
    };

    int isOver = -1;
    int player = 1;

    while(isOver == -1) {
      printArray(board);
      int row = 0;
      int col = 0;

      System.out.print("Player " + player + " row: ");
      row = input.nextInt();
      System.out.print("Player " + player + " col: ");
      col = input.nextInt();
      
      /*System.out.print("Player " + player + " row: ");
      int move = input.nextInt();
      int row = move / 3;
      int col = move % 3;*/

      board[row][col] = player;

      productRows[row] *= player == 1 ? 1.1 : 2.0;
      productColumns[col] *= player == 1 ? 1.1 : 2.0;

      if(row == 0 && col == 0) {
        productDiagonals[0] *= player == 1 ? 1.1 : 2.0;
      } else if(row == 2 && col == 2) {
        productDiagonals[0] *= player == 1 ? 1.1 : 2.0;
      } else if(row == 0 && col == 2) {
        productDiagonals[1] *= player == 1 ? 1.1 : 2.0;
      } else if(row == 2 && col == 0) {
        productDiagonals[1] *= player == 1 ? 1.1 : 2.0;
      } else if(row == 1 && col == 1) {
        productDiagonals[0] *= player == 1 ? 1.1 : 2.0;
        productDiagonals[1] *= player == 1 ? 1.1 : 2.0;
      }
      

      player = player == 1 ? 2 : 1;

      isOver = gameOver(board);
    }

    printArray(board);

    if(isOver == 0) {
      System.out.println("\nThis is a tie.\n");
    } else {
      System.out.println("\nPlayer " + isOver + " wins!");
    }
  }
}
