public class Book {
  private String name;
  private String ISBN;  
  private String author;

  public Book() {
    name = "N/A";
    ISBN = "N/A";
    author = "N/A";
  }

  public Book(String n, String i, String a) {
    name = n;
    ISBN = i;
    author = a;
  }

  public String toString() {
    return "Name: " + name + "\n" + 
    "ISBN: " + ISBN + "\n" +
    "Author: " + author;
  }
}
