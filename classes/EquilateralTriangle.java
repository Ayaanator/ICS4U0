public class EquilateralTriangle extends RegularPolygon {

  public EquilateralTriangle() { super(); }
  public EquilateralTriangle(double sz) { super(3, sz); }

  public double getArea() { return (Math.sqrt(3) / 4) * size * size; }

  @Override
  public String toString() {
    return super.toString() + ", (Area = " + getArea() + ")";
  }
}