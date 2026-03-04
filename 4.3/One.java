import java.util.Scanner;

public class One {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter thing: ");
    String userInput = input.nextLine();
    String cipherInput = "";
    
    for(int i = 0; i < userInput.length(); i++) {
      cipherInput += (char)(((int)userInput.charAt(i) + 1) % 255);
    }

    System.out.println(cipherInput);
  }
}
