package menu2;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;

import java.awt.event.*;
import javax.swing.*;

public class Menu2 implements ActionListener{
  
    JMenu menu, submenu;
    JMenuItem i1,i2,i3,i4,i5;
    JLabel l;
    
    Menu2(){
       JFrame f = new JFrame("Menu");
       JMenuBar mb = new JMenuBar();
       l = new JLabel("Click Menu");
       l.setBounds(100,100,150,30);
       f.add(l);
       menu = new JMenu("Menu");
       submenu = new JMenu("Sub-Menu");
       
       i1 = new JMenuItem("Item 1");
       i2 = new JMenuItem("Item 2");
       i3 = new JMenuItem("Item 3");
       i4 = new JMenuItem("Item 4");
       i5 = new JMenuItem("Item 5");
       
       menu.add(i1);
       menu.add(i2);
       menu.add(i3);  
       submenu.add(i4);
       submenu.add(i5);       
       menu.add(submenu);
       mb.add(menu);              
              
       
       f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
       
       
       i1.addActionListener(this);
       i2.addActionListener(this);
       i3.addActionListener(this);
       i4.addActionListener(this);
       i5.addActionListener(this);
       
       f.setJMenuBar(mb);      
       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);
       
    }
    
    public static void main(String[] args) {       
        Menu2 m = new Menu2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == i1){
           l.setText("item 1 clicked");
       }
       else if(e.getSource() == i2){
           l.setText("item 2 clicked");
       }
       else if(e.getSource() == i3){
           l.setText("item 3 clicked");
       }
       else if(e.getSource() == i4){
           l.setText("item 4 clicked");
       }
       else if(e.getSource() == i5){
           l.setText("item 5 clicked");
       }
       
    }    
}
