package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    
      public static void main(String[] args) throws IOException{
          FileIO f = new FileIO();
//          f.code1();
          f.code2();
   //       f.code3();

      }
                         // Code - 1 , write data to file //
    public void code1() throws IOException {
        try (FileOutputStream fout = new FileOutputStream("E:\\Test.txt")) {
            fout.write(65);
            fout.close();
            System.out.println("Success...");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
                    // Code - 2 , read the file //
public void code2() throws IOException {
        try (FileOutputStream fout = new FileOutputStream("E:\\Test.txt")) {
    
                        //Write section of program
    
            String data = "this is a test program of file i/o in Java";
            byte[] databyte = data.getBytes();
             fout.write(databyte);
            fout.close();
            System.out.println("Success...");
    
                   //read section of program
    
            FileInputStream fin = new FileInputStream("E:\\Test.txt");
            int r;
            while((r = fin.read()) != -1){
                System.out.print((char)r);
            }
            System.out.println();
        }
        catch(Exception e){  //it catche every kind of exception
            System.out.println(e);
        }
    }
    
            // Code - 3 , read as well as write the data in file  //
    public void code3() throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to file writing system");
        System.out.println("Enter name for file:");
        String name = s.nextLine();
        System.out.println("Enter drive letter:");
        String drive = s.nextLine();
        try (FileOutputStream fout = new FileOutputStream(drive + ":\\" + name + ".txt")) {
            System.out.println("Write the datas");
            String data = s.nextLine();
            byte databyte[] = data.getBytes();
            fout.write(databyte);
            System.out.println("Success\nDo you want to read the file, if yes enter y of Y enter any others key to  exit");
            
            String opt;
            opt = s.next();
            
            if("Y".equals(opt) || "y".equals(opt)){
              FileInputStream fin = new FileInputStream(drive + ":\\" + name + ".txt");
              
                  int r;
                  while((r = fin.read()) != -1){
                    System.out.print((char)r);
                    }
                  
                System.out.println();
            } else {
                System.out.println("Thank You !!!");   
        }
     }
        catch (FileNotFoundException E){ //If we know the exception that may occur
            System.out.println(E);
        }
         catch (NullPointerException E){
            System.out.println(E);
        }
    }
}