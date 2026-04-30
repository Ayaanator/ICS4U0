import javax.swing.*;

public class HelloWorldWithGUI1 {
  final static String LABEL_TEXT = "Hello, world!";
  JFrame frame;
  JPanel contentPane;
  JLabel label;

  public HelloWorldWithGUI1() {
    frame = new JFrame("HelloWorldWithGUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    contentPane = new JPanel();
    label = new JLabel(LABEL_TEXT);
    contentPane.add(label);

    frame.setContentPane(contentPane);
    frame.pack();
    frame.setVisible(true);
  }

   public static void main(String[] args) {
      JFrame.setDefaultLookAndFeelDecorated(true);
      HelloWorldWithGUI1 helloFrame = new HelloWorldWithGUI1();
    }
}
