
package package3;

public class NewWork {
    
    String str;                //Object variable , no need to intialize
    
    public void printer(){     //unintialized variable are either null(for strings) or 0(numbers)
        int age = 0;           //Local variable of a method need to intialize
        System.out.println("Name : "+str);
        System.out.println("Age "+age);
    }
    
    public static void main(String[] args) {
        NewWork s = new NewWork();
        s.printer();
    }
}
