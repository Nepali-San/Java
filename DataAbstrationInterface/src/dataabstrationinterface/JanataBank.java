
package dataabstrationinterface;

public class JanataBank implements Bank ,Finance{
    @Override
    public double getInterest(){
        return 12;
    }
    @Override
    public double takeInterest(){
        return 5;
    }
}
