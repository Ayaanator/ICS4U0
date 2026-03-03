import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter name: ");
    String fullName = input.nextLine();

    int space = fullName.indexOf(" ");
    String fn = fullName.substring(0, space);
    String ln = fullName.substring(space + 1, fullName.length());
    
    System.out.println(fn);
    System.out.println(ln);
    input.close();
  }
}