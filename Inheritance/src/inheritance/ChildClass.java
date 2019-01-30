
package inheritance;

public class ChildClass extends ParentClass{
    ChildClass(){
        super();   //calls it's parent's constructor
        System.out.println("child constructor called");
    }
 void printChildMethod(){
     
     System.out.println("Child method invoked");
     
 }  
    @Override
 void display(){
     super.display();        //invoking the method of parent/superclass .
     //super.display(param)  //Use super inside the childclass for parametrized ones
     System.out.println("this is display of child");
 }
}
