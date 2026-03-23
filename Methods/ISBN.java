public class ISBN {
  public static boolean isbn13(String ISBN) {
    boolean flag;

    if(ISBN.length() == 13) {
      boolean valid = true;
    
      for (int i = 0; i < 12; i++) {
        char c = ISBN.charAt(i);
        if (!(c >= '0' && c <= '9')) {
          valid = false;
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
            flag = true;
          } else {
            System.err.println("Wrong value at position 13!");
            flag = false;
          }
        } else {
          System.err.println("Last digit has to be between 0-10!");
          flag = false;
        }
      } else {
        System.err.println("First 12 characters must be digits 0-9!");
        flag = false;
      }
    } else {
      System.err.println("Wrong length!");
      flag = false;
    }

    return flag;
  }
  public static void main(String[] args) {
    System.out.println(isbn13("9781774920466"));
    System.out.println(isbn13("9780684856094"));
    System.out.println(isbn13("9780306406157"));
    System.out.println(isbn13("113224331877"));
    System.out.println(isbn13("2641X71424488"));
    System.out.println(isbn13("9780684856095"));
  }
}
