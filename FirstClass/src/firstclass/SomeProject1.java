package firstclass;

import java.util.Scanner;                                 //To take the inputs

public class SomeProject1 {
    public static void main (String [] arge){
        SomeProject2 secondaryclass = new SomeProject2(); 
        
        /*Creating object of SomeProject2,
        SomeProject2 and SomeProject1 in same package*/
        
        secondaryclass.printdata();                     // invoking the method of SecondaryClass
        int a = secondaryclass.age;                     // Age from SecondaryClass
        System.out.println(a);
        
        Scanner scanner = new Scanner(System.in);       //Creating object of Scanner
        System.out.print("Enter Your new age  ");      
        a = scanner.nextInt();                          //Taking integer data as input
        System.out.println("Your new age is " + a);
        
        int c , d;
        System.out.println("Enter any two number to calculate their sum ");
        c = scanner.nextInt();
        d = scanner.nextInt();
        int sum = secondaryclass.addition(c,d);
        System.out.println("sum = " + sum);  //+  for concatenation
    }
}
