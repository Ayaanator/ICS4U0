public class Tester {
  public static void main(String[] args) {
    int row = 2;
    int col = 1;

    int errorCode = NetIO.sendRequest("" + Globals.REQUEST_TO_PROCESS_PLAY 
      + row + col + 
      Utils.leftPad(NetIO.myUserName(), Globals.CLIENT_ID_LENGTH, '0') + 
      Utils.leftPad(NetIO.myIPAddress(), Globals.CLIENT_ID_LENGTH, '0') +
      Globals.NO_MESSAGE,
      Globals.serverIPAddress);

      System.out.println(errorCode);
  }  
}
