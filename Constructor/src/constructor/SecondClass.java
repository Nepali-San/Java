
package constructor;
 
public class SecondClass {
    int i;
    SecondClass(){
    // System.out.println("Default Constructor invoked");   
    System.out.println("Default value of i =  "+ i);
    }
    SecondClass(String data){
        System.out.println("Parametrized  constructor invoked with parameter "+ data);
    }
    SecondClass(int data){
        i = data;
         System.out.println("Default value of i =  "+ i);
    }
   void method(){
       System.out.println("Method invoked");
   }
}
