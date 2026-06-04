public class Utils {
  public static String leftPad(String text, int size, char pad) {
    
    while(text.length() < size) {
      text = pad + text;
    }

    return text;
  }

  public static int otherPlayer(int cp) {
    if(cp == Globals.PLAYER_ONE) {
      return Globals.PLAYER_TWO;
    } else if(cp == Globals.PLAYER_TWO) {
      return Globals.PLAYER_ONE;
    } else {
      return Globals.NO_PLAYER;
    }
  }

  public static String initialNetworkConnection() {
    String request = "" + Globals.REQUEST_TO_PLAY_GAME + "00" +
    leftPad(NetIO.myUserName(), Globals.CLIENT_ID_LENGTH, '0') +
    leftPad(NetIO.myIPAddress(), Globals.MAX_IP_ADDRESS_LENGTH, '0') +
    Globals.NO_MESSAGE;

    int errorCode = NetIO.sendRequest(request, Globals.serverIPAddress);

    if(errorCode != Globals.NET_OK) {
      System.out.println("Connection timeout. Server not found.");
    }

    return errorCode == Globals.NET_OK ? Globals.serverIPAddress : null;
  }

  public static void main(String[] args) {
    if (Utils.initialNetworkConnection() != null) {
      System.out.println("Connection successful");
    }
    else {
      System.out.println("Unable to connect to server");
    }
  }
}
