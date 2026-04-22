import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class NetIO {
  public static String myIPAddress() {
    String ipAddress = "";

    try {
      InetAddress myNode = InetAddress.getLocalHost();
      ipAddress = myNode.getHostAddress();
    } catch (Exception e) {
      System.out.println("Error in myIPAddress() method");
      ipAddress = e.getMessage();
    }

    return ipAddress;
  }

  public static int sendRequest(String message, String destinationIPAddress) {
    int errorCode = Globals.NET_SEND_ERROR;
    do { 
      try {
        Socket myComputer = new Socket();
        myComputer.connect(new InetSocketAddress(destinationIPAddress, 
          Globals.PORT_NUMBER), Globals.TIME_OUT);

        // open an output channel
        DataOutputStream output = new DataOutputStream(myComputer.getOutputStream());
        output.writeUTF(message);

        // wait for confirmation from receiving computer
        DataInputStream input = new DataInputStream(myComputer.getInputStream());
        String confirmation = input.readUTF();
      } catch (Exception e) {
        System.out.println("Error: Cannot connect to receiving computer.");
      }
    } while (false);

    return errorCode;
  }

  public static void main(String[] args) {
    System.out.println(myIPAddress());
    sendRequest("Hello, how are you?", "192.168.2.105");
  }
}
