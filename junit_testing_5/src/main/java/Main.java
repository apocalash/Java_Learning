
import java.util.Scanner;
class Rectangle{
    private double length;
    private double width;
    private double area;

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getArea(double length, double width){
        return this.length * this.width;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("enter the length & width");
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        rectangle.setLength(length);
        rectangle.setWidth(width);

        System.out.println("The area of the rectangle with length: "+rectangle.getLength()+" and width: "+rectangle.getWidth()+" is = "+rectangle.getArea(length,width));
    }
}
