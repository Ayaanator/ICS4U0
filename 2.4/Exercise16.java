import hsa.Console;
import java.awt.*;

public class Exercise16 {
  public static void main(String[] args) {
    Console c = new Console();
    int mx = c.maxx();
    int my = c.maxy();

    c.print("Enter x coordinate for circle 1: ");
    int xc1 = c.readInt();
    c.print("Enter y coordinate for circle 1: ");
    int yc1 = c.readInt();
    c.print("Enter radius for circle 1: ");
    int r1 = c.readInt();

    c.print("Enter x coordinate for circle 2: ");
    int xc2 = c.readInt();
    c.print("Enter y coordinate for circle 2: ");
    int yc2 = c.readInt();
    c.print("Enter radius for circle 2: ");
    int r2 = c.readInt();

    int xx1 = xc1 + r1/2;
    int yy1 = yc1 + r1/2;

    int xx2 = xc2 + r2/2;
    int yy2 = yc2 + r2/2;

    c.clear();
    c.drawOval(xc1, yc1, r1, r1);
    c.drawRect(xx1, yy1, 1, 1);
    c.drawOval(xc2, yc2, r2, r2);
    c.drawRect(xx2, yy2, 1, 1);

    int dx = Math.abs(xx1 - xx2);
    int dy = Math.abs(yy1 - yy2);
    int diff = (int)Math.sqrt(dx*dx + dy*dy);


    if(diff <= (r1 / 2) + (r2 / 2)) {
      c.print("The circles overlap!");
    } else {
      c.print("The circles do NOT overlap!");
    }
    //c.clear();
  }
}
