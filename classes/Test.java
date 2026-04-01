public class Test {
  public static void main(String[] args) {
    /*Fraction f1 = new Fraction(7, 5);
    Fraction f2 = new Fraction(3, 2);
    Fraction f3 = new Fraction(0, 6);
    Fraction f4 = new Fraction(4, 0);
    Fraction f5 = new Fraction(25, 5);

    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(f4);
    System.out.println(f5);
    System.out.println(f5);
    System.out.println(new Fraction(1,3).subtract(new Fraction(1, 6)));   */
    MixedNumber f1 = new MixedNumber(1, 3, 2);
    MixedNumber f2 = new MixedNumber(1, 2, 3);
    System.out.println(f1.add(f2));

    Pentagon t = new Pentagon(50);
    System.out.print(t);

  }
}
