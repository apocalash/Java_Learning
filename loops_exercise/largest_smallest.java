//program to input a sequence of values from user and display the smallest and largest from it
package loops_exercise;
import java.util.Scanner;
public class largest_smallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;
        do{
            System.out.println("enter the number");
            number = sc.nextInt();
            if(number > max)
                max = number;
            if(number<min)
                min = number;
            System.out.println("do you want to continue Y/N");
            choice = sc.next().charAt(0);
        }while(choice=='y' || choice =='Y');

        System.out.println("largest="+max);
        System.out.println("smallest="+min);
    }
}
