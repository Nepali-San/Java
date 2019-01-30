
package trycatchfinally;
import java.util.Scanner;

public class TryCatchFinally {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float result;
        int a = 0 , b = 0;
        try{
            
            System.out.println("Enter two numbers :");
            a = s.nextInt();
            b = s.nextInt();
            result = a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Enter an operation to be done on the first input");
            System.out.println("1 to add , 2 to Multiply");
            int opt = s.nextInt();
            System.out.println("Enter new number");
            int num = s.nextInt();
            switch(opt){
                case 1:
                    System.out.println( num + a);
                    break;
                case 2:
                    System.out.println( num * a);
                    break;
            }
        }
    }
}