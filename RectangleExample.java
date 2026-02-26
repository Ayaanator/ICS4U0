import hsa.Console;

public class RectangleExample {
  static Console c;

  public static void main(String[] args) {
    Console con = new Console();
    
    
    con.drawRect(50, 50, 100, 60);

    double p = 0.5;
    double c = 200;
    
    int x = (int) (p * c);
    double y = p * (c + 1) - 1;

    con.println(x);
    con.println(y);
  }
}
