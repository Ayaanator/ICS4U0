import hsa.Console;
import java.awt.*;
public class Test {
  public static void main(String[] args) {
    Console con = new Console(30, 119);

    int mx = con.maxx();
    int my = con.maxy();
    con.println(mx);

    double p = 0.40;
    double c = 200;
    
    int x = (int) (p * mx);
    double y = p * (mx + 1) - 1;

    con.println(x);
    con.println(y);

    con.setColor(Color.red);
    con.drawLine(x, 0, x, my);
    con.setColor(Color.red);
    con.drawLine(y, 0, y, my);
  }
}
