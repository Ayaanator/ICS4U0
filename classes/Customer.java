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

  public String toString(){
    return "Hello " + name + ", you have $" + balance + " in the account.";
  }
}
