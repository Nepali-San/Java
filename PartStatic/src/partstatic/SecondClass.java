
package partstatic;

public class SecondClass {
    static int scount;
    int count;
    SecondClass(){
        scount++;
        count++;
        System.out.println("Static count = " + scount + '\n' + "normal count = " + count);
        System.out.println();
    }
}
