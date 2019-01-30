
package forstatic;

public class SecondClass {
    
    static String college = "Nepathya";
    String student_name;
    String student_address;
    
    SecondClass (){  
    }
   
    SecondClass(String name, String address){
       student_name = name;
       student_address = address;
    }
    
    void printData(){
        System.out.println("Student Name = " + student_name +'\n'+ "Address = " + student_address +'\n'+ "College  = " + college);
    }
    
}
