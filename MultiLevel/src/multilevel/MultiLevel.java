
package multilevel;


public class MultiLevel {

   
    public static void main(String[] args) {
        GrandChild g = new GrandChild();
        g.childclass(); //can access every method in parent,grandchild,childclass
        
        Child c = new Child();
        c.parentclass();  //can access parent class
        
        Parent p = new Parent();
        p.parentclass();  //this one can only access it's own class methods
    }
    
}
