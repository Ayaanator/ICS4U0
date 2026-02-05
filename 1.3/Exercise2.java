public class Exercise2 {
  public static void main(String[] args) {
    double x1 = 5;
    double y1 = 1;
    double x2 = -3;
    double y2 = 5;

    double slope = (y2 - y1) / (x2 - x1);

    System.out.println(String.format("Slope of the line through (%.0f, %.0f) and (%.0f, %.0f) is %.1f", 
    x1, y1, x2, y2, slope));
  }
}