import java.util.Scanner;
public class ISBN {
  public static boolean isbn13(String ISBN) {
    if(ISBN.length() == 13) {
      boolean valid = true;
    
      for (int i = 0; i < 12; i++) {
        char c = ISBN.charAt(i);
        if (!(c >= '0' && c <= '9')) {
          valid = false;
          break;
        }
      }

      if(valid) {
        char lastChar = ISBN.charAt(12);
        if ((lastChar >= '0' && lastChar <= '9') || lastChar == 'X') {
          
          int sigma = 0;
          for(int i = 0; i < ISBN.length() / 2; i++) {
            sigma += (ISBN.charAt(i * 2) - '0') + (3 * (ISBN.charAt((i * 2) + 1) - '0'));
          }
          
          int check = 10 - (sigma % 10);
          if((check == 10 && lastChar == 'X') || check == lastChar - '0') {
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String ISBN = "3471602289303";
    System.out.print("Enter ISBN code: ");
    ISBN = input.nextLine();

    if(ISBN.length() == 13) {
      boolean valid = true;
    
      for (int i = 0; i < 12; i++) {
        char c = ISBN.charAt(i);
        if (!(c >= '0' && c <= '9')) {
          valid = false;
          break;
        }
      }

      if(valid) {
        char lastChar = ISBN.charAt(12);
        if ((lastChar >= '0' && lastChar <= '9') || lastChar == 'X') {
          
          int sigma = 0;
          for(int i = 0; i < ISBN.length() / 2; i++) {
            sigma += (ISBN.charAt(i * 2) - '0') + (3 * (ISBN.charAt((i * 2) + 1) - '0'));
          }
          
          int check = 10 - (sigma % 10);
          if((check == 10 && lastChar == 'X') || check == lastChar - '0') {
            System.out.println("Valid ISBN!");
          } else {
            System.out.println("Wrong value at position 13!");
          }
        } else {
          System.out.println("Last digit has to be between 0-10!");
        }
      } else {
        System.out.println("First 12 characters must be digits 0-9!");
      }
    } else {
      System.out.println("Wrong length!");
    }

    System.out.println(isbn13("9780684856094"));
    System.out.println(isbn13("9780306406157"));
    System.out.println(isbn13("113224331877"));
    System.out.println(isbn13("2641X71424488"));
    System.out.println(isbn13("9780684856095"));
  }
}
