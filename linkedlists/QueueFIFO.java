public class QueueFIFO {
  private SNode head = null;
  private SNode tail = null;

  public SNode getHead() {return head;}
  public SNode getTail() {return tail;}
  public boolean empty() {return head == null;}

  public QueueFIFO() {
    head = null;
    tail = null;
  }

  public void addAtEnd(SNode p) {
    if(head == null) {
      head = p;
      tail = p;
    } else {
      tail.setNext(p);
      tail = p;
    }
  }

  public void removeFromFront() {
    if(head != null) {
      if(head == tail) {
        tail = null;
      }
      head = head.getNext();
    }
  }

  public String toString() {
    String result = "";

    for(SNode r = head; r != null; r = r.getNext()) {
      result = result + r.toString();
    }
      
    return result;
  }
}