
package doginheritance;

public class DogInheritance {

   
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.cute();   //Property of child
        p.sound(); //this is property of parent inherited by child
        
        Dog d = new Dog();
        d.maturity();  //Property of parent
    }
    
}
