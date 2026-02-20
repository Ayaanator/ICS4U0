import hsa.Console;
import java.awt.*;

public class RectangleAndPoint {
  public static void main(String[] args) {
    Console c = new Console();
    int mx = c.maxx();
    int my = c.maxy();

    c.print("Enter x value for upper left corner of rectangle: ");
    int x = c.readInt();
    c.print("Enter y value for upper left corner of rectangle: ");
    int y = c.readInt();

    c.print("Enter width: ");
    int width = c.readInt();
    c.print("Enter height: ");
    int height = c.readInt();

    c.print("Enter x coordinate for point: ");
    int xp = c.readInt();
    c.print("Enter y coordinate for point: ");
    int yp = c.readInt();

    c.clear();

    c.drawRect(x, y, width, height);
    c.drawRect(xp, yp, 1, 1);

    if(xp >= x && xp <= x + width && yp >= y && yp <= y + height) {
      c.print("The point is inside the rectangle!");
    } else {
      c.print("The point is not inside the reactangle!");
    }
    //c.clear();
  }
}
