

public class LinkedLists {
  public static void main(String[] args) {


    SLink list = new SLink();
    /*SNode p = new SNode("Bob");
    list.insertNode(p);
    p = new SNode("Ana");
    list.insertNode(p);
    p = new SNode("Tom");
    list.insertNode(p);
    p = new SNode("Ray");
    list.insertNode(p);
    p = new SNode("Kay");
    list.insertNode(p);*/

    /*QueueFIFO queue = new QueueFIFO();
    SNode p = new SNode("Ray");
    queue.addAtEnd(p);
    p = new SNode("Jay");
    queue.addAtEnd(p);
    p = new SNode("Lucille");
    queue.addAtEnd(p);

    while(!queue.empty()) {
      System.out.println(queue);
      queue.removeFromFront();
    }*/

    /*SLink[] lists = new SLink[4];
    for(int i = 0; i < lists.length; i++) {
      lists[i] = new SLink();
    }

    SNode p = new SNode("Negan");
    lists[0].insertNode(p);
    p = new SNode("Hunter");
    lists[0].insertNode(p);

    p = new SNode("Abdullah");
    lists[1].insertNode(p);

    for(int i = 0; i < lists.length; i++) {
      System.out.println(i + 1 + " :\n" + lists[i]);
    }*/

    SNode p = new SNode("Ana");
    list.insertNode(p);
    p = new SNode("Mario");
    list.insertNode(p);
    p = new SNode("Lucille");
    list.insertNode(p);
    p = new SNode("Andrew");
    list.insertNode(p);
    p = new SNode("Fred");
    list.insertNode(p);
    p = new SNode("Arthur");
    list.insertNode(p);
    p = new SNode("James");
    list.insertNode(p);
    p = new SNode("Argall");
    list.insertNode(p);

    System.out.println(list);

    p = list.findNode("Argall");
    list.deleteNode(p);
    System.out.println(list);
  }
}
