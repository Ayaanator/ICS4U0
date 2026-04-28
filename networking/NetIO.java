import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

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

  public static String myUserName() {
    String userName = "";
    try {
      userName = System.getProperty("user.name");
    } catch (Exception e) {
      System.out.println("Unable to get username");
    }

    return userName;
  }

  public static String receiveRequest() {
    String request = "";
    int errorCode = Globals.NET_RECEIVE_ERROR;
    try {
      ServerSocket server = new ServerSocket(Globals.PORT_NUMBER, Globals.QUEUE_SIZE);
      Socket myComputer = server.accept();
      myComputer.setSoTimeout(Globals.TIME_OUT);

      DataInputStream input = new DataInputStream(myComputer.getInputStream());
      request = input.readUTF();

      DataOutputStream output = new DataOutputStream(myComputer.getOutputStream());
      output.writeUTF("" + Globals.NET_OK);

      myComputer.close();
      server.close();
      errorCode = Globals.NET_OK;
    } catch(IOException e) {
      System.out.println("Unable to receive request");
    }

    return request;
  }

  public static int sendRequest(String message, String destinationIPAddress) {
    int errorCode = Globals.NET_SEND_ERROR;
    int attempts = 0;

    do { 
      try {
        attempts++;
        Socket myComputer = new Socket();
        myComputer.connect(new InetSocketAddress(destinationIPAddress, 
          Globals.PORT_NUMBER), Globals.TIME_OUT);

        // open an output channel
        DataOutputStream output = new DataOutputStream(myComputer.getOutputStream());
        output.writeUTF(message);

        // wait for confirmation from receiving computer
        DataInputStream input = new DataInputStream(myComputer.getInputStream());
        String confirmation = input.readUTF();

        errorCode = confirmation.equals("" + Globals.NET_OK) ? Globals.NET_OK : Globals.NET_SEND_ERROR;
        myComputer.close();
      } catch (Exception e) {
        System.out.println("Error: Cannot connect to receiving computer.");
      }
    } while (errorCode != Globals.NET_OK && attempts < Globals.SENDING_ATTEMPTS_LIMIT);

    return errorCode;
  }
}

/*
public static String myIPAddress() {
    String address = "***cannot find address";
    try {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface ni = (NetworkInterface) networkInterfaces.nextElement();
            Enumeration<InetAddress> addresses = ni.getInetAddresses();
            while (addresses.hasMoreElements()) {
                InetAddress ia = (InetAddress) addresses.nextElement();
                if (!ia.isLoopbackAddress() && !ia.isLinkLocalAddress()) {
                    address = ia.getHostAddress();
                }
            }
        }
    } catch (SocketException e) {
        System.out.println("*** in NetIO.myIPAddress() exception thrown");
    }
    return address;
}
*/