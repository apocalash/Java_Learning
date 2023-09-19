//program to calculate the area of circle and cylinder
package inheritence.circle_cylnd;

class Circle{
     private double radius;
     public Circle(){
         this.radius = radius;
     }
    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Construced a Circle with Circle(radius)");  // for debugging
    }
     public double getRadius(){
         return radius;
     }
     public void setRadius(double radius){
         this.radius = radius;
     }
     public String toSting(){
         return "Circle[radius="+radius+"]";
     }
     public double getArea(){
         return radius*radius*Math.PI;
     }
}

public class Main {
    public static void main(String[] args){
        Cylinder cy1 = new Cylinder();
        System.out.println("Radius is " + cy1.getRadius()
                         + ", Height is " + cy1.getHeight()
                         + ", Base area is " + cy1.getArea());
        Cylinder cy2 = new Cylinder(5.0, 2.0);
        System.out.println("Radius is " + cy2.getRadius()
                         + ", Height is " + cy2.getHeight()
                         + ", Base area is " + cy2.getArea());
    }
}
