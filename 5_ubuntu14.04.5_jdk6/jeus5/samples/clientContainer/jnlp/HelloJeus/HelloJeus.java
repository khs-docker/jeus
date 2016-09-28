import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;


public class HelloJeus
{
   public static void main(String[] args)
   {
      new HelloJeusFrame();
   }
}


class HelloJeusFrame extends JFrame
{
   JLabel label = new JLabel("Hello Jeus");

   public HelloJeusFrame()
   {
      label.setFont(new Font("Helevetica", Font.BOLD, 70));
      getContentPane().setLayout(new BorderLayout());
      getContentPane().add(label, BorderLayout.CENTER);
      setSize(500, 250);
      setVisible(true);
   }
}
