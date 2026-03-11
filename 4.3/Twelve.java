import java.util.Scanner;

public class Twelve {

  public static void main(String[] args) {
    int quantity = 20;
    int unitPrice = 4;
    int ship = 8;
    int total;

    unitPrice = quantity > 10 ? 3 : unitPrice;
    ship = quantity > 20 ? 0 : ship;
    total = quantity * unitPrice + ship;
    System.out.println(total);

    Scanner input = new Scanner(System.in);

    //System.out.print("Enter thing: ");
    //String userInput = input.nextLine();
    String labels = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String rotor1 = "OKDEMFZGXHCTNPQRASLUVWJBYI";

    
  }
}
