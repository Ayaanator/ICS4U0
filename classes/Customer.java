public class Customer {
  private String name = "";
  private String id = "";
  private double balance = 0.0;
  private boolean residesInGTA = false;

  public Customer(String n, String i, double b, boolean r) {
    name = n;
    id = i;
    balance = b;
    residesInGTA = r;
  }

  public String getName() { return name; }
  public void setName(String n) { name = n; }
  public void setId(String i) { id = i; }
  public void setBalance(double b) { balance = b; }
  public void setResidesInGTA() { residesInGTA = balance < 100000; }

  public String toString(){
    return "Hello " + name + ", you have $" + balance + " in the account.";
  }
}
