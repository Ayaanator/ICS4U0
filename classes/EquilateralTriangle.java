public class EquilateralTriangle extends RegularPolygon {

  public EquilateralTriangle() { super(); }
  public EquilateralTriangle(double sz) { super(3, sz); }

  public double getArea() { return (Math.sqrt(3) / 4) * size * size; }

  public String toString() {
    return super.toString() +
      "Perimeter of triangle: " + String.format("%.2f", getPerimeter()) + " cm\n" +
      "Area of triangle: " + String.format("%.2f", getArea()) + " sq. cm\n";
  }
}