/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author San
 */
public class Controller {
    private Model model;
    private View view;
    private ActionListener actionListener;
    
    public Controller(){}
    
    public Controller(Model model, View view){
        this.model = model;
        this.view  = view;        
    }
    
    public void control(){
        actionListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                linkBtnAndLabel();
            }
        }; 
        
        view.getButton().addActionListener(actionListener);
    }
    private void linkBtnAndLabel(){
        model.incX();
        view.setText(Integer.toString(model.getX()));
    }
}
