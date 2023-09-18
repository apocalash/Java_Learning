//program to perform matrix multiplication
package arrays_exercise;
import java.util.Scanner;
public class matrix_multpl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bounds");
        int n = sc.nextInt();

        int[][] array_1 = new int[5][5];
        int[][] array_2 = new int[5][5];
        int[][] result = new int[5][5];
        int i,j;

        System.out.println("enter elements of array 1");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                array_1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter elements of array 2");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                array_2[i][j] = sc.nextInt();
            }
        }

        for(i=0; i<n;i++){
            for(j=0;j<n;j++){
                result[i][j] = 0;
                for(int k=0;k<n;k++)
                    result[i][j] = array_1[i][k] * array_2[k][j];
            }
        }
        System.out.println("result:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
