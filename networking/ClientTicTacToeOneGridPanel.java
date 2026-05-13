import javax.swing.*;
import java.awt.*;

  public class ClientTicTacToeOneGridPanel extends JFrame {
  public static void clientTicTacToe() {
    JFrame mainWindow = new JFrame();
    mainWindow.setTitle("ICS4U0 2026");
    mainWindow.setLocation(Globals.FRAME_X, Globals.FRAME_Y);
    mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    mainWindow.setResizable(false);
    JPanel tttPanel = new JPanel();
    GridPanel grid = new GridPanel(0, 0, Globals.NO_PLAYER);
    tttPanel.add(grid);
    mainWindow.getContentPane().add(tttPanel);
    mainWindow.pack();
    mainWindow.setVisible(true);
  }
  public static void main(String[] args) {
    Globals.gameOver = false;
    Globals.me = Globals.PLAYER_ONE;
    Globals.currentPlayer = Globals.PLAYER_ONE;
    System.out.println("Game over : " + Globals.gameOver);
    System.out.println("I am player : " + Globals.me);
    System.out.println("Current player: " + Globals.currentPlayer);
    clientTicTacToe();
  }
}