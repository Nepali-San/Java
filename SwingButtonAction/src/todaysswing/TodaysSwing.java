//This program takes a input  from the text field and print it ....
package todaysswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TodaysSwing{

    public static void main(String[] args) {
        
       JFrame f    = new JFrame("Setting Button Action");               //creating the frame with title
       
       final JTextField tf = new JTextField();                             //create , setbounds and add
       tf.setBounds(50,70,100,20);
       f.add(tf);
        
       final JLabel label = new JLabel("Output : ");
       label.setBounds(50,110,90,20);
       f.add(label);
       
       JLabel ans = new JLabel("______");
       ans.setBounds(110,110,100,20);
       f.add(ans);
       
       JButton b       = new JButton("Click Here");                             //button name with label
       b.setBounds(50,140,105,30);
       f.add(b); 
       
       b.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
                    String temp = tf.getText();
                    ans.setText(temp);
           }
       });
      
       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);
    }
}