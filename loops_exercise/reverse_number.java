//input a number and reverse it. check if number palindrome or not
package loops_exercise;
import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        int rem, sum =0, number_copy = number;
        while(number>0){
            rem = number%10;
            sum = (sum*10) + rem;
            number = number/10;
        }
        if(number_copy == sum)
            System.out.println("Equal");
        else
            System.out.println("NOT equal");
    }
}
