import hsa.Console;
import java.awt.*;

public class Sine {
  public static void main(String[] args) {

    Console c = new Console();

    int mx = c.maxx();
    int my = c.maxy();

    int cx = mx / 2;
    int cy = my / 2;

    c.setColor(Color.white);
    c.fillRect(0, 0, mx, my);

    c.setColor(Color.black);
    c.drawLine(0, cy, mx, cy);
    c.drawLine(cx, 0, cx, my);

    int amplitude = my / 4;

    c.setColor(Color.blue);

    double prevX = 0;
    double prevY = cy;

    for (int i = 0; i <= 720; i++) {

      double angle = Math.toRadians(i - 360);
      double y = Math.sin(angle);
      double dx = i * (mx / 720.0);
      double dy = cy - (y * amplitude);

      if (i > 0) {
        c.drawLine((int)prevX, (int)prevY, (int)dx, (int)dy);
        //c.drawLine((int)prevX, (int)prevY + 1, (int)dx, (int)dy + 1);
        //c.drawLine((int)prevX, (int)prevY - 1, (int)dx, (int)dy - 1);
      }

      prevX = dx;
      prevY = dy;
    }
  }
}