import hsa.Console;
import java.awt.*;

public class Clock {
  public static int mx, my, cx, cy, r;
  public static int handLength;

  public static String normalize(int n) {
    return (n < 10) ? "0" + n : String.valueOf(n);
  }

  public static void printClock(Console c) {
    int topLeftX = cx - r;
    int topLeftY = cy - r;
    c.drawOval(topLeftX, topLeftY, 2 * r, 2 * r);
  }

  public static void drawNumbers(Console c) {
    int margin = 20;
    for (int n = 1; n <= 12; n++) {
      double angle = Math.toRadians(n * 30 - 90);
      int x = cx + (int)((r - margin) * Math.cos(angle));
      int y = cy + (int)((r - margin) * Math.sin(angle));
      c.drawString(String.valueOf(n), x - 5, y + 5);
    }
  }

  public static void drawHand(Console c, double angleRadians) {
    int handX = cx + (int)(handLength * Math.cos(angleRadians));
    int handY = cy + (int)(handLength * Math.sin(angleRadians));
    c.setColor(Color.red);
    c.drawLine(cx, cy, handX, handY);
    c.setColor(Color.yellow);
  }

  public static void printTime(Console c, long elapsed) {
    double elapsedSeconds = elapsed / 1000.0;
    int totalTenths = (int)(elapsed * 10 / 1000.0);

    int minutes = totalTenths / 600;
    int seconds = (totalTenths / 10) % 60;
    int tenths = totalTenths % 10;

    String time = normalize(minutes) + ":" + normalize(seconds) + ":" + normalize(tenths * 10);

    int charWidth = 5;
    int textWidth = time.length() * charWidth;
    int x = cx - textWidth / 2;
    int y = cy - r - 20;
    c.drawString(time, x, y);
  }

  public static void main(String[] args) {
    Console c = new Console();

    mx = c.maxx();
    my = c.maxy();
    cx = mx / 2;
    cy = my / 2;
    r = Math.min(mx, my) / 2 - 50;
    handLength = r - 40;

    long startTime = System.currentTimeMillis();

    while (true) {
      long elapsed = System.currentTimeMillis() - startTime;

      c.setColor(Color.blue);
      c.fillRect(0, 0, mx, my);
      c.setColor(Color.yellow);

      printClock(c);
      drawNumbers(c);

      double elapsedSeconds = elapsed / 1000.0;
      double angleDegrees = (elapsedSeconds * 6) - 90;
      double angleRadians = Math.toRadians(angleDegrees);
      drawHand(c, angleRadians);

      printTime(c, elapsed);

      try {
        Thread.sleep(25);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}