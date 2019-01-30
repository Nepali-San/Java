package bufferio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferIO {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         System.out.println("Write something about yourself");
         BufferedOutputStream bStream = new BufferedOutputStream(new FileOutputStream("D:\\test.txt"));
         Scanner s = new Scanner(System.in);
         String sentence = s.nextLine();
      
         bStream.write(sentence.getBytes());
         bStream.flush();
         BufferedInputStream bin = new BufferedInputStream(new FileInputStream("D:\\test.txt"));
          int r;
         while((r = bin.read()) != -1){
            System.out.print((char)r);
        }
        System.out.println();
    }  
}
