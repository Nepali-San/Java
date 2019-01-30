
package jopt2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class Jopt2 extends WindowAdapter {
    JFrame f;
    
    Jopt2(){
        
        f = new JFrame();
        
        JLabel l = new JLabel();
        l.setText("Welcome");
        l.setBounds(130,40,60,60);
        f.add(l);
        
        JButton b  = new JButton();
        b.setText("click");
        b.setBounds(110,130,80,30);
        f.add(b);
        
        JLabel l2 = new JLabel();
        l2.setBounds(130,90,100,30);
        f.add(l2);
        
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                
                int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
                if(a==JOptionPane.YES_OPTION){  
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                }
                else  f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
            }            
        });
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name;
                name = JOptionPane.showInputDialog(f,"Enter Name");
                if(name == null){
                    l2.setText("No data entered");
                }
                else l2.setText(name);
            }
        });
        
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        Jopt2 jopt2 = new Jopt2();       
    }
}
