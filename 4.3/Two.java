import java.util.Scanner;

public class Two {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter thing: ");
    String userInput = input.nextLine();
    String cipherInput = "";
    
    for(int i = 0; i < userInput.length(); i++) {
      //cipherInput += i + 1 % 2 == 0 ? (char)((int)userInput.charAt(i) - 1) : (char)((int)userInput.charAt(i) + 1);
      cipherInput += (char)((i) % 2 == 0 ? ((int)userInput.charAt(i) - 1) % 255 : ((int)userInput.charAt(i) + 1) % 255);
    }

    System.out.println(cipherInput);
  }
}
