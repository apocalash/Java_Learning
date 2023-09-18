//program to count the no of vowels in a string
package functions;
import java.util.Scanner;
public class vowels_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        System.out.println("vowels in the string are:"+count_vowels(str));
    }

    private static int count_vowels(String str) {
        int count = 0;
        String new_str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)
        {
            if (new_str.charAt(i) == 'a' || new_str.charAt(i) == 'e' || new_str.charAt(i) == 'i'
                    || new_str.charAt(i) == 'o' || new_str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
