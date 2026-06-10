import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridPanel extends JPanel {
  private final int OFFSET = (int)((0.085) * Globals.COL_WIDTH);

  private int row = -1;
  private int col = -1;
  private int val = -99;

  public GridPanel() {
    row = -1;
    col = -1;
    val = -99;
  }

  public GridPanel(int r, int c, int v) {
    this.setBackground(new Color(106, 126, 212));
    this.setPreferredSize(new Dimension(Globals.COL_WIDTH, Globals.ROW_HEIGHT));
    this.setBorder(BorderFactory.createLineBorder(Color.white));
    
    row = r;
    col = c;
    val = v;

    addMouseListener(new MoveListener());
  }

  public void setVal(int v) {
    val = v;
  }

  public void drawXorO(Graphics2D g) {
    g.setColor(Color.black);
    g.setStroke(new BasicStroke(3));

    if(val == Globals.PLAYER_ONE) {
      g.drawLine(OFFSET, OFFSET, Globals.COL_WIDTH - OFFSET, Globals.ROW_HEIGHT - OFFSET);
      g.drawLine(OFFSET, Globals.ROW_HEIGHT - OFFSET, Globals.COL_WIDTH - OFFSET, OFFSET);
    } else {
      g.drawOval(OFFSET, OFFSET, Globals.COL_WIDTH - (2 * OFFSET), Globals.ROW_HEIGHT - (2 * OFFSET));
    }
  }

  private class MoveListener extends MouseAdapter implements MouseMotionListener {
    public MoveListener() {}
    public void mouseMoved(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}
    
    public void mousePressed(MouseEvent e) {
      /*int errorCode = NetIO.sendRequest("" + Globals.REQUEST_TO_PROCESS_PLAY 
      + row + col + 
      Utils.leftPad(NetIO.myUserName(), Globals.CLIENT_ID_LENGTH, '0') + 
      Utils.leftPad(NetIO.myIPAddress(), Globals.CLIENT_ID_LENGTH, '0') +
      Globals.NO_MESSAGE,
      Globals.serverIPAddress);*/

      if(!Globals.gameOver && Globals.currentPlayer != Globals.NO_PLAYER 
        && Globals.currentPlayer == Globals.me && val == Globals.NO_PLAYER
      ) {
        Graphics2D g = (Graphics2D) getGraphics();
        
        if(val == 1) {
          Globals.currentPlayer = 2;
        } else {
          Globals.currentPlayer = 1;
        }

        String request = "" + Globals.REQUEST_TO_PROCESS_PLAY + row + col +
        Utils.leftPad(NetIO.myUserName(), Globals.CLIENT_ID_LENGTH, '0') +
        Utils.leftPad(NetIO.myIPAddress(), Globals.MAX_IP_ADDRESS_LENGTH, '0') +
        Globals.NO_MESSAGE;

        int errorCode = NetIO.sendRequest(request, Globals.serverIPAddress);

        if(errorCode == Globals.NET_OK) {
          val = Globals.currentPlayer;
          drawXorO(g);
          Globals.currentPlayer = Utils.otherPlayer(Globals.currentPlayer);
          Utils.updateStatusLine("Please wait: It's your opponent's turn now ...");
        } else {
          Utils.updateStatusLine("Play not processed. Connection may be lost");
        }
      }
    }
  }
}