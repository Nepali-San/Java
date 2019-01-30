
package jopt;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Jopt {

    Jopt(){
        JFrame f = new JFrame("hello");
        
        JOptionPane.showMessageDialog(f,"Continue");            
        String s = JOptionPane.showInputDialog(f,"enter name");
        
        JButton b = new JButton();
        b.setText("text");
        b.setBounds(100,140,80,40);
        f.add(b);
        
        JTextField tf = new JTextField();
        tf.setText("Welcome "+s);
        tf.setBounds(100,70,100,30);
        f.add(tf);
        
        JLabel l = new JLabel();
        l.setText("label");
        l.setBounds(100,90,100,40);
        f.add(l);
        
        JMenu m = new JMenu("Menu");
        JMenuItem i1,i2,i3;
      
        i1 = new JMenuItem("i1");
        i2 = new JMenuItem("i2");
        i3 = new JMenuItem("i3");
        
        JMenuBar bar = new JMenuBar();
        
        m.add(i1);
        m.add(i2);
        m.add(i3);
        
        bar.add(m);
        
        f.setJMenuBar(bar);
        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               tf.setText("i1 clicked");
            }
        });
        
               JDialog d = new JDialog(f,"dialog",true);
               d.add(new JLabel("Do u want to exit"));
               
               JButton b2  = new JButton("yes");
               d.add(b2);
               
               b2.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       //close when button clicked
                       System.exit(0);   
                   }
               });
               d.setSize(300,100);
               d.setLayout(new FlowLayout());
               
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf.getText();
                l.setText(s);
            }
        });
        
        
        
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {                              
//               JDialog d = new JDialog(f,"dialog",true);
//               d.add(new JLabel("Do u want to exit"));
//               
//               JButton b2  = new JButton("yes");
//               d.add(b2);
//               
//               b2.addActionListener(new ActionListener() {
//                   @Override
//                   public void actionPerformed(ActionEvent e) {
//                       //close when button clicked
//                       System.exit(0);   
//                   }
//               });
//               d.setSize(300,100);
//               d.setLayout(new FlowLayout());
               d.setVisible(true);                //else create entire dialog box here along with required button                             
            }
        });        
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        Jopt j = new Jopt();
    }
}