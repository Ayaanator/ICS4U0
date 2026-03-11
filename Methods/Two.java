
public class Two {
  public static boolean multipleFactors(int p, int q, int r) {
    return (q % p == 0) && (r % q == 0);
  }
  public static void main(String[] args) {
    System.out.println(multipleFactors(2, 4, 8));
    System.out.println(multipleFactors(2, 5, 10));
    System.out.println(multipleFactors(3, 6, 18));
  }
}
