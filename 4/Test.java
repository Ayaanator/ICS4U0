

public class Test {

  public static void main(String[] args) {
    String s = "ann";
    String h = "annieeeee";
    String t = "abcdefgabcdefga";

    System.out.println(s.compareTo(h));
    System.out.println(t.indexOf('a', t.indexOf('a', t.indexOf('a') + 1) + 1));

    s = "ann";
    h = "anaie";
    //h = "annieeeee";

    System.out.println(h.substring(0, h.length() - 1));
    //System.out.println(h.indexOf("nie"));
  }
}
