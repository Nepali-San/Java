
package bankabstraction;

public class BankAbstraction {
   
    public static void main(String[] args) {
       Bank b;
       b = new Janata();
       b.intro();
       b.interest();
       b = new NicAsia();
       b.interest();
    }
}
