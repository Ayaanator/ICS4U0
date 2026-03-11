
public class Three {
  public static boolean xor(boolean p, boolean q) {
    return p ^ q;
  }
  public static void main(String[] args) {
    System.out.println(xor(true, false));
    System.out.println(xor(true, true));
    System.out.println(xor(false, true));
  }
}
