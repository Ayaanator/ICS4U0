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

    c.setColor(Color.yellow);
    c.drawLine(cx, cy, cx + r, cy);

    double angleX = xp * 3.6;
    double angleY = (yp * 3.6) + angleX;
    double angleZ = 360.0;

    int x2 = (int)(cx + r * Math.cos(Math.toRadians(angleX)));
    int y2 = (int)(cy - r * Math.sin(Math.toRadians(angleX)));

    int x3 = (int)(cx + r * Math.cos(Math.toRadians(angleY)));
    int y3 = (int)(cy - r * Math.sin(Math.toRadians(angleY)));
    
    c.setColor(Color.red);
    c.drawLine(cx, cy, x2, y2);
    c.setColor(Color.green);
    c.drawLine(cx, cy, x3, y3);
    // c.print(angleX + ", " + angleY + ", " + angleZ);

    c.setColor(Color.white);
    c.drawString("0.0%", cx + (r / 3), cy - 12);
    c.setColor(Color.yellow);
    c.drawString(String.format("%.1f %s", zp, "%"), (int)((double)cx + (double)r * 1.20), cy);

    /*if(x2 > cx) x2 = (int)((double)x2 * 1.1);
    else x2 = (int)((double)x2 * 0.9);

    if(y2 > cy) y2 = (int)((double)y2 * 1.1);
    else y2 = (int)((double)y2 * 0.9);

    if(x3 > cx) x3 = (int)((double)x3 * 1.1);
    else x3 = (int)((double)x3 * 0.9);

    if(y3 > cy) y3 = (int)((double)y3 * 1.1);
    else y3 = (int)((double)y3 * 0.9);*/

    int small = 10;
    int big = 35;

    if(x2 > cx) x2 += small;
    else x2 -= big;

    if(y2 > cy) y2 += big;
    else y2 -= small;

    if(x3 > cx) x3 += small;
    else x3 -= big;

    if(y3 > cy) y3 += big;
    else y3 -= small;

    // 37, 45, 21
    // 378, 245, 98

    c.setColor(Color.red);
    c.drawString(String.format("%.1f %s", xp, "%"), x2, y2);
    c.setColor(Color.green);
    c.drawString(String.format("%.1f %s", yp, "%"), x3, y3);

    c.setColor(Color.white);
    c.drawString("Computer Science AP 12", 10, my - 25);
    c.drawString("Report as of February 13, 2026", 10, my - 10);
  }
}
