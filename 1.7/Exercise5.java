import hsa.*;
import java.awt.*;

public class Exercise5 {
  public static void main(String[] args) {

    Stdout.print("Enter a mark: ");
    double x = Stdin.readDouble();
    // String markStr = String.valueOf(x) + "%";

    Console c = new Console(30, 100, 18, "Computer Graphics at Bloor CI.");
    int mx = c.maxx();
    int my = c.maxy();

    
    c.drawString("100%", 10, 20);
    c.drawString("0%", 10, my - 10);
    c.setColor(Color.blue);
    int barHeight = ((int)((x / 100.0) * my) * -1) + 20;
    c.fillRect(60, my - 10, 80, barHeight);
  }
}
