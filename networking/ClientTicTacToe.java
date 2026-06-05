import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.*;

  public class ClientTicTacToe extends JFrame {
  public static void clientTicTacToe() {
    Globals.serverIPAddress = Utils.initialNetworkConnection();
    if(Globals.serverIPAddress != null) {
      JFrame mainWindow = new JFrame();
      mainWindow.setTitle("ICS4U0 2026");
      //mainWindow.setLocation(Globals.FRAME_X, Globals.FRAME_Y);
      mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      mainWindow.setResizable(false);

      JPanel tttPanel = new JPanel();
      //GridPanel grid = new GridPanel(0, 0, Globals.NO_PLAYER);
      //tttPanel.add(grid);

      tttPanel.setLayout(new GridLayout(Globals.ROWS, Globals.COLS));
      for(int i = 0; i < Globals.ROWS; i++) {
        for(int j = 0; j < Globals.COLS; j++) {
          Globals.grid[i][j] = new GridPanel(
            i,
            j,
            Globals.NO_PLAYER
          );

          tttPanel.add(Globals.grid[i][j]);
        }
      }

      do {
        System.out.println("Waiting...");
        String request = NetIO.receiveRequest();
        NodeInfo commandFromServer = new NodeInfo(request);
        String message = commandFromServer.getMessage();

        switch (commandFromServer.getCommand()) {
          case Globals.COMMAND_TO_WAIT:
            Utils.updateStatusLine(message);
            break;
          case Globals.COMMAND_TO_START_GAME:
            Globals.me = commandFromServer.getRowCol().charAt(0) - '0';
            Globals.currentPlayer = Globals.PLAYER_ONE;
            Utils.updateStatusLine(message);
            break;
          case Globals.COMMAND_YOUR_TURN:
            int row = commandFromServer.getRowCol().charAt(0) - '0';
            int col = commandFromServer.getRowCol().charAt(1) - '0';
            Globals.grid[row][col].setVal(Globals.currentPlayer);

            Graphics2D g = (Graphics2D) Globals.grid[row][col].getGraphics();
            Globals.grid[row][col].drawXorO(g);

            Globals.currentPlayer = Globals.currentPlayer == 1 ? 2 : 1;
            Utils.updateStatusLine(message);
            break;
          case Globals.COMMAND_GAME_TERMINATE:
            Utils.updateStatusLine(message);
            Globals.gameOver = true;
            break;
          case Globals.COMMAND_DISPLAY_MESSAGE:
            Utils.updateStatusLine(message);
            break;
          default:
            System.out.println("*** fatal error: server command unknown");
            break;
          
        }

      } while (!Globals.gameOver);

      Container container = mainWindow.getContentPane();
      container.add(tttPanel);

      //mainWindow.getContentPane().add(tttPanel);
      mainWindow.pack();
      mainWindow.setLocationRelativeTo(null);
      mainWindow.setVisible(true);
    } else {
      System.out.println("error: unable to connect. program ended");
    }
  }
  
  public static void main(String[] args) {
    //Globals.gameOver = false;
    //Globals.me = Globals.PLAYER_ONE;
    //Globals.currentPlayer = Globals.PLAYER_ONE;
    
    //System.out.println("Game over : " + Globals.gameOver);
    //System.out.println("I am player : " + Globals.me);
    //System.out.println("Current player: " + Globals.currentPlayer);
    clientTicTacToe();
  }
}