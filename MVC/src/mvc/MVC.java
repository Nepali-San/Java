/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javax.swing.SwingUtilities;

/**
 *
 * @author San
 */
public class MVC {
   
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                Model model = new Model(0);
                View view = new View("*");   
                Controller controller = new Controller(model,view);
                controller.control();
            }
        
        });
        
    }
    
}
