import hsa.Console;
import java.awt.*;


public class Exercise8 {
  public static void drawGrid(Console w) {
    int mx = w.maxx();
    int my = w.maxy();

    w.setColor(Color.yellow);
    w.fillRect(0, 0, mx, my);

    w.setColor(Color.black);

    // Vertical lines
    w.drawLine(mx / 3, 0, mx / 3, my);
    w.drawLine(mx / 3 * 2, 0, mx / 3 * 2, my);

    // Horizontal lines
    w.drawLine(0, my / 3, mx, my / 3);
    w.drawLine(0, my / 3 * 2, mx, my / 3 * 2);
  }

  public static void drawCircle(int col, int row, int r, Console w) {
    int cellWidth = w.maxx() / 3;
    int cellHeight = w.maxy() / 3;

    int centerX = col * cellWidth + cellWidth / 2;
    int centerY = row * cellHeight + cellHeight / 2;

    w.drawOval(centerX - r, centerY - r, r * 2, r * 2);
  } 

  public static void drawX(int col, int row, int r, Console w) {
    int cellWidth = w.maxx() / 3;
    int cellHeight = w.maxy() / 3;

    int centerX = col * cellWidth + cellWidth / 2;
    int centerY = row * cellHeight + cellHeight / 2;

    w.drawLine(centerX - r, centerY - r, centerX + r, centerY + r);
    w.drawLine(centerX + r, centerY - r, centerX - r, centerY + r);
  }

  public static void main(String[] args) {
    Console c = new Console(20, 60);
    int mx = c.maxx();
    int my = c.maxy();
    int cellWidth = c.maxx() / 3;
    int cellHeight = c.maxy() / 3;
    int r = Math.min(cellWidth, cellHeight) / 3;

    drawGrid(c);

    drawCircle(2, 0, r, c);
    drawCircle(2, 1, r, c);
    drawCircle(0, 2, r, c);

    drawX(0, 0, r, c);
    drawX(0, 1, r, c);
    drawX(1, 1, r, c);
  }
}
