//Program to store data in array of objects

package enscapsulation;
import java.util.Scanner;

public class Enscapsulation {
    
    public static void main(String[] args) {
        
        Scanner j = new Scanner(System.in);
         
        System.out.println("Welcome to Nepathya College");
        System.out.println("Enter the number of students ");
        int num = j.nextInt();
        
        Javabeans obj[];
        obj = new Javabeans[num];
       
        
        for(int i = 0; i < num; i++){
             Scanner s = new Scanner(System.in);
             
             obj[i] = new Javabeans();
                     
            System.out.println("Enter name of student " + (i+1) + " : " );
            String name;
            name = "";
            name = s.nextLine();  //if user inputs nothing then name is by default empty
            
            while(name.isEmpty()){   //Checks if name is empty or not , empty if user didn't gave name
                System.out.println("Name field invalid !!!");
                System.out.println("Enter name of student "+ (i+1) + " : ");
                name = s.nextLine();
            }
                    
            obj[i].setName(name);
            System.out.println("Enter  age of " + name);
            int age = s.nextInt();
            obj[i].setAge(age);
        }
        
        
        System.out.println("\n\nThe datas are: ");
        
        for(int i = 0; i < num ; i++)  
        System.out.println("Age of " + obj[i].getName() + " is " + obj[i].getAge());
       
    }
}
