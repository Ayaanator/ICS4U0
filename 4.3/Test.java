import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    int key = 26;
    int original_character = 255;
    int ecrypted_character = 26;
    int mx = 255;

    int encrypted_value = 26;

    //System.out.println((original_character + 26) % mx);
    //System.out.println(mx % (ecrypted_character - key));

    System.out.println((255 + 26) % 255);
    System.out.println(255 % (26 - 26));
  }
}
