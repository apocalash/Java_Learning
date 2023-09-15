//finding the difference between the smallest and largest values in an array
package arrays_exercise;
import java.util.Scanner;
public class diff_btw {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bound");
        int n = sc.nextInt();
        int[] array = new int[10];
        for(int i = 0; i<n; i++)
            array[i]= sc.nextInt();
        int max_val = array[0];
        int min_val =  array[0];
        for(int i =0; i<n;i++){
            if(array[i] >max_val)
                max_val = array[i];
            else if(array[i] < min_val)
                min_val = array[i];
        }
        System.out.println("difference between the largest: "+max_val+" and the smallest: "+min_val+" is="+(max_val-min_val));
    }
}
