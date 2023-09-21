//program to sort array using bubble sort or selection sort
package interface_exercise.example3;

import java.util.Scanner;

interface Sort{
    void sort(int[] array);
}

class BubbleSort implements Sort{
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for(int i = 0; i < n-1 ; i++){
            for(int j = 0; j < n-1 ; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("The array after Bubble sort:");
        for(int i =0; i<n;i++)
            System.out.println(array[i]+" ");
    }
}
class SelectionSort implements Sort{
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for(int i = 0; i < n-1; i++){
            int min_index = i;
            for(int j = 0; j<n-1; j++){
                if(array[j] < array[min_index])
                    min_index = j;
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
        System.out.println("The array after Selection sort:");
        for(int i =0; i<n;i++)
            System.out.println(array[i]+" ");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bound");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        System.out.println("enter your sorting method\n1.Bubble Sort\n2.Selection Sort");
        int choice = sc.nextInt();

        SelectionSort sort1 = new SelectionSort();
        BubbleSort sort2 = new BubbleSort();
        switch (choice) {
            case 1:
                sort2.sort(array);
                break;
            case 2:
                sort1.sort(array);
                break;
            default:
                System.out.println("wrong choice...");
        }
    }
}
