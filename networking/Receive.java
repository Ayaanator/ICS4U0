public class Receive {
  public static void main(String[] args) {
    System.out.println("My ipAddress: " + NetIO.myIPAddress());

    do { 
      System.out.println("Waiting for message: ");
      String message = NetIO.receiveRequest();
      System.out.println(message);
    } while (true);
  }  
}
