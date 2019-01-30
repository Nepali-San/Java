
package ApplyNULL;
import java.util.Scanner;

public class ApplyNull {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number ( 1 - 7):");
        
        String num;
        num = "";
        num = s.nextLine();
        while(num.isEmpty()){
            System.out.println("Field can't be empty, try again...");
            num = s.nextLine();
        }
        switch(num){
            case "1":
                System.out.println("You have entered Sunday");
                break;
            case "2":
                System.out.println("You have entered Monday");
                break;
            case "3":
                System.out.println("You have entered Tuesday");
                break;
            case "4":
                System.out.println("You have entered Wednesday");
                break;
            case "5":
                System.out.println("You have entered Thursday");
                break;
            case "6":
                System.out.println("You have entered Friday");
                break;
            case "7":
                System.out.println("You have entered Saturday");
                break;
            default:
                System.out.println("Invalid input..Try again");
        }
    }
}
