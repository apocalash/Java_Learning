//program to input a floating value and check if it is positive or negative; is value is less than 1, add small and if larger than 1,000,000 add large
package if_else_exercise;
import java.util.Scanner;
public class pos_neg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        if(number>=0.0F){
            if(number<1.0F)
                System.out.println("Small positive number");
            else if(number>1000000.0F)
                System.out.println("Large Positive number");
            else
                System.out.println("Positive number");
        }
        else if(number<0.0F){
            if(Math.abs(number) <1.0F)
                System.out.println("Small negative number");
            else if(Math.abs(number)>1000000.0F)
                System.out.println("large negative number");
            else
                System.out.println("Negative Number");
        }
    }
}
