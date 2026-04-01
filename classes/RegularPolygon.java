public class RegularPolygon {
  protected int sides;
  protected double size;

  public RegularPolygon() {
    this.sides = 0;
    this.size = 0.0;
  }

  public RegularPolygon(int sd, double sz) {
    this.sides = sd;
    this.size = sz;
  }

  public int getSides() { return sides; }
  public double getSize() {  return size; }

  public void setSides(int s) { this.sides = s; }
  public void setSize(double s) { this.size = s; }

  public double getPerimeter() { return sides * size; }

  public String toString() {
    return "Shape with " + sides + " sides of length " + size +
           " (Perimeter = " + getPerimeter() + ")";
  }
}