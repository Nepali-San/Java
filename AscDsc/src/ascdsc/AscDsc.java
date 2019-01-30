
package ascdsc;

import java.util.Scanner;

public class AscDsc {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many number to input ? ");
        int n = s.nextInt();
        System.out.println("Enter the numbers");
        int[] data;
        data = new int[10];
        for(int i = 0; i < n; i++){
            data[i] = s.nextInt();
        }
        AscDsc a = new AscDsc();
        a.order(data,n);
    }
    
    public void order(int [] data, int n){
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < n - 1; i++){
            for(int j = i+1; j < n; j++){
                if(data[i] > data[j]){
                    int temp = data[i];
                    data[i]  = data[j];
                    data[j]  = temp;
                }
        }
    }
    System.out.print("Enter mode : 'a' for ascending and 'd' for descending : ");
    String m = s.next();
    if( null == m){
        System.out.println("Invalid input");
    }
    else switch (m) {
            case "a":
                for(int i = 0; i < n; i++){
                    System.out.print(String.format("%d ",data[i]));
                }       break;
            case "d":
                for(int i = n-1; i >= 0; i--){
                    System.out.print(String.format("%d ",data[i]));
                }       break;
            default:
                System.out.println("Invalid input");
                break;
        }
    System.out.println();
    }
 }
