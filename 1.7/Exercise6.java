import hsa.Console;
import java.awt.*;

public class Exercise6 {
  public static void main(String[] args) {
    Console c = new Console(30, 40);
    int mx = c.maxx();
    int my = c.maxy();

    int width = mx / 2;
    int height = my / 2;

    c.setColor(Color.yellow);
    c.drawLine(0, 0, mx, my);
    c.drawLine(mx, 0, 0, my);

    c.setColor(Color.blue);
    c.drawRect(mx / 4, my / 4, width, height);

    c.setColor(Color.red);
    c.drawOval(mx / 4, my / 4, width, height);
  }
}
