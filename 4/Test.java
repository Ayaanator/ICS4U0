

public class Test {

  public static void main(String[] args) {
    String s = "ann";
    String h = "annieeeee";
    String t = "abcdefgabcdefga";

    System.out.println(s.compareTo(h));
    System.out.println(t.indexOf('a', t.indexOf('a', t.indexOf('a') + 1) + 1));

    s = "ban";
    h = "dad";
    h = "annieeeee";

    System.out.println(s.compareTo(h));
    System.out.println(h.indexOf("nie"));
  }
}
