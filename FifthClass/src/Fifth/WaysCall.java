package Fifth;

public class WaysCall {

   
    public static void main(String[] args) {
//  WaysCall j = new WaysCall(); 

// since both are static we may call directly...
/*if both are not static then  use the object to invoke the method*/

       add(1, 5);
    }
    public static void add(int a , int b){ //Both are static 
        System.out.println(a+b);
    }
    
}
