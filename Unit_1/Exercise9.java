public class Exercise9 {
  public static void main(String[] args) {
    System.out.println("12345678901234567890123456789012345678901234567");
    System.out.println(String.format("%s %12s %7s %7s %8s", "Student #", "Quiz 1", "Quiz 2", "Quiz 3", "Average"));
    
    System.out.println(String.format("%s %12s %7s %7s %8s", "323144324", "67%", "70%", "78%", "71.67%"));
    System.out.println(String.format("%s %12s %7s %7s %8s", "324435007", "89%", "73%", "86%", "82.67%"));
    System.out.println(String.format("%s %12s %7s %7s %8s", "375842516", "67%", "64%", "58%", "63.00%"));
    System.out.println(String.format("%s %12s %7s %7s %8s", "300644535", "95%", "67%", "75%", "79.00%"));
    
    System.out.println("-----------------------------------------------");
    System.out.println(String.format("%47s", "Class average 74.08%"));
  }
}