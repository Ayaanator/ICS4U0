import java.util.Scanner;

public class TicTacToe {
  public static void printArray(int[][] arr) {
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println("\n\n\n");
    }
  }


  public static void 

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[][] board = {
      {0, 0, 0},
      {0, 0, 0}, 
      {0, 0, 0}
    };

    boolean isOver = false;
    int player = 1;

    while(!isOver) {
      printArray(board);
      System.out.print("Player " + player + ": ");
      int move = input.nextInt();

      board[move / 3][move % 3] = player;

      player = player == 1 ? 2 : 1;
    }
    
  }
}
