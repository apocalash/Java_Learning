//program to find the middle character in a string
package functions;
import java.util.Scanner;
public class middle_char {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("the middle character in the string "+str+" is: "+mid_char(str));
    }

    private static String mid_char(String str) {
        int pos, len;
        if(str.length()%2==0){
            pos = str.length()/2-1;
            len=2;
        }
        else {
            pos = str.length()/2;
            len=1;
        }
        return str.substring(pos,pos+len);
    }
}
