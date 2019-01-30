package todaytask3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Todaytask3 {
    
    static int status;  //This variable is used to choose the textfield to insert
    static int dpoint1 = 0,dpoint2 = 0; //to inspect the no. of decimal points in input

    public static void main(String[] args) {

    
    final Color LIGHT_RED = new Color(0,255,127);       //color of our output
    final Color LIGHT_BLUE = new Color(51,204,255);     //color of selected textfield(tf)
        
      JFrame f = new JFrame("Basic Calculator");
      
      // these are the contents that we add in our frame
      JLabel label1,label2,label;
      final JTextField tf1,tf2,ans;
      JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,addb,subb,divb,mulb,clrb,toogle,del,dpoint;
      
      
      label1 = new JLabel("First number"); //describing our label - label1
      label1.setBounds(50,40,100,20);
      f.add(label1);
      
      tf1 = new JTextField();            //describing our textfields - tf1
      tf1.setBounds(50,60,100,20);
      tf1.setBackground(LIGHT_BLUE);
      f.add(tf1);      
      
      label2 = new JLabel("Second number");
      label2.setBounds(180,40,120,20);
      f.add(label2);            
      
      tf2 = new JTextField();
      tf2.setBounds(180,60,120,20);
      f.add(tf2); 
       
       label = new JLabel("Output :");
       label.setBounds(50,340,100,40);
       f.add(label);
       
//       tf1 = new JTextField();  <- restricted by the final to change it's value (class)
       
      
      tf1.setEditable(false);   
      tf2.setEditable(false);
      
      
      
      ans = new  JTextField();
      ans.setBounds(110,345,110,30);
      ans.setEditable(false);
      ans.setBackground(LIGHT_RED);
      f.add(ans);
      
      //keypad for numbers ( describing each button in frame)
      b1 = new JButton("1");
      b1.setBounds(50,100,50,30);
      f.add(b1);
      
      b2 = new JButton("2");
      b2.setBounds(110,100,50,30);
      f.add(b2);
      
      b3 = new JButton("3");
      b3.setBounds(170,100,50,30);
      f.add(b3);
            
      addb  = new JButton("+");
      addb.setBounds(250,100,50,30);
      f.add(addb);
      
      b4 = new JButton("4");
      b4.setBounds(50,150,50,30);
      f.add(b4);
      
      b5 = new JButton("5");
      b5.setBounds(110,150,50,30);
      f.add(b5);
      
      b6 = new JButton("6");
      b6.setBounds(170,150,50,30);
      f.add(b6);
      
      subb = new JButton("-");
      subb.setBounds(250,150,50,30);
      f.add(subb);
      
      b7 = new JButton("7");
      b7.setBounds(50,200,50,30);
      f.add(b7);
      
      b8 = new JButton("8");
      b8.setBounds(110,200,50,30);
      f.add(b8);
      
      b9 = new JButton("9");
      b9.setBounds(170,200,50,30);
      f.add(b9);
      
      mulb = new JButton("*");
      mulb.setBounds(250,200,50,30);
      f.add(mulb);
      
      dpoint = new JButton(".");
      dpoint.setBounds(170,250,50,30);
      f.add(dpoint);
      
      b0 = new JButton("0");
      b0.setBounds(110,250,50,30);
      f.add(b0);
      
      divb = new JButton("/");
      divb.setBounds(250,250,50,30);
      f.add(divb);
      
      toogle = new JButton("Toogle");
      toogle.setBounds(50,300,170,30);
      f.add(toogle);
      
      clrb = new JButton("C");
      clrb.setBounds(50,250,50,30);
      f.add(clrb);
      
      del = new JButton("<");
      del.setBounds(250,300,50,30);
      f.add(del);
      
      //addActionListener helps to do something from the click of our button (i.e functioning the button click)
      
      dpoint.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(status == 0 && dpoint1 < 1){
                dpoint1++;
                String temp = tf1.getText();
                tf1.setText(temp+".");
              }
            else if(status == 1 && dpoint2 < 1){
                dpoint2++;
                  String temp = tf2.getText();
                  tf2.setText(temp+".");
              }
        }
    });
      
      del.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
         if(0 == status)  {
             
             String s = tf1.getText();  //getting the text in tf1
            
             if(s.equals("")) return;   //if nothing just return ,else delete last character
             if(s.charAt(s.length() -1 ) == '.') dpoint1 = 0;
             String newString = s.substring(0,s.length()-1);  //deleting the last character
             tf1.setText(newString);   //putting the updated text back
         } 
         else{
           String s = tf2.getText();  //similar for tf2
             
             if(s.equals("")) return;
             if(s.charAt(s.length() -1 ) == '.') dpoint2 = 0;
             String newString = s.substring(0,s.length()-1);
             tf2.setText(newString);
         }
        }
    });
      
        //ActionListener is abstract method so we override it and define it's body ourself
        
           b1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
              if(status == 0){
                String temp = tf1.getText();
                tf1.setText(temp+"1");
              }
              else{
                  String temp = tf2.getText();
                  tf2.setText(temp+"1");
              }
              
           }
       });
           
           b2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
              if(status == 0){
                String temp = tf1.getText();   //get text and append the button number
                tf1.setText(temp+"2");       
              }
              else{
                  String temp = tf2.getText();
                  tf2.setText(temp+"2");
              }
           }
       });
           
           b3.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
              if(status == 0){
                String temp = tf1.getText();
                tf1.setText(temp+"3");
              }
              else{
                  String temp = tf2.getText();
                  tf2.setText(temp+"3");
              }
           }
       });
           
           b4.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
              if(status == 0){
                String temp = tf1.getText();
                tf1.setText(temp+"4");
              }
              else{
                  String temp = tf2.getText();
                  tf2.setText(temp+"4");
              }
           }
       });
           
           b5.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
              if(status == 0){
                String temp = tf1.getText();
                tf1.setText(temp+"5");
              }
              else{
                  String temp = tf2.getText();
                  tf2.setText(temp+"5");
              }
           }
       });
      b6.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
             if(status == 0){
                String temp = tf1.getText();
                tf1.setText(temp+"6");
              }
              else{
                  String temp = tf2.getText();
                  tf2.setText(temp+"6");
              }
           }
       });
      b7.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
              if(status == 0){
                String temp = tf1.getText();
                tf1.setText(temp+"7");
              }
              else{
                  String temp = tf2.getText();
                  tf2.setText(temp+"7");
              }
           }
       });
      b8.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
              if(status == 0){
                String temp = tf1.getText();
                tf1.setText(temp+"8");
              }
              else{
                  String temp = tf2.getText();
                  tf2.setText(temp+"8");
              }
           }
       });
      
      b9.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
              if(status == 0){
                String temp = tf1.getText();
                tf1.setText(temp+"9");
              }
              else{
                  tf2.setEditable(true);
                  tf1.setEditable(false);
                  String temp = tf2.getText();
                  tf2.setText(temp+"9");
              }
           }
       });
      
      b0.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
              if(status == 0){
                String temp = tf1.getText();
                tf1.setText(temp+"0");
              }
              else{
                  String temp = tf2.getText();
                  tf2.setText(temp+"0");
              }
           }
       });
      
      clrb.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae){
              tf1.setText("");
              tf2.setText("");
              ans.setText("");
              status = 0;
              dpoint1 = 0;
              dpoint2 = 0;
              tf1.setBackground(LIGHT_BLUE);
              tf2.setBackground(Color.WHITE);
           }
       });
        
      
      //toogles the selected textfield 
       toogle.addActionListener(new ActionListener() {  
          @Override
          public void actionPerformed(ActionEvent e) {
              
              if(status == 1){
                  tf1.setBackground(LIGHT_BLUE);              
                  tf2.setBackground(Color.white);
                  status = 0;
              }
              else{
                  tf2.setBackground(LIGHT_BLUE);
                  tf1.setBackground(Color.white);
                  status = 1;
              }
          }
      });
       
       addb.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               String temp = tf1.getText();
               if("".equals(temp)) temp = "0";
               float num1 = Float.valueOf(temp);
               String temp2 = tf2.getText();
               if("".equals(temp2)) temp2 = "0";
               Float num2  = Float.valueOf(temp2);
               Float sum = num1 + num2;
               String s = String.valueOf(sum);
               ans.setText(s);
           }
       });
       
       //Same as above one (addb) but using lamda expression
       
             subb.addActionListener((ActionEvent ae) -> {
                 String temp = tf1.getText();
               if("".equals(temp)) temp = "0";
               float num1 = Float.valueOf(temp);
               String temp2 = tf2.getText();
               if("".equals(temp2)) temp2 = "0";
               Float num2  = Float.valueOf(temp2);
               Float sum = num1 - num2;
               String s = String.valueOf(sum);
               ans.setText(s);
       });
                    
                     mulb.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               String temp = tf1.getText();
               if("".equals(temp)) temp = "0";
               float num1 = Float.valueOf(temp);
               String temp2 = tf2.getText();
               if("".equals(temp2)) temp2 = "0";
               Float num2  = Float.valueOf(temp2);
               Float sum = num1 * num2;
               String s = String.valueOf(sum);
               ans.setText(s);
           }
       });
                     
       divb.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              String temp = tf1.getText();
              if("".equals(temp)) temp = "0";
              //int num1 = Integer.valueOf(temp);
              float num1 = Float.valueOf(temp);
              
              String temp2 = tf2.getText();
              if("".equals(temp2)) temp2 = "1";
              
              float num2 = Float.valueOf(temp2);
              try{
              float sum = num1/num2;
              String s = String.valueOf(sum);
              ans.setText(s);
              }
              catch(Exception err){
                  ans.setText("error");
              }
              
          }
      });

      //Frame description 
      f.setSize(360,450);
      f.setLayout(null);
      f.setVisible(true);
      
      //this makes the [x] symbol in the taskbar functionable to close the run of program
      f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }   
}