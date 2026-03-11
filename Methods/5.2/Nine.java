
public class Nine {
  public static String reversal(String message) {
    String result = "";
    for(int i = message.length() - 1; i >= 0; i--) {
      result += message.charAt(i);
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println(reversal("racecar"));
    System.out.println(reversal("hello"));
    System.out.println(reversal("123"));
  }
}
