//program to calculate lcm of 2 numbers
package loops_exercise;
import java.util.Scanner;
public class lcm_calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int x,y,rem,sum=0;
        if(number1>number2){
            x = number1;
            y = number2;
        }
        else {
            x = number2;
            y = number1;
        }

        rem = x%y;
        while(rem>0){
            x = y;
            y = rem;
            rem = x %y;
        }
        int lcm = number1 * number2 / y;
        System.out.println("LCM="+lcm);
    }
}
