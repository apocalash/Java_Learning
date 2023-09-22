package collections;
import java.util.*;
public class hash_map {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<Integer, String >();
        map.put(1,"mohan");
        map.put(2,"rohan");
        map.put(3,"sohan");
        for(Map.Entry m: map.entrySet())
            System.out.println(m.getKey() +" "+ m.getValue());
        System.out.println(" ");
        map.replace(2,"xavier");
        for(Map.Entry m: map.entrySet())
            System.out.println(m.getKey() +" "+ m.getValue());
    }
}
