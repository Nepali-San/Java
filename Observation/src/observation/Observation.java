
package observation;

//this is a program that was done to check if we include files in single package 
//insted of creating multiple packages


public class Observation {
    Observation(){
        SecondClass second;
        second = new SecondClass(5);
        second.method();
    }
    public static void main(String[] args) {
        Observation observation = new Observation();

    }   
    
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
}