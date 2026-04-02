public class MixedNumber extends Fraction {
  protected int whole = -1;

  public MixedNumber() {
    super();
    whole = -1;
  }

  public MixedNumber(int n, int d, int w) {
    super(n, d);
    whole = w;
  }

  public int getWhole() {return whole;}
  public void setWhole(int w) {this.whole = w;}

  public MixedNumber add(MixedNumber other) {
    MixedNumber result = new MixedNumber(0, 0, 0);
    if(!this.undefined && !other.getUndefined()) {
      Fraction improper = new Fraction(whole * denominator + numerator, 
        denominator);

      Fraction otherImproper = new Fraction(other.getWhole() * other.getDenominator() + other.getNumerator(), 
        other.getDenominator());

      Fraction improperResult = improper.add(otherImproper);
      
      result = new MixedNumber(
        improperResult.getNumerator() % improperResult.getDenominator(), 
        improperResult.getDenominator(), 
        improperResult.getNumerator() / improperResult.getDenominator());

      result.setWhole(improperResult.getNumerator() / improperResult.getDenominator());
      result.setNumerator(improperResult.getNumerator() % improperResult.getDenominator());
      result.setDenominator(improperResult.getDenominator());
    }

    return result;
  }

  public String toString() {
    if(undefined) return "undefined";
    else if (numerator == 0) return (whole > 0 ? whole + "" : "0");
    else if (denominator == 1) return "" + numerator;
    else return (whole > 0 ? whole + " " : "") + super.toString();
  }

  public MixedNumber simplify() {
    MixedNumber result = new MixedNumber(0, 0, 0);
    Fraction f1 = new Fraction(this.whole * this.denominator + this.numerator, 
        this.denominator);
    f1 = f1.simplify();
    result = new MixedNumber(
        f1.getNumerator() % f1.getDenominator(), 
        f1.getDenominator(), 
        f1.getNumerator() / f1.getDenominator());
    
    return result;
  }
}
