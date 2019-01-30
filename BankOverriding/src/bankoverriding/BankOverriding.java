package bankoverriding;

public class BankOverriding {

    public static void main(String[] args) {
        
//        Janata j = new Janata();        //
//        System.out.println(j.interest());
//        NMB n=new NMB();
//        System.out.println(n.interest());
//        NIC i=new NIC();
//        System.out.println(i.interest());

 //Upcasting
           Bank bank;      
           bank=new Janata();
           System.out.println(bank.interest());
           bank=new NMB();
           System.out.println(bank.interest());
           bank=new NIC();
           System.out.println(bank.interest());
   }
}