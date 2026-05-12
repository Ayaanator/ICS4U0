public class Utils {
  public static String leftPad(String text, int size, char pad) {
    String result = "";
    
    while(result.length() < size) {
      result = pad + text;
    }

    return result;
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
}
