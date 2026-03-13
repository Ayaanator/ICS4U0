
public class Six {
  public static String derivative(String monomial) {
    int xPos = monomial.indexOf('x');
    int caretPos = monomial.indexOf('^');

    String coefStr = monomial.substring(0, xPos);
    int coefficient;
    if (coefStr.equals("-")) {
      coefficient = -1;
    } else if (coefStr.equals("")) {
      coefficient = 1;
    } else {
      coefficient = Integer.parseInt(coefStr);
    }

    String expStr = monomial.substring(caretPos + 1);
    int exponent = Integer.parseInt(expStr);

    int newCoefficient = coefficient * exponent;
    int newExponent = exponent - 1;
    String result = "";

    if (newExponent == 1) {
      result = newCoefficient + "x";
    } else if (newExponent == 0) {
      result = String.valueOf(newCoefficient);
    } else {
      result = newCoefficient + "x^" + newExponent;
    }

    return result;
  }
  public static void main(String[] args) {
    System.out.println(derivative("-4x^3"));
    System.out.println(derivative("5x^2"));
    System.out.println(derivative("x^4"));
    System.out.println(derivative("-x^5"));
    System.out.println(derivative("-x^2"));
  }
}
