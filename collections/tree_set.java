package collections;
import java.util.*;
class Book implements  Comparable <Book>{
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book b) {
      if(id>b.id)
          return 1;
      else if(id<b.id)
          return -1;
      else
          return 0;
    }
}
public class tree_set {
    public static void main(String[] args){
        Set<Book> set = new TreeSet<Book>();
        Book b1 = new Book(101, "welcome to java","shiav m","desmont publication",10);
        Book b2 = new Book(102, "intro to pyton","david Green","new world books",9);
        set.add(b1);
        set.add(b2);
        for(Book b:set)
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);

    }
}
