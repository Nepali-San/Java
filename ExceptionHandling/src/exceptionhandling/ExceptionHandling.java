
package exceptionhandling;

public class ExceptionHandling {

    public static void main(String[] args) {
        try{
        int data = 77/0;
            System.out.println(data);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Hello !!!");
        }
    }
}
