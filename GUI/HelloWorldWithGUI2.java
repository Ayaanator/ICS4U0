import java.awt.event.*;
import javax.swing.*;

public class HelloWorldWithGUI2 implements ActionListener {
  final static String LABEL_TEXT = "Hello, world!";
  JFrame frame;
  JPanel contentPane;
  JLabel label;
  JButton button;

  public HelloWorldWithGUI2() {
    frame = new JFrame("HelloWorldWithGUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    contentPane = new JPanel();
    label = new JLabel(LABEL_TEXT);
    contentPane.add(label);

    button = new JButton("Hide");
    button.setActionCommand("Hide");
    button.addActionListener(this);

    contentPane.add(button);

    frame.setContentPane(contentPane);
    frame.pack();
    frame.setVisible(true);
    
  }

  public void actionPerformed(ActionEvent event) {
    String eventName = event.getActionCommand();

    if(eventName.equals("Hide")) {
      label.setText(" ");
      button.setText("Show");
      button.setActionCommand("Show");
    } else {
      label.setText(LABEL_TEXT);
      button.setText("Hide");
      button.setActionCommand("Hide");
    }
  }

  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    HelloWorldWithGUI2 helloFrame = new HelloWorldWithGUI2();
  }
}
