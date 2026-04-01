public class MixedFraction extends Fraction {
  protected int whole = -1;

  public MixedFraction() {
    numerator = -1;
    denominator = -1;
    whole = -1;
    undefined = true;
  }

  public MixedFraction(int n, int d) {
    numerator = n;
    denominator = d;
    undefined = denominator == 0;
  }

  public MixedFraction(int n, int d, int w) {
    numerator = n;
    denominator = d;
    whole = w;
    undefined = denominator == 0;
  }

  public int getWhole() {return whole;}
  public void setWhole(int w) {this.whole = w;}

  public MixedFraction add(MixedFraction other) {
    MixedFraction result = new MixedFraction(0, 0, 0);
    if(!this.undefined && !other.getUndefined()) {
      Fraction f1 = new Fraction(this.whole * this.denominator + this.numerator, 
        this.denominator);

      Fraction f2 = new Fraction(other.getWhole() * other.getDenominator() + other.getNumerator(), 
        other.getDenominator());

      Fraction i_result = f1.add(f2);
      result = new MixedFraction(
        i_result.getNumerator() % i_result.getDenominator(), 
        i_result.getDenominator(), 
        i_result.getNumerator() / i_result.getDenominator());
    }

    result = result.simplify();
    return result;
  }

  public String toString() {
    if(undefined) return "undefined";
    else if (numerator == 0) return (whole > 0 ? whole + "" : "0");
    else if (denominator == 1) return "" + numerator;
    else return (whole > 0 ? whole + " " : "") + super.toString();
  }

  public MixedFraction simplify() {
    MixedFraction result = new MixedFraction(0, 0, 0);
    Fraction f1 = new Fraction(this.whole * this.denominator + this.numerator, 
        this.denominator);
    f1 = f1.simplify();
    result = new MixedFraction(
        f1.getNumerator() % f1.getDenominator(), 
        f1.getDenominator(), 
        f1.getNumerator() / f1.getDenominator());
    
    return result;
  }
}
