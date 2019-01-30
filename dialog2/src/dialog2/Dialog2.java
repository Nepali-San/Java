package dialog2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dialog2 {
    private static JDialog d;
    
    Dialog2(){
        JFrame  f = new JFrame();
        
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        
        /*
        d = new JDialog(f,"Dialog",true);
        d.setLayout(new FlowLayout());
        JButton b = new JButton("Yes");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dialog2.d.setVisible(false);
            }
        });
        d.add(new JLabel("Do you want to exit ???"));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
        */
        f.addWindowListener(new WindowAdapter() {
            @Override
            
        public void windowClosing(WindowEvent e) {
           d = new JDialog(f,"Dialog",true);
           d.setLayout(new FlowLayout());
           JButton b = new JButton("Yes");
           b.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
          });
          d.add(new JLabel("Do you want to exit ???"));
          d.add(b);
          d.setSize(300,300);
          d.setVisible(true);
            }
          });
   }
   
    public static void main(String[] args) {
        Dialog2 d2= new Dialog2();
    }
    
}
