//program to display the odd and even nos using methods
package functions;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("the number "+number+" is "+even_odd(number));
    }

    public static String even_odd(int number){
        if(number %2==0)
            return "even";
        else
            return "odd";
    }
}
