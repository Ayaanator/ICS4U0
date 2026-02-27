import hsa.Console;
import java.awt.*;
public class RectangleExample {
  static Console c;

  public static void main(String[] args) {
    Console con = new Console();

    int mx = c.maxx();
    int my = c.maxy();
    
    con.drawRect(50, 50, 100, 60);
    con.print(mx);

    double p = 0.5;
    double c = 200;
    
    int x = (int) (p * c);
    double y = p * (c + 1) - 1;

    con.println(x);
    con.println(y);
  }
}
