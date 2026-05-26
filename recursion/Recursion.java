public class Recursion {
  public static long factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  public static long fibonacci(int n) {
    if(n == 1) {
      return 1;
    } else if (n == 2) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static int pascalTerm(int row, int col) {
    if(col == 0) {
      return 1;
    } else if(row == col) {
      return 1;
    } else {
      return pascalTerm(row - 1, col - 1) + pascalTerm(row - 1, col);
    }
  }

  public static void pascalTriangle(int n) {
    for(int i = 0; i < n; i++) {
      for(int j = 0; j <= i; j++) {
        //System.out.print("\t");
        System.out.print(String.format("%d ", pascalTerm(i, j)));
      }

      System.out.println();
    }
  }

  public static void main(String[] args) {
    pascalTriangle(5);
  }
}
