package collections;
import java.util.ArrayList;
import java.util.Scanner;
public class array_list {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bound");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        for(int i =0; i<n;i++)
            list.add(i);
        System.out.println("enter position to add elemnt");
        int pos = sc.nextInt();
        System.out.println("enter element to add");
        int ele = sc.nextInt();
        list.add(pos, ele);
        System.out.println(list);
    }
}
