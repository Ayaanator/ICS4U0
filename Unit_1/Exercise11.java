public class Exercise11 {
  public static void main(String[] args) {
    double length = 25;
    System.out.println(String.format("%s %.1f%s", "A square has a side of", length, "m"));
    System.out.println(String.format("%s %.1f %s", "Its area is", length*length, "sq m"));
    
    double recl = 10.3;
    double recw = 3;
    System.out.println(String.format("%s %.2f%s %.2f%s", "A rectangle has a length of", 
    recl, "m, and a height of", recw, "m"));
    System.out.println(String.format("%s %.2f%s", "Therefore, its perimeter is ", recw * 2 + recl * 2, "m"));
  }
}