public class Exercise7 {
  public static void main(String[] args) {
    System.out.println("123456789012345678901234567890");
    System.out.println(String.format("%-12s %8d", "One", 1));
    System.out.println(String.format("%-12s %8d", "Ten", 10));

    //System.out.println(String.format("%-19s %d", "One", 1));
    //System.out.println(String.format("%-18s %d", "Ten", 10));

    System.out.println(String.format("%-12s %8d", "One hundred", 100));
    System.out.println(String.format("%-12s %11.2f", "One hundred", 100.00));

    System.out.println(String.format("%-12s %10.1f", "Thousands", 3645.1));
    System.out.println(String.format("%-12s %12.3f", "Thousandths", 0.342));
    System.out.println();
    System.out.println(String.format("%-15s %s %6.2f", "Two hot dogs", "$", 3.45));
    System.out.println(String.format("%-15s %s %6.2f", "Two soft drinks", "$", 2.76));
    System.out.println(String.format("%-15s %s %6.2f", "Full meal", "$", 12.59));
  }
}