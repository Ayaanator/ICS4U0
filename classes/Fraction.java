public class Fraction {
  private int numerator;
  private int denominator;
  private boolean undefined;

  public Fraction() {
    numerator = 0;
    denominator = 0;
    undefined = true;
  }

  public Fraction(int n, int d) {
    numerator = n;
    denominator = d;
    undefined = d == 0 ? true : false;
  }

  public int getNumerator() {return numerator;}
  public int getDenominator() {return denominator;}
  public boolean getUndefined() {return getUndefined();}

  public void setNumerator(int n) {numerator = n;}
  public void setDenominator(int d) {
    denominator = d;
    undefined = d == 0 ? true : false;
  }
  public void setUndefined(boolean u) { undefined = u;}

  public String toString() {
    return undefined ? "undefined" : numerator + "/" + denominator;
  }

  public Fraction multiply(Fraction other) {
    Fraction result = new Fraction(0, 0);

    if (!undefined && !other.getUndefined()) {
      result.setNumerator(numerator *
      other.getNumerator());

      result.setDenominator(denominator *
      other.getDenominator());
    }
      return result;
    }
}
