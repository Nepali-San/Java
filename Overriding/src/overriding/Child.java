
package overriding;


public class Child extends Parent{
    @Override
    public void add(int x ,int y){
        System.out.println("Child sum = "+ (x + y));
    }
}
