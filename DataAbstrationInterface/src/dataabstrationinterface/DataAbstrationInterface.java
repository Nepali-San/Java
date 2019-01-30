
package dataabstrationinterface;


public class DataAbstrationInterface {

    public static void main(String[] args) {
        
        Bank bank;
        Finance finance;
        
        bank = new JanataBank();
        finance = new JanataBank();
        System.out.println("Janata bank gives interest of "+ bank.getInterest() );
        System.out.println("Janata bank takes interest of " + finance.takeInterest());
         
        bank = new NicAsia();
        finance = new NicAsia();
        System.out.println("Nic Asia bank gives interest of "+ bank.getInterest() );
        System.out.println("Nic Asia bank takes interest of " + finance.takeInterest());
    }
    
}
