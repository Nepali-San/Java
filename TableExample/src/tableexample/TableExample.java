
package tableexample;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class TableExample {
    JFrame f;
    public TableExample(){
        f = new JFrame();        
        
        String data[][] = {
                            {"1","Ram","9821891898"},
                            {"2","Laxman","8390283829"},
                            {"1","Ram","9821891898"},
                            {"2","Laxman","8390283829"},
                            {"1","Ram","9821891898"},
                            {"2","Laxman","8390283829"},
                            {"1","Ram","9821891898"}
                          };
        String col[] = {"Id","Name","Contact"};
        
        JTable jt = new JTable(data,col);
        jt.setBounds(30,40,250,50);        
        JScrollPane sp=new JScrollPane(jt); 

        f.add(sp);
        
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
                System.exit(0);
            }
            
});
       
        f.setSize(400,400);
//        f.setLayout(null);
        f.setVisible(true);
        
    }

    public static void main(String[] args) {
        new TableExample();
    }
    
}
