
package dataabstrationinterface;

public class NicAsia implements Bank, Finance {
    @Override
    public double takeInterest(){
        return 4;
    }
    @Override
    public double getInterest(){
        return 7;
    }
}
