import java.awt.event.*;
import javax.swing.*;

public class Clicks implements ActionListener {
  public static int clicks = 0;
  JFrame frame;
  JPanel contentPane;
  JLabel label;
  JButton button;

  public Clicks() {
    frame = new JFrame("HelloWorldWithGUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    contentPane = new JPanel();
    label = new JLabel("0");
    contentPane.add(label);

    button = new JButton("Click");
    button.setActionCommand("Click");
    button.addActionListener(this);

    contentPane.add(button);

    frame.setContentPane(contentPane);
    frame.pack();
    frame.setVisible(true);
    
  }

  public void actionPerformed(ActionEvent event) {
    String eventName = event.getActionCommand();

    if(eventName.equals("Click")) {
      clicks++;
      label.setText("" + clicks);
    } 
  }

  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    Clicks clicks = new Clicks();
  }
}
