package arrays_exercise;

import java.util.Scanner;

public class array_left_rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int[] array = new int[5];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();

        int first, shift =3;
        for (int i =0; i<shift; i++){
            first = array[0];
            int j;
            for(j=0; j<array.length-1;j++){
                array[j] = array[j+1];
            }
            array[j] = first;
        }


        System.out.println();
        for(int i = 0; i < array.length; i++)
             System.out.println(array[i]+" ");
    }
}
