
package swingbcalcuimplementaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SwingBCalcuImplementAction implements ActionListener{
        
    
    JFrame f;
    JButton addb,subb,mulb,divb;
    final JTextField tf1,tf2;
    JLabel label1,label2,label,labelans;
    SwingBCalcuImplementAction(){
        f = new JFrame("Basic Calculator");
      
      label1 = new JLabel("First number");
      label1.setBounds(40,40,100,20);
      f.add(label1);
      
      tf1 = new JTextField();
      tf1.setBounds(40,60,100,20);
      f.add(tf1);      
      
      label2 = new JLabel("Second number");
      label2.setBounds(180,40,120,20);
      f.add(label2);            
      
      tf2 = new JTextField();
      tf2.setBounds(180,60,120,20);
      f.add(tf2); 
      
      addb  = new JButton("Add");
      addb.setBounds(120,100,100,30);
      f.add(addb);
      
      subb = new JButton("Subtract");
      subb.setBounds(120,130,100,30);
      f.add(subb);
      
      mulb = new JButton("Multiply");
      mulb.setBounds(120,160,100,30);
      f.add(mulb);
            
      divb = new JButton("Divide");
      divb.setBounds(120,190,100,30);
      f.add(divb);  
      
       label = new JLabel("Output :");
       label.setBounds(120,230,100,30);
       f.add(label);
       
      labelans = new JLabel("0");
      labelans.setBounds(220,230,100,30);
      f.add(labelans);
      
      
      addb.addActionListener(this);
      subb.addActionListener(this);
      mulb.addActionListener(this);
      divb.addActionListener(this);
       
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
    
    public static void main(String[] args) {
       SwingBCalcuImplementAction s = new SwingBCalcuImplementAction(); //this constructor calls frame
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   
        if(e.getSource() == addb){
               String temp = tf1.getText();
               if("".equals(temp)) temp = "0";
               float num1 = Float.valueOf(temp);
               String temp2 = tf2.getText();
               if("".equals(temp2)) temp2 = "0";
               float num2  = Float.valueOf(temp2);
               float sum = num1 + num2;
               String s = String.valueOf(sum);
               labelans.setText(s);
        }
        else if(e.getSource() == mulb){
                String temp = tf1.getText();
                 if("".equals(temp)) temp = "0";
                 float num1 = Float.valueOf(temp);
                 String temp2 = tf2.getText();
                 if("".equals(temp2)) temp2 = "0";
                 float num2  = Float.valueOf(temp2);
                 float sum = num1 * num2;
                 String s = String.valueOf(sum);
                 labelans.setText(s);
        }
        else if(e.getSource() == subb){
             String temp = tf1.getText();
               if("".equals(temp)) temp = "0";
               float num1 = Float.valueOf(temp);
               String temp2 = tf2.getText();
               if("".equals(temp2)) temp2 = "0";
               float num2  = Float.valueOf(temp2);
               float sum = num1 - num2;
               String s = String.valueOf(sum);
               labelans.setText(s);
        }
        else{
            String temp = tf1.getText();
              if("".equals(temp)) temp = "0";
              float num1 = Float.valueOf(temp);
              String temp2 = tf2.getText();
              if("".equals(temp2)) temp2 = "1";
             
              float num2 = Float.valueOf(temp2);
              try{
                float sum = num1/num2;
                String s = String.valueOf(sum);
                labelans.setText(s);
              }
              catch(Exception err){
                  labelans.setText("error");
              }
              
              
          }
    }
}
