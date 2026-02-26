import hsa.Console;
import java.awt.*;
import java.util.Scanner;

public class Password {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String password = "Ayaan";
    String input = "";
    int attempts = 0;

    while(!(password.equals(input)) && attempts < 4) {
      System.out.print("Password: ");
      input = keyboard.nextLine();
      attempts++;

      if(!(password.equals(input))) {
        System.out.println("***invalid password");
      }
    }

    if(!(password.equals(input))) {
      System.out.println("Access denied");
    } else {
      System.out.println("You may proceed");
    }
  }
}