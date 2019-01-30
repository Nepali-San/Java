
package interfaces;

public interface NewInterface {
    //Interface gives 100 percent data hiding
    void hello();       
    void nice();
}

/*

//In inheritace we may or maynot hide the method body as follow
//hence it may give 0 to 100 percent of data hiding

public class Newclass{
    public void hello(){                          //not hidden
        System.out.println("this is good");
    }
    abstract void nice();                          //hidden
}

*/