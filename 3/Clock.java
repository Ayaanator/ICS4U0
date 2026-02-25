import hsa.Console;
import java.awt.*;


public class Clock {
  public static void main(String[] args) {
    Console c = new Console();
    int mx = c.maxx();
    int my = c.maxy();

    c.print(System.currentTimeMillis());
    
  }
}
