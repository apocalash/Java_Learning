//program to check whether the entered password is viable or not
package functions;

import java.util.Scanner;
public class password_check {
    public static final int password_length = 8;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                "1. A password must have at least eight characters.\\n" +
                                "2. A password consists of only letters and digits.\\n" +
                                "3. A password must contain at least two digits \\n" +
                                "Input a password (You are agreeing to the above Terms and Conditions.):""");
        String str = sc.nextLine();
        if(is_valid(str))
            System.out.println(str+" is a valid password");
        else
            System.out.println(str+" is not a valid password");
    }

    private static boolean is_valid(String str) {
        if(str.length()<password_length)
            return false;
        int charCount = 0, numCount =0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(is_numeric(ch))
                numCount++;
            else if(is_letter(ch))
                charCount++;
            else return false;
        }
        return (charCount>=2 && numCount>=2);
    }

    private static boolean is_letter(char ch) {
        ch = Character.toUpperCase(ch);
        return(ch >='A' && ch <='Z');

    }

    private static boolean is_numeric(char ch) {
        return(ch >= '0' && ch<= '9');
    }
}
