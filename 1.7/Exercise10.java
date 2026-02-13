import hsa.Console;
import java.awt.*;


public class Exercise10 {
  public static void main(String[] args) {
    Console c = new Console(20, 60);
    int mx = c.maxx();
    int my = c.maxy();

    int r = Math.min(mx / 2, my / 2) / 2;

    c.setColor(Color.black);
    c.fillRect(0, 0, mx, my);

    c.setTextColor(Color.white);
    c.setTextBackgroundColor(Color.black);

    c.print("Enter value 1: ");
    double x = c.readDouble();
    c.print("Enter value 2: ");
    double y = c.readDouble();
    c.print("Enter value 2: ");
    double z = c.readDouble();

    c.clear();

    double total = x + y + z;
    double xp = (x / total) * 100.0;
    double yp = (y / total) * 100.0;
    double zp = (z / total) * 100.0;

    c.print(String.format("Total %.1f : %s", total, "100%\n\n"));
    c.setColor(Color.white);
    c.drawLine(0, 25, mx, 25);

    c.print(String.format("Value %.1f : %.1f%s\n", x, xp, "%"));
    c.print(String.format("Value %.1f : %.1f%s\n", y, yp, "%"));
    c.print(String.format("Value %.1f : %.1f%s\n", z, zp, "%"));

    int cx = (mx / 2);
    int cy = (my / 2) + 50;

    c.drawOval(cx - r, cy - r, r * 2, r * 2);

    c.drawLine(cx, cy, cx + r, cy);

    int x2 = (int)(cx + r * Math.cos((2.0*Math.PI)/(100.0/xp)));
    int y2 = (int)(cy - r * Math.sin((2.0*Math.PI)/(100.0/xp)));

    c.drawLine(cx, cy, x2, y2);
  }
}
