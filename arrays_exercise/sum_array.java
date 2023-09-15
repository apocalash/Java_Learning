//program to find the sum of all numbers in an array
package arrays_exercise;
import java.util.Scanner;
public class sum_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("enter the bound(n)");
        int n = sc.nextInt();
        int sum =0;
        System.out.println("enter the array values");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)
            sum += array[i];
        System.out.println("sum of array ="+sum);
    }
}
