//Program checks if the 3 digits after the decimal points are equal or not.
package sameornot;
import java.util.Scanner;

public class Sameornot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        double num1,num2;
        num1 = s.nextDouble();
        num2 = s.nextDouble();
        
        double a = num1 - (int) (num1);
        a*= 1000;
        double b = num2 - (int) (num2);
        b*= 1000;
        
        //System.out.println("a = " + (int)a + " b = " + (int)2.b);
        
        if((int)a == (int)b){
            System.out.println("Same");
        }
        else 
            System.out.println("Not same");
    }
}