
package nestredtry;

public class NestredTry {

    public static void main(String[] args) {
        //Nested parent try-catch
        try{
            //Nested first try-catch block
            int b = 5/1;                      //<- Handled by parent try
            try{
                int a = 30/0;
                System.out.println(a);
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            //Nested second try-catch block
            try{
                int a[] = new int[3];
                System.out.println(a[2]);
                a[3] = 14/2;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is a final block");
        }
    }
    
}
