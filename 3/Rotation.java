import hsa.Console;
import java.awt.*;

public class Rotation {
  public static void main(String[] args) {
    Console c = new Console();

    c.print("Enter x coordinate: ");
    int x = c.readInt();
    c.print("Enter y coordinate: ");
    int y = c.readInt();

    double angleIncrement;
    while (true) {
      c.print("Enter rotation angle per step (between -5 and 5 degrees): ");
      angleIncrement = c.readDouble();
      if (angleIncrement >= -5 && angleIncrement <= 5) break;
    }

    int mx = c.maxx();
    int my = c.maxy();

    int cx = mx / 2;
    int cy = my / 2;

    c.setColor(Color.blue);
    c.fillRect(0, 0, mx, my);

    double currentAngle = 0; 

    int prevX1 = cx - x;
    int prevY1 = cy - y;
    int prevX2 = cx + x;
    int prevY2 = cy + y;

    while (true) {
      c.setColor(Color.blue);
      c.drawLine(prevX1, prevY1, prevX2, prevY2);

      currentAngle += angleIncrement;
      double rad = Math.toRadians(currentAngle);

      int newX1 = cx + (int)((-x) * Math.cos(rad) - (-y) * Math.sin(rad));
      int newY1 = cy + (int)((-x) * Math.sin(rad) + (-y) * Math.cos(rad));
      int newX2 = cx + (int)(x * Math.cos(rad) - y * Math.sin(rad));
      int newY2 = cy + (int)(x * Math.sin(rad) + y * Math.cos(rad));

      c.setColor(Color.yellow);
      c.drawLine(newX1, newY1, newX2, newY2);

      prevX1 = newX1;
      prevY1 = newY1;
      prevX2 = newX2;
      prevY2 = newY2;

      try {
        Thread.sleep(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}