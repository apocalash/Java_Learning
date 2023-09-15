//program to check if string is palindrome or not
package loops_exercise;
import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String reverse= "";
        int len = string.length();

        for(int i =(len-1); i>=0;--i){
            reverse += string.charAt(i);
        }

        if(string.equalsIgnoreCase(reverse))
            System.out.println("string is palindrome");
        else
            System.out.println("not palindrome");
    }
}
