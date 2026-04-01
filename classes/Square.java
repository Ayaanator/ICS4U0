public class Square extends RegularPolygon {

  public Square() { super(); }
  public Square(double sz) { super(4, sz); }

  public double getArea() { return size * size; }

  @Override
  public String toString() {
    return super.toString() + ", (Area = " + getArea() + ")";
  }
}