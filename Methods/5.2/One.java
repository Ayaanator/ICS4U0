
public class One {
  public static int larger(int m, int n) {
    if (m > n)
    return m;
    else
    return n;
  }
  public static void main(String[] args) {
    int x = 120;
    int y = 200;
    int bigger = larger(x, y);
    System.out.println("The larger number is " + bigger);
  }
}
