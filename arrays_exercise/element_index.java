//program to find the index of a given element in the array
package arrays_exercise;
import java.util.Scanner;

public class element_index {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bound value");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int[] array = new int[10];
        int pos=0;
        boolean flag = false;
        for(int i = 0; i<n; i++)
            array[i]= sc.nextInt();
        System.out.println("enter the element whose index to find");
        int element = sc.nextInt();
        for(int i = 0; i<n; i++) {
            if (array[i] == element) {
                pos = i;
                flag = true;
            }
        }
        if(flag)
            System.out.println("element " + element+" is found at index "+ pos);
        else
            System.out.println("element not in array");
    }
}
