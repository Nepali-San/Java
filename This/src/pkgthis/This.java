
package pkgthis;

public class This {
    int x = 11;
    int y = 22;
  
    public static void main(String[] args) {
        This t = new This();
        System.out.println(t.x);  //to access object variable inside static function use object of class
        t.call(5);
        System.out.println(t.x);
        System.out.println(t.y);
    }
    public void call(int x){
        
        this.x = y;  //Assigning value of obj variable y to obj variable x
        y = x;  //object variable y is assigned with local variable x 
    }
    
}
