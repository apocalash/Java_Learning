//to find the largest value in a 2d array
package arrays_exercise;
import java.util.Scanner;
public class twoD_array_largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bounds");
        int n = sc.nextInt();
        int[][] two_array = new int[5][5];
        int i, j, pos_i=0,pos_j=0;

        for(i=0;i<n;i++){
            for(j=0; j<n;j++){
                two_array[i][j] = sc.nextInt();
            }
        }
        int max_val = two_array[0][0];
        for(i=0;i<n;i++){
            for(j=0; j<n;j++){
                if(two_array[i][j] > max_val) {
                    max_val = two_array[i][j];
                    pos_i =i;
                    pos_j = j;
                }
                System.out.print(two_array[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("the largest value: "+max_val+" is at position: "+pos_i+" ,"+pos_j);

    }
}
