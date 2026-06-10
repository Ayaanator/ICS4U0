public class LinkedLists {
  public static void main(String[] args) {


    SLink list = new SLink();
    SNode p = new SNode("Bob");
    list.insertNode(p);
    p = new SNode("Ana");
    list.insertNode(p);
    p = new SNode("Tom");
    list.insertNode(p);
    p = new SNode("Ray");
    list.insertNode(p);
    p = new SNode("Kay");
    list.insertNode(p);

    System.out.println(list);
  }
}
