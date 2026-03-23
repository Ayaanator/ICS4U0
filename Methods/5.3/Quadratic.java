
public class Quadratic {
  public static int absolute(int x) {
    return x > 0 ? x : x * -1;  
  }
  public static String standardQuadratic(int x1, int x2) {
    String result = "";

    x1 *= -1;
    x2 *= -1;

    String one = "x^2";
    String two = (x1 + x2 > 0 ? " + " : " - ") + absolute(x1 + x2) + "x";
    String three = (x1 * x2 > 0 ? " + " : " - ") + absolute(x1 * x2);

    if(two.equals(" + 1x")) two = " + x";
    if(two.equals(" - 1x")) two = " - x";
    if(two.equals(" + 0x")) two = "";
    if(two.equals(" - 0x")) two = "";
    if(x1 == 0 && x2 == 0) return "x^2";
    return one + two + three;
  }
  public static void main(String[] args) {
    System.out.println(standardQuadratic(2, 3));
    System.out.println(standardQuadratic(2, -3));
    System.out.println(standardQuadratic(-2, 3));
    System.out.println(standardQuadratic(-2, -3));
    System.out.println(standardQuadratic(4, -4));
    System.out.println(standardQuadratic(0, 0));
  }
}
