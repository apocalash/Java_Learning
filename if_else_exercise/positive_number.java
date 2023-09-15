//program to input value from user and determine if positive or not
package if_else_exercise;
import java.util.Scanner;

public class positive_number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>=0)
            System.out.println("Number is positive");
        else
            System.out.println("Number is negative");
    }
}
