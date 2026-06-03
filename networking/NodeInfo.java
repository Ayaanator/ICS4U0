public class NodeInfo {
  private char command;
  private String rowCol;
  private String userName;
  private String ipAddress;
  private String message;

  public NodeInfo() {
    command = 0;
    rowCol = null;
    userName = null;
    ipAddress = null;
    message = null; 
  }

  public NodeInfo(String request) {
    command = request.charAt(0);
    rowCol = request.substring(1, 3);
    userName = request.substring(3, 18);
    ipAddress = request.substring(18, 33);
    message = request.substring(33);
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
    NodeInfo info = new NodeInfo();
    info.setCommand((char) 243);
    info.setRowCol("02");
    info.setUserName("000000ABCDEFGHI");
    info.setIPAddress("00192.168.0.129");
    info.setMessage("It's your turn...");
    System.out.println(info);
  }
}