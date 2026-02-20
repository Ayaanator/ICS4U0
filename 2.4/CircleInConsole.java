import hsa.Console;
import java.awt.*;

public class CircleInConsole {
  public static void main(String[] args) {
    Console c = new Console();
    int mx = c.maxx();
    int my = c.maxy();

    c.print("Enter x coordinate for circle: ");
    int xp = c.readInt();
    c.print("Enter y coordinate for circle: ");
    int yp = c.readInt();
    c.print("Enter radius: ");
    int r = c.readInt();

    c.clear();

    c.drawOval(xp, yp, r, r);
    //c.drawOval(0, 0, mx, my);

    if(xp + r <= mx && yp + r <= my) {
      c.print("The circle is inside the console!");
    } else {
      c.print("The circle is NOT inside the console!");
    }
    //c.clear();
  }
}
