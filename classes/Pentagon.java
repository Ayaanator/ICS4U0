public class Pentagon extends RegularPolygon {

  public Pentagon() { super(); }
  public Pentagon(double sz) { super(5, sz); }

  public double getArea() { return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * size * size; }

  public String toString() {
    return super.toString() + ", (Area = " + getArea() + ")";
  }
}