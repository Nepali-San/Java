
package todaytask2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Todaytask2 {

    public static void main(String[] args) {
        
      JFrame f = new JFrame("Basic Calculator");
      
      JLabel label1 = new JLabel("First number");
      label1.setBounds(40,40,100,20);
      f.add(label1);
      
      final  JTextField tf1 = new JTextField();
      tf1.setBounds(40,60,100,20);
      f.add(tf1);      
      
      JLabel label2 = new JLabel("Second number");
      label2.setBounds(180,40,120,20);
      f.add(label2);            
      
      final JTextField tf2 = new JTextField();
      tf2.setBounds(180,60,120,20);
      f.add(tf2); 
      
      JButton addb  = new JButton("Add");
      addb.setBounds(120,100,100,30);
      f.add(addb);
      
      JButton subb = new JButton("Subtract");
      subb.setBounds(120,130,100,30);
      f.add(subb);
      
      JButton mulb = new JButton("Multiply");
      mulb.setBounds(120,160,100,30);
      f.add(mulb);
            
      JButton divb = new JButton("Divide");
      divb.setBounds(120,190,100,30);
      f.add(divb);  
      
       final JLabel label = new JLabel("Output :");
       label.setBounds(120,230,100,30);
       f.add(label);
       
      final JLabel labelans = new JLabel("0");
      labelans.setBounds(220,230,100,30);
      f.add(labelans);
      
       addb.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               String temp = tf1.getText();
               if("".equals(temp)) temp = "0";
               int num1 = Integer.valueOf(temp);
               String temp2 = tf2.getText();
               if("".equals(temp2)) temp2 = "0";
               int num2  = Integer.valueOf(temp2);
               int sum = num1 + num2;
               String s = String.valueOf(sum);
               labelans.setText(s);
           }
       });
       
       //Same as above one (addb) but using lamda expression
       
             subb.addActionListener((ActionEvent ae) -> {
                 String temp = tf1.getText();
                 if("".equals(temp)) temp = "0";
                 long num1 = Integer.valueOf(temp);
                 String temp2 = tf2.getText();
                 if("".equals(temp2)) temp2 = "0";
                 long num2  = Integer.valueOf(temp2);
                 long sum = num1 - num2;
                 String s = String.valueOf(sum);
                 labelans.setText(s);
       });
      
              
                     mulb.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               String temp = tf1.getText();
               if("".equals(temp)) temp = "0";
               int num1 = Integer.valueOf(temp);
               String temp2 = tf2.getText();
               if("".equals(temp2)) temp2 = "0";
               int num2  = Integer.valueOf(temp2);
               int sum = num1 * num2;
               String s = String.valueOf(sum);
               labelans.setText(s);
           }
       });
                     
       divb.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              String temp = tf1.getText();
              if("".equals(temp)) temp = "0";
              int num1 = Integer.valueOf(temp);
              String temp2 = tf2.getText();
              if("".equals(temp2)) temp2 = "1";
             
              int num2 = Integer.valueOf(temp2);
              try{
                int sum = num1/num2;
                String s = String.valueOf(sum);
                labelans.setText(s);
              }
              catch(Exception err){
                  labelans.setText("error");
              }
              
              
          }
      });

       
      f.setSize(400,400);
      f.setLayout(null);
      f.setVisible(true);
      
         f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
}