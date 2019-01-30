
package abstraction;
public class Abstraction {

    public static void main(String[] args) {
       Shape shape;
       shape = new Circle();
       shape.area();
       shape = new Square();
       shape.area();
       shape.printData();
    }
    
}