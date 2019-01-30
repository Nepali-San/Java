//Simple Layout
package firstswing;
import javax.swing.*;
public class FirstSwing {

    public static void main(String[] args) {
        
       JFrame f         = new JFrame();               //creating the frame
       JButton b       = new JButton("Save");   //button name with label
       JLabel L          = new JLabel("Name");
       JTextField jt1 = new JTextField();
       JTextField jt2 = new JTextField();
       JLabel L2        = new JLabel("Address");
       
       b.setBounds(140,170,70,20);
       L.setBounds(80,100,100,40);
       jt1.setBounds(145,115,120,20);
       jt2.setBounds(145,135,120,20);
       L2.setBounds(80,120,100,40);
       f.setSize(400,500);
       
       f.add(b);                 //Adding button in frame
       f.add(jt1);
       f.add(jt2);
       f.add(L);
       f.add(L2);
       
       f.setLayout(null);
       f.setVisible(true);
       
    }
}
