import hsa.Console;
import java.awt.*;

public class Exercise4 {
  public static void main(String[] args) {
    Console c = new Console(30, 100, 18, "Computer Graphics at Bloor CI.");
    int mx = c.maxx();
    int my = c.maxy();

    c.setColor(Color.cyan);
    c.fillRect(0, 0, c.maxx(), c.maxy());

    c.setColor(Color.black);
    c.drawLine(0, my / 2, mx, my / 2);
    c.drawLine(mx / 2, 0, mx / 2, my);

    c.drawLine((mx / 2) - 300, (my / 2) + 285, (mx / 2) + 300, my / 2 - 315);
    c.drawString("X", mx - 20, (my / 2) - 20);
    c.drawString("Y", (mx / 2) + 20, 0 + 20);

    c.setCursor(30, 30);
    c.drawString("y = x + 15", mx / 2 + 15, my / 2 - 100);

    // c.print(c.maxx() + "\n");
    // 1099

    //c.print(c.maxy());
    //749
  }
}
