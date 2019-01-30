//Basic Program that arranges the first and last name.

package Task;
import java.util.Scanner;

public class SomeProject1 {

   
    public static void main(String[] args) {
      String a,b;
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the first and last name : ");
       a = scan.next();
       b = scan.next();
       SomeProject2 s = new SomeProject2();
       s.formatname(a,b);
    }
}
