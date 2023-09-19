package inheritence.circle_cylnd;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        super();
        this.height = height;
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
        System.out.println("constructed a cylinder with height and radius");
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height =height;
    }
}
