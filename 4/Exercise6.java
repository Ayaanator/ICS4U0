import java.util.Scanner;

public class Exercise6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter thing: ");
    String userInput = input.nextLine();
    String cleanedInput = "";
    
    for(int i = 0; i < userInput.length(); i++) {
      if(userInput.charAt(i) != ' ') cleanedInput += userInput.charAt(i);
    }

    Boolean flag = true;

    for(int i = 0; i < cleanedInput.length(); i++) {
      if(cleanedInput.charAt(i) != cleanedInput.charAt(cleanedInput.length() - i - 1)) flag = false;
    }

    System.out.print(flag);
  }
}