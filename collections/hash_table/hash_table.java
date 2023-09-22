package collections.hash_table;

import java.util.HashMap;
import java.util.Map;

class book{
    int id;
    String name, author;
    int qty;
    public book(int id, String name, String author, int qty){
        this.id = id;
        this.name = name;
        this.author = author;
        this.qty = qty;
    }
}
public class hash_table {
    public static void main(String[] args){
        Map<Integer, book> map = new HashMap<>();
        book b1 = new book(101, "hello world","jame e",10);
        book b2 = new book(334, "new day","roman j",9);
        map.put(1,b1);
        map.put(2,b2);

        System.out.println("original table");
        for(Map.Entry<Integer, book> entry : map.entrySet()){
            book b = entry.getValue();
            System.out.println(entry.getKey() +" Details");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.qty);
        }
        System.out.println(" ");

        book b3= new book(455, "new to Uk","UK",67);
        map.putIfAbsent(3,b3);
        System.out.println("table after new entity");
        for(Map.Entry<Integer, book> entry : map.entrySet()){
            book b = entry.getValue();
            System.out.println(entry.getKey() +" Details");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.qty);
        }
    }
}
