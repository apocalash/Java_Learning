//program to check if given number is a multiple of 5 or not
package if_else_exercise;
import java.util.Scanner;
public class multiples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 5 == 0)
            System.out.println("number "+number+" is a multiple of 5");
        else
            System.out.println("number"+number+"is not a multiple of 5");
    }
}
