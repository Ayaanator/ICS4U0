import hsa.Console;
import java.awt.*;

public class Exercise15 {
  public static void main(String[] args) {
    Console c = new Console();
    int mx = c.maxx();
    int my = c.maxy();

    c.print("Enter x coordinate for circle: ");
    int xc = c.readInt();
    c.print("Enter y coordinate for circle: ");
    int yc = c.readInt();
    c.print("Enter radius: ");
    int r = c.readInt();

    int xx = xc + r/2;
    int yy = yc + r/2;

    c.print("Enter point for x: ");
    int x = c.readInt();
    c.print("Enter point for y: ");
    int y = c.readInt();

    c.clear();

    c.drawOval(xc, yc, r, r);
    c.drawRect(x, y, 1, 1);
    c.drawRect(xx, yy, 1, 1);

    int dx = Math.abs(xx - x);
    int dy = Math.abs(yy - y);
    int diff = (int)Math.sqrt(dx*dx + dy*dy);

    if(diff <= r / 2) {
      c.print("The point is inside the circle!");
    } else {
      c.print("The point is NOT inside the circle!");
    }
    //c.clear();
  }
}
