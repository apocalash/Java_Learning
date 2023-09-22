//program to show the use of try catch block
package exception_handling;
import java.util.Scanner;

public class div_by_zero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int number_1 = sc.nextInt();
        int number_2 = sc.nextInt();

        try{
            int div = number_1 / number_2;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception"+ e.getMessage());
        }
        finally {
            System.out.println("finally block");
        }
    }
}
