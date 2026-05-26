import java.awt.Container;
import javax.swing.*;

  public class ClientTicTacToeOneGridPanel extends JFrame {
  public static void clientTicTacToe() {
    JFrame mainWindow = new JFrame();
    mainWindow.setTitle("ICS4U0 2026");
    //mainWindow.setLocation(Globals.FRAME_X, Globals.FRAME_Y);
    mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    mainWindow.setResizable(false);

    JPanel tttPanel = new JPanel();
    GridPanel grid = new GridPanel(0, 0, Globals.NO_PLAYER);
    tttPanel.add(grid);

    Container container = mainWindow.getContentPane();
    container.add(tttPanel);

    //mainWindow.getContentPane().add(tttPanel);
    mainWindow.pack();
    mainWindow.setLocationRelativeTo(null);
    mainWindow.setVisible(true);
  }
  
  public static void main(String[] args) {
    Globals.gameOver = false;
    Globals.me = Globals.PLAYER_TWO;
    Globals.currentPlayer = Globals.PLAYER_TWO;
    
    System.out.println("Game over : " + Globals.gameOver);
    System.out.println("I am player : " + Globals.me);
    System.out.println("Current player: " + Globals.currentPlayer);
    clientTicTacToe();
  }
}