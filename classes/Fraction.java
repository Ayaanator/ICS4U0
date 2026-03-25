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
  public boolean getUndefined() {return undefined;}

  public void setNumerator(int n) {numerator = n;}
  public void setDenominator(int d) {
    denominator = d;
    undefined = denominator == 0;
  }
  public void setUndefined(boolean u) { undefined = u;}

  public String toString() {
    simplify();
    if(undefined) return "undefined";
    else if (numerator == 0) return "0";
    else if (denominator == 1) return "" + numerator;
    else return numerator + "/" + denominator;
  }

  public Fraction multiply(Fraction other) {
    simplify();
    other.simplify();
    Fraction result = new Fraction(0, 0);

    if (!undefined && !other.getUndefined()) {
      result.setNumerator(numerator * other.getNumerator());
      result.setDenominator(denominator * other.getDenominator());
    }
      
    return result;
  }

  public Fraction reciprocal() {
    simplify();
    
    Fraction result = new Fraction(0, 0);
    if (!undefined && numerator != 0) {
      result.setNumerator(denominator);
      result.setDenominator(numerator);
    }

    return result;
  }

  public Fraction divide(Fraction theOther) {
    simplify();
    theOther.simplify();

    return multiply(theOther.reciprocal());
  }

  public Fraction add(Fraction other) {
    simplify();
    other.simplify();
    Fraction result = new Fraction(0, 0);

    if (!undefined && !other.getUndefined()) {
      int common_denom = this.getDenominator() * other.getDenominator();
      result.setDenominator(common_denom);

      result.setNumerator(this.getNumerator() * other.getDenominator() +
      this.getDenominator() * other.getNumerator());
    }

    result.simplify();
    return result;
  }

  public Fraction subtract(Fraction other) {
    simplify();
    other.simplify();
    Fraction result = new Fraction(0, 0);

    if (!undefined && !other.getUndefined()) {
      int common_denom = this.getDenominator() * other.getDenominator();
      result.setDenominator(common_denom);

      result.setNumerator(this.getNumerator() * other.getDenominator() +
      this.getDenominator() * (other.getNumerator() * -1));
    }

    result.simplify();
    return result;
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
