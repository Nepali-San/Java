
package exception2;

public class Exception2 {

    public static void main(String[] args) {
        try{
            int[] a = new int[3];
            a[3] = 12/1;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
