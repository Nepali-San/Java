
package mainclass;

public class Class1 {
   public  void classone(){
       //Class1 c = new Class1();  //may call through the object else dirctly
       System.out.println("Inside Class one");
       classtwo();     //or c.classtwo();  //Calls classtwo method of this same class
   }
   public void classtwo(){
       System.out.println("Inside Class Two");
   }
}
