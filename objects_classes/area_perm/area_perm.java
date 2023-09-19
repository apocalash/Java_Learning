//program to calculate the area and perimeter of circle and rectangle and triangle
package objects_classes.area_perm;
import java.util.Scanner;
public class area_perm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("""
                Enter your choice:
                1.Rectangle
                2.Triangle
                3.Circle
                4.Exit""");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("enter the length and width of the rectangle");
                    double l = sc.nextDouble();
                    double w = sc.nextDouble();
                    Shape rectangle = new Rectangle(l,w);
                    System.out.println("\nRectangle: Length- "+l+", Width- "+w);
                    System.out.println("Area: " + rectangle.getArea());
                    System.out.println("Perimeter: " + rectangle.getPerimeter());
                    System.out.println("\n*****************\n");
                    break;
                case 2:
                    System.out.println("enter sides of the triangle");
                    double s1 = sc.nextDouble();
                    double s2 = sc.nextDouble();
                    double s3 = sc.nextDouble();
                    Shape triangle = new triangle(s1,s2,s3);
                    System.out.println("\nTriangle: Side1-"+s1+", Side2-"+s2+", Side3-"+s3);
                    System.out.println("Area: " + triangle.getArea());
                    System.out.println("Perimeter: " + triangle.getPerimeter());
                    System.out.println("\n*****************\n");
                    break;
                case 3:
                    System.out.println("enter the radius of the circle");
                    double r = sc.nextDouble();
                    Shape circle = new Circle(r);
                    System.out.println("\nCircle: Radius-"+r);
                    System.out.println("Area: " + circle.getArea());
                    System.out.println("Perimeter: " + circle.getPerimeter());
                    System.out.println("\n*****************\n");
                    break;
                case 4:
                    System.out.println("thank you.. exiting!!");
                    System.out.println("\n*****************\n");
                    flag = false;
                    break;
                default:
                    System.out.println("wrong choice, enter again");
                    System.out.println("\n*****************\n");
                    break;

            }
        }






    }
}
