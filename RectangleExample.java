import hsa.Console;

public class RectangleExample {
  static Console c;

  public static void main(String[] args) {
    c = new Console();
    
    
    c.drawRect(50, 50, 100, 60);
    int sum = 10 + 5;
    double average = (double)(sum / 2);
    c.print(average);
  }
}
