import hsa.Console;
import java.awt.*;

public class Exercise3 {
  public static void main(String[] args) {
    Console c = new Console();
    int mx = c.maxx();
    int my = c.maxy();


    c.setColor(Color.blue);
    c.drawRect(80, 80, 400, 250);
    c.setColor(Color.red);
    c.drawRect(83, 83, 394, 243);
  }
}
