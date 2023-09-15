//program to find all the leaders in an array; leaders are values greater than the values to their right
package arrays_exercise;
import java.util.Scanner;
public class leaders_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bound value");
        int n = sc.nextInt();
        int[] array = new int[10];
        System.out.println("enter array elements");
        int i, j;
        for (i = 0; i < n; i++)
            array[i] = sc.nextInt();
        int len = array.length;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (array[i] <= array[j])
                    break;
            }
            if (j == n)
                System.out.print(array[i]+" ");
        }
    }
}