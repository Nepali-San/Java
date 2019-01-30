package serialization;
import java.io.*;

public class Serialization {

    
    public static void main(String[] args) throws Exception{
        
    try{
    Student s1 = new Student(1998,"San");
    FileOutputStream fout = new FileOutputStream("f.txt");
    ObjectOutputStream out = new ObjectOutputStream(fout);
    out.writeObject(s1);
    out.flush();
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
    Student s = (Student) in.readObject();
    System.out.println(s.id + " " + s.name);
    }
     catch (IOException e){
        System.out.println(e);
      }
    }
}
