public class SNode {
  private String name = "";
  private SNode next = null;

  public SNode() {
    name = "";
    next = null;
  }

  public SNode(String n) {
    name = n;
    next = null;
  }

  public SNode(String n, SNode nx) {
    name = n;
    next = nx;
  }

  public String getName() { return name; }
  public SNode getNext() { return next; }

  public void setName(String n) { name = n; }
  public void setNext(SNode nx) { next = nx; }

  public String toString() {return "Name: " + name + "\n";}
}
