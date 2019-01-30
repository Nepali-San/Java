
package prog;

import java.util.Scanner;

public class Prog {

    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Prog obj = new Prog();
        System.out.println("Enter a string"); 
        String str = s.nextLine();
        obj.print(str.split(" "));
    }
    public void print(String[] arrayData){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter index : ");
        System.out.println("Data  = " + arrayData[s.nextInt()]);
    }   
}
