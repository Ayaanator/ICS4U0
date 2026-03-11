
public class Ten {
  public static String reversal(String message) {
    String result = "";
    for(int i = message.length() - 1; i >= 0; i--) {
      result += message.charAt(i);
    }
    return result;
  }

  public static boolean isPalindrome(String message) {
    return message.equals(reversal(message));
  }
  public static void main(String[] args) {
    System.out.println(isPalindrome("racecar"));
    System.out.println(isPalindrome("hello"));
    System.out.println(isPalindrome("123"));
  }
}
