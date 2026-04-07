import java.util.Scanner;

public class Exercise14 {
  public static void main(String[] args) {
    String[] students = new String[41];
    FileIO.readFileIntoArray("students.txt", students);

    Scanner input = new Scanner(System.in);
    String search = "";

    //System.out.println(students[i]);
    boolean quit = false;

    do { 
      System.out.print("Enter text to search: ");
      search = input.nextLine();
      quit = search.equals("quit");

      if(!quit) {
        int counter = 0;

        for(int i = 0; i < 41; i++) {
          if(students[i].contains(search)) {
            counter++;
            System.out.print(students[i].substring(0, 9));
            System.out.print(" ");
            System.out.println(students[i].substring(9));
          }
        }
        System.out.println("Total found: " + counter);
        System.out.println();
      }
    } while (!quit);

    System.out.println("End of Program");
  }
}
