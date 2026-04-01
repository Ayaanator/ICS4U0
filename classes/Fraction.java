public class Fraction {
  protected int numerator = -1;
  protected int denominator = -1;
  protected boolean undefined = true;

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
    Fraction simplified = new Fraction();
    simplified = this.simplify();
    this.numerator = simplified.getNumerator();
    this.denominator = simplified.getDenominator();
    
    if(undefined) return "undefined";
    else if (numerator == 0) return "0";
    else if (denominator == 1) return "" + numerator;
    else return numerator + "/" + denominator;
  }

  public Fraction multiply(Fraction other) {
    Fraction result = new Fraction(0, 0);

    if (!undefined && !other.getUndefined()) {
      result.setNumerator(numerator * other.getNumerator());
      result.setDenominator(denominator * other.getDenominator());
    }
    
    result = result.simplify();
    return result;
  }

  public Fraction reciprocal() {
    
    Fraction result = new Fraction();
    if (!undefined && numerator != 0) {
      result.setNumerator(denominator);
      result.setDenominator(numerator);
    }

    result = result.simplify();
    return result;
  }

  public Fraction divide(Fraction theOther) {
    Fraction result = multiply(theOther.reciprocal());
    result = result.simplify();
    return result;
  }

  public Fraction add(Fraction other) {
    Fraction result = new Fraction(0, 0);

    if (!undefined && !other.getUndefined()) {
      int common_denom = this.getDenominator() * other.getDenominator();
      result.setDenominator(common_denom);

      result.setNumerator(this.getNumerator() * other.getDenominator() +
      this.getDenominator() * other.getNumerator());
    }

    result = result.simplify();
    return result;
  }

  public Fraction subtract(Fraction other) {
    Fraction result = new Fraction(0, 0);

    if (!undefined && !other.getUndefined()) {
      int common_denom = this.getDenominator() * other.getDenominator();
      result.setDenominator(common_denom);

      result.setNumerator(this.getNumerator() * other.getDenominator() +
      this.getDenominator() * (other.getNumerator() * -1));
    }

    result = result.simplify();
    return result;
  }

  public Fraction simplify() {
    Fraction result = new Fraction();
    boolean negNum = numerator < 0;
    boolean negDen = denominator < 0;

    int absNum = Math.abs(numerator);
    int absDen = Math.abs(denominator);
    int smallest = absNum > absDen ? absDen : absNum;

    for(int i = 1; i <= smallest + 1; i++) {
      if(absNum % i == 0 && absDen % i == 0) {
        result.setNumerator(absNum / i);
        result.setDenominator(absDen / i);
      }
    }

    result.setNumerator(result.getNumerator() * (negNum ? -1 : 1));
    result.setDenominator(result.getDenominator() * (negDen ? -1 : 1));

    return result;
  }
}