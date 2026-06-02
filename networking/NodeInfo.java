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

  public String toString() {
    return "Command\t\t\t: " + (int)command +
    "\nRowCol\t\t\t: " + rowCol + 
    "\nUser Name\t\t: " + userName +
    "\nSourceip-Address\t: " + ipAddress +
    "\nMessage\t\t\t: " + message; 
  }

  public static void main(String[] args) {
    NodeInfo info = new NodeInfo((char) 245 + "12" + "000000123456789" + "00010.178.3.100" + "Your opponent is Dan...wait your turn.");
    System.out.println(info);
  }
}