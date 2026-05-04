import java.awt.event.*;

public class GridPanel {
  private class MoveListener extends MouseAdapter implements MouseMotionListener {
    public void mousePressed(MouseEvent e) {
      int errorCode = NetIO.sendRequest("" + Globals.REQUEST_TO_PROCESS_PLAY 
      + row + col + 
      Utils.leftPad(NetIO.myUserName(), Globals.CLIENT_ID_LENGTH, '0') + 
      utils.leftPad(NetIO.myIPAddress(), Globals.CLIENT_ID_LENGTH, '0') +
      Globals.NO_MESSAGE,
      Globals.serverIPAddress);
    }
  }
}