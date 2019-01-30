
package string1;

public class String1 {
   
    public static void main(String[] args) {
        
        String abc = "Hello! to all";
        char c   = abc.charAt(4);
        
        System.out.println(c);
        
        System.out.println(abc.replace("all","abc"));
        
        System.out.println(abc.toUpperCase());
        
        System.out.println(abc.toLowerCase());
        
        String t = "  Space at begin and ends  ";
        
        System.out.print("Before trimming : ");
        System.out.println(t);
        
        System.out.print("After trimming : ");
        System.out.println(t.trim());
        
        String[] arr = abc.split(" "); //Splits the string from <space> and puts to array...
        System.out.println(arr[1]);
    }  
}


/* String
  - char.At()
  - replace()
  - toUpper()
  - toLower()
  - Split()
  - Contains()
  - Trim()
*/