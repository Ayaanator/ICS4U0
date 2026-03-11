
public class Eight {
  public static String generateCode(int size) {
    String result = "";
    for(int i = 0; i < size; i++) {
      result += (char)('0' + (int)(Math.random() * 10));
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println(generateCode(2));
    System.out.println(generateCode(3));
    System.out.println(generateCode(20));
  }
}
