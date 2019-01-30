
package inheritance;

public class Inheritance {

    public void Mymethod(){
        ChildClass obj = new ChildClass();  //calls childclass then childclass call parentclass using super()
        
        obj.printParentMethod();                       //Access parentmethod by child
        obj.printChildMethod();                        //Actual method of child
        
        ParentClass p = new ParentClass("parent object");  //Access parent method by parent
        p.printParentMethod();
        //here with p we can invoke only the methods of parent
        obj.display();
              
    }
    public static void main(String[] args) {
        Inheritance n = new Inheritance();
        n.Mymethod();
    }
    
}
