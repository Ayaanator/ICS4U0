
public class Four {
  public static boolean xor(boolean p, boolean q) {
    return p ^ q;
  }

  public static boolean xnor(boolean p, boolean q) {
    return !xor(p, q);
  }
  public static void main(String[] args) {
    System.out.println(xnor(true, false));
    System.out.println(xnor(true, true));
    System.out.println(xnor(false, true));
  }
}
