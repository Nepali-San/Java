
package inheritance;


public class ParentClass {
    ParentClass(){
        System.out.println("Parent constructor called by super()");
    }
    ParentClass(String txt){
        System.out.println("Parent constructor called by " + txt);
    }
    void printParentMethod(){
        System.out.println("Parent method invoked");
    }
    void display(){
     System.out.println("this is display of parent");
 }
}
