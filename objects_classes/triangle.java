///program to calulcate the area and perimeter of a triangle
package objects_classes;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
class Result{
    int a,b,c;
    public double area(){
        double s = (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
    }

    public double perimeter() {
        return (a+b+c)/2.0;
    }
}

public class triangle {
    public static void main(String[] args){
        Result result = new Result();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a,b,c values");
        result.a=sc.nextInt();
        result.b= sc.nextInt();
        result.c=sc.nextInt();
        System.out.println(result.area());
        System.out.println(result.perimeter());
    }
}
