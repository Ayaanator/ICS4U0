import java.util.Scanner;

public class Six {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //System.out.print("Enter thing: ");
    //String userInput = input.nextLine();
    String userInput = "PIZZA PLEASE";
    String pswd = "";
    String cipherInput = "smvmdDl_heoX";
    
    for(int i = 0; i < userInput.length(); i++) {
      //cipherInput += i + 1 % 2 == 0 ? (char)((int)userInput.charAt(i) - 1) : (char)((int)userInput.charAt(i) + 1);
      pswd += (char)((int)cipherInput.charAt(i) - (int)userInput.charAt(i) + 30);
    }

    System.out.println(pswd);
  }
}
