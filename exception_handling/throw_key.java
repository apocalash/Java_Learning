//program to show the use of throw keyword
package exception_handling;
import java.util.Scanner;
public class throw_key {
    static void check_age(int age){
        if(age<18)
            throw new ArithmeticException("Age below mandatory requirement!");
        else
            System.out.println("access granted");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        check_age(age);
    }
}
