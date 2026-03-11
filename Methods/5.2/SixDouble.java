public class SixDouble {

  public static String derivative(String monomial) {
    int xPos = monomial.indexOf('x');
    int caretPos = monomial.indexOf('^');

    String coefStr = monomial.substring(0, xPos);
    double coefficient;

    if (coefStr.equals("-")) {
      coefficient = -1.0;
    } else if (coefStr.equals("")) {
      coefficient = 1.0;
    } else {
      coefficient = Double.parseDouble(coefStr);
    }

    String expStr = monomial.substring(caretPos + 1);
    double exponent = Double.parseDouble(expStr);

    double newCoefficient = coefficient * exponent;
    double newExponent = exponent - 1;

    if (newExponent == 1) {
      return newCoefficient + "x";
    } else if (newExponent == 0) {
      return String.valueOf(newCoefficient);
    } else {
      return newCoefficient + "x^" + newExponent;
    }
  }

  public static void main(String[] args) {
    System.out.println(derivative("-4x^3"));
    System.out.println(derivative("5x^2"));
    System.out.println(derivative("x^4"));
    System.out.println(derivative("-x^5"));
    System.out.println(derivative("3.5x^2.5"));
  }
}