import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Word: ");
    String userInput = input.nextLine();
    
    for(int i = 0; i < userInput.length(); i++) {
      System.err.println((int)userInput.charAt(i) + "\t" + ((int)userInput.charAt(i) + 1));
    }
  }
}