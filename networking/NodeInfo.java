public class NodeInfo {
  private char command = 0;
  private String rowCol = "";
  private String userName = "";
  private String ipAddress = "";
  private String message = "";

  public NodeInfo() {
    command = 0;
    rowCol = "";
    userName = "";
    ipAddress = "";
    message = ""; 
  }

  public NodeInfo(String request) {
    if(request.length() >= Globals.MINIMUM_MESSAGE_LENGTH) {
      command = request.charAt(0);
      rowCol = request.substring(1, 3);
      userName = request.substring(3, 18);
      ipAddress = request.substring(18, 33);
      message = request.substring(33);
    } else {
      command = Globals.REQUEST_UNKNOWN;
      rowCol = Globals.DEFAULT_ROW_COL;
      userName = Globals.UNKNOWN_PLAYER_NAME;
      ipAddress = Globals.UNKNOWN_ADDRESS;
      message = request.substring(33);
    }
  }

  char getCommand() {return command;}
  String getRowCol() {return rowCol;}
  String getUserName() {return userName;}
  String getIPAddress() {return ipAddress;}
  String getMessage() {return message;}

  void setCommand(char c) {command = c;}
  void setRowCol(String rc) {rowCol = rc;}
  void setUserName(String un) {userName = un;}
  void setIPAddress(String i) {ipAddress = i;}
  void setMessage(String m) {message = m;}

  public String toString() {
    return "Command\t\t\t: " + (int)command +
    "\nRowCol\t\t\t: " + rowCol + 
    "\nUser Name\t\t: " + userName +
    "\nSourceip-Address\t: " + ipAddress +
    "\nMessage\t\t\t: " + message; 
  }

  public static void main(String[] args) {
    NodeInfo info1 = new NodeInfo((char) 245 + "12" + "000000123456789" + "00010.178.3.100" + "Your opponent is Dan...wait your turn.");
    System.out.println(info1 + "\n");

    NodeInfo info2 = new NodeInfo();
    info2.setCommand((char) 243);
    info2.setRowCol("02");
    info2.setUserName("000000ABCDEFGHI");
    info2.setIPAddress("00192.168.0.129");
    info2.setMessage("It's your turn...");
    System.out.println(info2);
  }
}