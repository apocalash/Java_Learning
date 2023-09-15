//finding the duplicate elements in an array
package arrays_exercise;
import java.util.Arrays;
import java.util.Scanner;
public class duplicates_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bound");
        int n = sc.nextInt();
        int[] array = new int[10];
        for(int i = 0; i<n; i++)
            array[i]= sc.nextInt();
        int i, j;
        for(i=0; i<n-1;i++){
            for(j=i+1; j<n;j++){
                if((array[i] == array[j]) && (i !=j))
                    System.out.println(array[j] +"is the duplicated element");
            }
        }
    }
}
