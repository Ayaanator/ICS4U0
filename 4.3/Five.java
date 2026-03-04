import java.util.Scanner;

public class Five {

  public static void main(String[] args) {
    int[] cipherTexts = {133, 221, 221, 213, 209, 201, 63, 153, 221, 219, 229, 231, 201, 227};
    //String cipherText = "133 221 221 213 209 201 63 153 221 219 229 231 201 227";
    String cipherText = "13322122121320920163153221219229231201227";
    
    System.out.print("Decrypted message: ");
    String result = "";
    /*for (int i = 0; i < cipherText.length(); i++) {
      result += (char)(((int)cipherText.charAt(i)+ 1)/2);
    }*/

    for (int c : cipherTexts) {
      result += (char)((c + 1)/2);
    }

    System.out.print(result);
  }
}
