package swicheckboxes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class SwiCheckBoxes {
    
    
    SwiCheckBoxes(){
        JFrame f = new JFrame("Checkbox example");        
        JCheckBox Ustatus =  new JCheckBox("Already have an account");
        Ustatus.setBounds(70,150,590,50);
        JLabel username = new JLabel("Username");
        username.setBounds(65,40,110,40);
        JLabel password = new JLabel("Password");
        password.setBounds(65,70,110,40);                
        JButton b = new JButton();
        b.setBounds(90,120,80,30);                
        if(Ustatus.isSelected()){
            b.setText("Sign In");
        }
        else{
            b.setText("Sign UP");
        }        
        JTextField tf1 = new JTextField();
        tf1.setBounds(135,50,110,20);                
        JTextField tf2 = new JTextField();
        tf2.setBounds(135,80,110,20);                
        f.add(Ustatus);
        f.add(username);
        f.add(password);
        f.add(b);
        f.add(tf2);
        f.add(tf1);
        f.add(b);        
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });

        b.addActionListener(new ActionListener() {
            @Override
        
            public void actionPerformed(ActionEvent e) {
                JFrame signin = new JFrame("Sign In");
                JFrame signup = new JFrame("Sign Up");
                if("Sign In".equals(b.getText())){
                    signin.setSize(300,300);
                    signin.setLayout(null);
                    signin.setVisible(true);
                }
                else{
                    signup.setSize(300,300);
                    signup.setLayout(null);
                    signup.setVisible(true);
                }
            }
        });  
        
         Ustatus.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                b.setText((e.getStateChange() == 1 ? "Sign In":"Sign Up"));
            }
        });       
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);    
    }

    public static void main(String[] args) {
        SwiCheckBoxes s = new SwiCheckBoxes();
    }
    
}