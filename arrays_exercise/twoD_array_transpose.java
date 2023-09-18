//program to print the transpose of the matrix
package arrays_exercise;
import java.util.Scanner;
public class twoD_array_transpose {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bound");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int[][] two_array = new int[5][5];
        int i, j, pos_i=0,pos_j=0;

        for(i=0;i<n;i++){
            for(j=0; j<n;j++){
                two_array[i][j] = sc.nextInt();
            }
        }

        System.out.println("before transpose");
        for(i=0; i<n;i++){
            for(j=0; j<n;j++)
                System.out.print(two_array[i][j] + " ");
            System.out.println();
        }

        int[][] new_array = new int[5][5];
        for(i=0; i<n;i++){
            for(j=0; j<n;j++)
               new_array[j][i] = two_array[i][j];
        }

        System.out.println("after transpose");
        for(i=0; i<n;i++){
            for(j=0; j<n;j++)
                System.out.print(new_array[i][j] + " ");
            System.out.println();
        }


    }

}
