    
package first_package;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Cart {
    JFrame f = new JFrame();
    
    Cart(){
        
        String col[] = {"Name","Price","Quantity"};  
        DefaultTableModel table = new DefaultTableModel(0,3);
        table.setColumnIdentifiers(col);                                      
        
        JLabel totaL= new JLabel();
        totaL.setBounds(100,250,60,50);
        f.add(totaL);
        
        float tc = 0;
        for(int i = 0; i<10; i++) {
            
            String Name = "Red Bull";
            float  Price = (float) 100.5;
            int Quantity = 5;
            table.addRow(new Object[]{Name,Price,Quantity});
            tc += Price * Quantity;           
        }
        
        totaL.setText(String.valueOf(tc));
        
        JTable tab = new JTable(table);
        
        tab.setSize(200,200);
        tab.setLayout(new FlowLayout());
        tab.setBounds(80,60,50,50);                     
        JScrollPane sp = new JScrollPane(tab);
        sp.setPreferredSize(new Dimension(200, 100));
        
        System.out.println("Your total cost is : " + tc);
        
        f.add(sp);
        f.setSize(400,400);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        Cart cart = new Cart();
    }
    
}
