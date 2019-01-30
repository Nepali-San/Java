package just;
// here we do the work without implementation...
interface I{
    public void name();
    public void age(String name);
}

public class Noimplement {
    
    public static void main(String[] args) {
     I i = new I(){               //here we create object as well as define the interface methods
                                 
         @Override
         public void name(){
             System.out.println("name method of i gives San");
         }
       
         @Override
         public void age(String a){
             System.out.println("Method of i giving " + a);
         }
      };
     
     //now since methods are created any object(i) can inherit them and use 
     //this methods of interface can be made of different property for  each object created
     
     i.age("20");
     i.name();     
      
     I i2 = new I(){  //for object i2 we againg define methods
         @Override
         public void age(String a){
             System.out.println("the age of " + a + " is 20.");
         }

         @Override
        public void name(){
            System.out.println("no name");
        }
     };
     
     i2.age("san");
    }   
  
}
