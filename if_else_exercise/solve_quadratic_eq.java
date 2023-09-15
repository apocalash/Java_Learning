// program to input the a, b, c values and compute the roots of the quadractic eq based on the formula - (-b +-(sq.root(b*b - 4*a*c)))/2*a
package if_else_exercise;
import java.util.Scanner;

public class solve_quadratic_eq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();;
        System.out.println("c");
        int c = sc.nextInt();

        double under_root = b*b - 4.0*a*c;

        if(under_root >0.0D){
            double r1 = ((-b + Math.sqrt(under_root)) / 2.0*a);
            double r2 =  ((-b - Math.sqrt(under_root)) / 2.0*a);
            System.out.println("roots are:"+r1+","+r2);
        }
        else if (under_root == 0.0D){
            double r1 = -b / (2.0*a);
            System.out.println("root is:"+ r1);
        }
        else
            System.out.println("eq has no roots");
    }
}
