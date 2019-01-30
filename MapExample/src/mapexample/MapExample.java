package mapexample;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {
 
    public static void main(String[] args) {
       // HashMap<String,String>  hMap = new HashMap();
       // LinkedHashMap<String,String>  hMap = new LinkedHashMap();
        TreeMap<String,String>  hMap = new TreeMap();
        
        hMap.put("Name", "San");
        hMap.put("Age", "20");
        hMap.put("Address", "Butwal");
//      hMap.put(null,"Key is NULL"); //Can't use this for TreeMap
        
//        System.out.println(hMap.get("Name"));
        for(HashMap.Entry m:hMap.entrySet()){
            System.out.println(m.getKey() + " = " + m.getValue());
        }
    }
}
