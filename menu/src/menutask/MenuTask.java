
package menutask;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuTask {
  
    JMenu menu, submenu;
    JMenuItem i1,i2,i3,i4,i5;
    
    MenuTask(){
       JFrame f = new JFrame("Menu");
       JMenuBar mb = new JMenuBar();
       
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
       
       f.setJMenuBar(mb);
       
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
       MenuTask m = new MenuTask();
    }
    
}
