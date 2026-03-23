public class Fruit {
  private String name;
  private String origin;  
  private double price;

  public Fruit() {
    name = "N/A";
    origin = "N/A";
    price = -1;
  }

  public Fruit(String n, String o, double p) {
    name = n;
    origin = o;
    price = p;
  }

  public String toString() {
    return "Name: " + name + "\n" + 
    "Origin: " + origin + "\n" +
    "Price: " + price;
  }

  public String getName() {return name;}
  public String getOrigin() {return origin;}
  public double getPrice() {return price;}

  public void setName(String n) {name = n;}
  public void setOrigin(String o) {origin = o;}
  public void setPrice(double p) {price = p;}
}
