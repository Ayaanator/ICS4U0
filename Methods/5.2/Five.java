
public class Five {
  public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
    int dx = x2 - x1;
    int dy = y2 - y1;
    return Math.sqrt(dx * dx + dy * dy);
  }
  public static void main(String[] args) {
    System.out.println(distanceBetweenTwoPoints(0, 0, 3, 4));
    System.out.println(distanceBetweenTwoPoints(1, 2, 4, 6));
    System.out.println(distanceBetweenTwoPoints(-1, -1, 2, 3));
  }
}
