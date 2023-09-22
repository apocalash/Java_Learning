//program to show the use of hash set collection and removing elements from it
package collections;

import java.util.HashSet;

public class hash_set {
    public static void main(String[] args){
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements: "+set);

        set.remove("Ravi");
        System.out.println("After invoking remove(object) method: "+set);

        HashSet<String> set1=new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: "+set);

        //removes all the elements added from set1
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);

        //Removing elements on the basis of specified condition
        set.removeIf(str->str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: "+set);

        //Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: "+set);
    }
}
