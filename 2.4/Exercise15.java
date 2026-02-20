import hsa.Console;
import java.awt.*;

public class Exercise15 {
  public static void main(String[] args) {
    Console c = new Console();
    int mx = c.maxx();
    int my = c.maxy();

    c.print("Enter x coordinate for circle: ");
    int x = c.readInt();
    c.print("Enter y coordinate for circle: ");
    int y = c.readInt();
    c.print("Enter radius: ");
    int r = c.readInt();

    c.print("Enter point for x: ");
    int xp = c.readInt();
    c.print("Enter point for y: ");
    int yp = c.readInt();

    c.clear();

    c.drawOval(x, y, r, r);
    c.drawRect(xp, yp, 1, 1);

    if(x + r <= mx && y + r <= my) {
      c.print("The circle is inside the console!");
    } else {
      c.print("The circle is NOT inside the console!");
    }
    //c.clear();
  }
}
