public class SLink {
  private SNode head = null;
  private SNode tail = null;

  public SLink() {
    head = null;
    tail = null;
  }

  public void insertNode(SNode p) {
    if(head == null) {
      head = p;
      tail = p;
    } else if(p.getName().compareTo(head.getName()) < 0) {
      p.setNext(head);
      head = p;
    } else if(p.getName().compareTo(tail.getName()) > 0) {
      tail.setNext(p);
      tail = p;
    } else {
      SNode q = head;
      SNode r = head;

      while(p.getName().compareTo(q.getName()) >= 0) {
        r = q;
        q = q.getNext();
      }

      r.setNext(p);
      p.setNext(q);
    }
  }

  public SNode findNode(String name) {
    SNode p = head;
    for(; p != null && !name.equals(p.getName()); p = p.getNext());
    return p;
  }

  public void deleteNode(SNode p) {
    if(head != null && p != null) {
      if(head == tail) {
        head = null;
        tail = null;
      } else if(p == head) {
        head = p.getNext();
      } else {
        SNode q = null;
        for(q = head; q.getNext() != p; q = q.getNext());

        if(p == tail) {
          tail = q;
        }
        
        q.setNext(p.getNext());
      }
    }
  }

  public String toString() {
    String res = "";

    for(SNode p = head; p != null; p = p.getNext()) {
      res = res + p.toString();
    }

    return res;
  }
}
