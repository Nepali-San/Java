//Program checks if a password is of valid length(>=10)
package password;
import java.util.Scanner;

public class Password {

    
    public static void main(String[] args) {
        Password p = new Password();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password ");
        String pass = scan.next();                          
        if(p.checklength(pass)){
            System.out.println("Password is valid");
        }
        else 
            System.out.println("Invalid password");
    }
    
    boolean checklength(String pass){
        return pass.length() >= 10;
    }
    
}