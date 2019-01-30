
//New interface can be created using old interface using extend as in inheritance.

package interfaces;

public final class Interfaces implements NewInterface {  //due to final this cannot be subclassed

    public static void main(String[] args) {
         Interfaces f = new Interfaces();
         f.hello(); //calling using object
         
                    {
                            //         final int d = 3;
                            //         d = 5;  //now i can't change it to 5 similarly i can't change object in case of object ones
                            //         no class can now extend the class Interfaces as it has final
                    }
    }
    
    Interfaces(){
        hello();
        nice();
    }
  

    //Unlike inheritance we must write the block for interface method 
    //Because Interface never haves any method-block in itself, and needs to be overriden to use
    
    @Override  
    public void hello() {
        System.out.println("this is good");
    }

    @Override
    public void nice() {
        System.out.println("this is good part 2");
    }
    
}
