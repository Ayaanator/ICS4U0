import hsa.Console;
import java.awt.*;


public class GuessingGame {
  public static void main(String[] args) {
    Console c = new Console();
    int mx = c.maxx();
    int my = c.maxy();

    int max_x = 100;

    int numToGuess = (int)(Math.random() * max_x);
    
    int tries = 0;
    int guess = -1;

    int ly = my - (my / 3);
    //numToGuess = 3;

    c.setColor(Color.black);
    c.drawLine(0, ly, mx, ly);

    c.setColor(Color.red);
    //int gx = (int)Math.round(((double)mx * (double)numToGuess/(double)max_x));
    double p = (double)numToGuess/(double)max_x;
    int gx = (int)((p * (mx + 1)) - 1);

    //((double)mx * (double)numToGuess/(double)max_x)
    c.drawLine(gx, ly - 25, gx, ly + 25);
    
    c.setColor(Color.red);
    c.drawLine(20, 20, 60, 60);
    c.setColor(Color.blue);
    c.drawLine(20, 20, 60, 60);


    c.setColor(Color.red);
    c.drawLine(70, 40, 70, 110);
    c.setColor(Color.blue);
    c.drawLine(70, 40, 70, 110);

    while(guess != numToGuess) {
      c.print("Enter number to guess: ");
      guess = c.readInt();
      tries++;
      int ggx = 0;

      if(guess < numToGuess) {
        c.print("Your guess is too low. Try a larger number.\n");

        double pp = (double)guess/(double)max_x;
        ggx = (int)((pp * (mx + 1)) - 1);

        // ggx = (int)Math.round(((double)mx * (double)guess/(double)max_x));

        c.drawLine(ggx, ly - 25, ggx, ly + 25);
      } else if(guess > numToGuess) {
        c.print("Your guess is too high. Try a smaller number.\n");

        double pp = (double)guess/(double)max_x;
        ggx = (int)((pp * (mx + 1)) - 1);

        //ggx = (int)Math.round(((double)mx * (double)guess/(double)max_x));
        c.drawLine(ggx, ly - 25, ggx, ly + 25);
      }

      c.setColor(Color.blue);
      c.print(gx + "\n");
      c.print(ggx + "\n");

      if(guess == numToGuess) {
        // ggx = (int)Math.round(((double)mx * (double)guess/(double)max_x));

        double pp = (double)guess/(double)max_x;
        ggx = (int)((pp * (mx + 1)) - 1);

        c.drawLine(gx, ly - 25, gx, ly + 25);
        c.print("You guessed in " + tries + (tries > 1 ?" tries." : " try."));
        c.print("guess: " + guess + " numGuess: "  + numToGuess); 
      }
    }
  }
}
