//program to calculate the prime number sequence till the given number
package loops_exercise;

import java.util.Scanner;
public class nth_prime {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n to compute the nth prime number: ");
        int number = scanner.nextInt();
        int count= 0, num=1, i;
        while(count<number){
            num += 1;
            for(i = 2; i <= num; i++){
                if(num % i == 0)
                    break;
            }
            if(i==num)
                count += 1;
        }
        System.out.println("nth prime number is:"+num);
    }
}
