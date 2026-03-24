public class Fraction {
  private int numerator = -1;
  private int denominator = -1;
  private boolean undefined = true;

  public Fraction() {
    numerator = 0;
    denominator = 0;
    undefined = true;
  }

  public Fraction(int n, int d) {
    numerator = n;
    denominator = d;
    undefined = denominator == 0;
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
      result.setNumerator(numerator * other.getNumerator());
      result.setDenominator(denominator * other.getDenominator());
    }
      
    return result;
  }

  public Fraction reciprocal() {
    Fraction result = new Fraction(0, 0);
    if (!undefined && numerator != 0) {
      result.setNumerator(denominator);
      result.setDenominator(numerator);
    }

    return result;
  }

  public Fraction divide(Fraction theOther) {
    return multiply(theOther.reciprocal());
  }

  public void simplify() {
    int smallest = numerator > denominator ? denominator : numerator;

    for(int i = 1; i <= smallest + 1; i++) {
      if(numerator % i == 0 && denominator % i == 0) {
        numerator = numerator / i;
        denominator = denominator / i;
      }
    }
  }
}
